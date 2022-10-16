/*
Modify class Account to provide a method called debit that withdraws money
from an Account. Ensure that the debit amount does not exceed the Account’s
balance. If it does, the balance should be left unchanged and the method
should print a message indicating ―Debit amount exceeded account balance.
Modify class AccountTest to test method debit.
*/

import java.util.Scanner;

public class Bank {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Bank canara = new Bank();
        canara.manageAccount();
    }
    
	public void showOptions(){
		System.out.println("1. account details" +
                    "\n2. withdraw " +
					"\n3. add amount " +
                    "\n4. Exit" +
                    "\nEnter Option:");
	}
    
    public void accDetails(Account account) {
		System.out.println("Name:"+ account.getAccHolderName());
        System.out.println("Acc Number: " + account.getAccNumber());
        System.out.println("Deposit: " + account.getDeposit());
        System.out.println();
    }
	
	public void manageAccount(){
		boolean isContinue = true;
		while(isContinue){
			this.showOptions();
            int option = sc.nextInt();
            System.out.println();
            Account account = new Account("Manju",123);
			switch (option) {
				case 1:
					this.accDetails(account);
					break;
				case 2:
                    System.out.print("Enter amount: ");
                    int amount = sc.nextInt();
					int leftDeposit = account.withdraw(amount);
					account.setDeposit(leftDeposit);
					break;
				case 3:
                    System.out.print("Enter amount: ");
                    int depAmount = sc.nextInt();
					account.setDeposit(depAmount);
					break;
				case 4:
					isContinue = false;
					System.out.println("Exit");
                    break;
				default:
					System.out.println("Please Enter Valid Input");
			}
		}
	}
}