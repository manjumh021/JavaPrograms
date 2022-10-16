
public class Account {

    private String accHolderName;
    private int accountNumber;
    private int  deposit;
    public Account(String name,int accountNo){
        this.accHolderName = name;
        this.accountNumber = accountNo;
        // this.deposit = dep;
    }
    public String getAccHolderName() {
        return this.accHolderName;
    }
    public int getAccNumber() {
        return this.accountNumber;
    }
    public int getDeposit() {
        return this.deposit;
    }
    public void setDeposit(int leftAmt) {
        this.deposit = leftAmt;
        System.out.println("current:"+this.deposit);
    }
    public int withdraw(int amount){
        if((this.deposit-amount)>=0){
            this.deposit = this.deposit - amount;
            System.out.printf("%d amount withdrawed %d amount left.",amount,this.deposit);
            System.out.println("current:"+this.deposit);
        }
        else{
            System.out.printf("%d amount exceeded than deposit",amount);
            System.out.println();
        }
        return this.deposit;
    }
    
}