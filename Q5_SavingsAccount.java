public class Q5_SavingsAccount extends Q5_Account {

    public Q5_SavingsAccount(int acc_number, double acc_balance) {
        this.acc_balance = acc_balance;
        this.acc_number = acc_number;

    }

    void interest() {
        acc_balance += acc_balance * 0.1;
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
