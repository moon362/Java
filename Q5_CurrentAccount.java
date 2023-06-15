public class Q5_CurrentAccount extends  Q5_Account{
    public  Q5_CurrentAccount(int acc_number,double acc_balance)
    {
        this.acc_number=acc_number;
        this.acc_balance=acc_balance;
    }
    void interest()
    {
        acc_balance += acc_number *0.06 ;
    }
    void deposit(double balance)
    {
        acc_balance+=balance;
    }
    void withdraw(double balance)
    {
        acc_balance-=balance;
    }
}
