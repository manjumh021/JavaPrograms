
public class Account {

    private String accHolderName;
    private int accountNumber;
    private int  deposit;
    public Account(String name,int accountNo){
        accHolderName = name;
        accountNumber = accountNo;
        // deposit = dep;
    }
    public String getAccHolderName() {
        return accHolderName;
    }
    public int getAccNumber() {
        return accountNumber;
    }
    public int getDeposit() {
        return deposit;
    }
    public void setDeposit(int leftAmt) {
        deposit = deposit+ leftAmt;
        System.out.println("current:"+deposit);
    }
    public int withdraw(int amount){
        if((deposit-amount)>=0){
            deposit = deposit - amount;
            System.out.printf("%d amount withdrawed %d amount left.",amount,deposit);
            System.out.println("current:"+deposit);
        }
        else{
            System.out.printf("%d amount exceeded than deposit",amount);
            System.out.println();
        }
        return deposit;
    }
    
}