/*
1. Stock Account Management
a. Desc -> Write a program to read in Stock Names, Number of Share, Share Price.
Print a Stock Report with the total value of each Stock and the total value of
Stock.
b. I/P -> N number of Stocks, for Each Stock Read In the Share Name, Number of
Share, and Share Price
c. Logic -> Calculate the value of each stock and the total value
d. O/P -> Print the Stock Report.
e. Hint -> Create Stock and Stock Portfolio Class holding the list of Stocks read
from the input file. Have functions in the Class to calculate the value of each
stock and the value of total stocks.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StockManager {
    private static Scanner sc = new Scanner(System.in);
    private List<StockDetails> stocks = new ArrayList<>();

	public void showOptions(){
		System.out.println("1. Add Share" +
                    "\n2. Edit Share" +
                    "\n3. Delete share" +
                    "\n4. Show shares" +
                    "\n5. Exit" +
                    "\nEnter Option:");
	}
	public void addShare() {
		StockDetails share_obj = new StockDetails();
        this.setAttributes(share_obj);
        stocks.add(share_obj);
    }
	public void setAttributes(StockDetails share_obj){
		
		System.out.print("Enter Share Name: ");
		share_obj.stockName = sc.next();
        System.out.print("Enter share price: ");
        share_obj.stockPrice = sc.nextFloat();
        System.out.print("Enter no of units: ");
        share_obj.stockUnits = sc.nextInt();
	}
    public void editShare() {
        System.out.print("Please Enter share Name: ");
        String name = sc.next();
        StockDetails stock = findStock(name);
        if (stock != null) {
            this.setAttributes(stock);
        }
        else {
            System.out.println("No stock found with the entered name");
        }
    }
    public void deleteShare() {
        System.out.print("Enter share Name:");
        String name = sc.next();
        StockDetails stock = this.findStock(name);
        if (stock != null) {
            System.out.println("Found the entry and removing");
            stocks.remove(stock);
        }
        else {
            System.out.println("No StockDetails found");
        }
    }
    public void showStocks() {
        for(int i = 0; i < stocks.size(); i++) {
            System.out.println();
            System.out.println("Stock Name:  "+ stocks.get(i).getStockName());
            System.out.println("Stock Price: "+ stocks.get(i).getStockPrice());
            System.out.println("Stock Units: "+ stocks.get(i).getStockUnits());
            System.out.println("Total Price: "+ stocks.get(i).getTotalPrice());
            System.out.println();
        }
    }
    public StockDetails findStock(String name){
        StockDetails stock = null;
        for(int i = 0; i < stocks.size(); i++) {
            if(name.equals(stocks.get(i).getStockName())) {
                break;
            }
        }
        return stock;
    }
	public void manageStocks(){
		boolean isContinue = true;
		while(isContinue){
			this.showOptions();
            int option = sc.nextInt();
            System.out.println();
			switch (option) {
				case 1:
					this.addShare();
					break;
				case 2:
					this.editShare();
					break;
				case 3:
					this.deleteShare();
					break;
				case 4:
					this.showStocks();
					break;
				case 5:
					isContinue = false;
					System.out.println("Exit");
                    break;
				default:
					System.out.println("Please Enter Valid Input");
			}
		}
	}
    public static void main(String[] args) {
        StockManager ledger = new StockManager();
        ledger.manageStocks();
    }
}