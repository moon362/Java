import java.util.Scanner;

public class Q5_Tester {
    public static void main(String[]args)
    {
       int choice;
       Scanner in=new Scanner(System.in);
        System.out.println("Type 1 for Savings account 2 for Current Account");
        choice=in.nextInt();
        if(choice==1){
            int ac_number;
            double ac_balance;
            System.out.println("Input your account number ");
            ac_number=in.nextInt();
            System.out.println("Input your account balance");
            ac_balance=in.nextDouble();
            Q5_SavingsAccount s=new Q5_SavingsAccount(ac_number,ac_balance);
            s.interest();
            System.out.println("Your account number= "+s.acc_number);
            System.out.printf("Your account balance= %.2f",s.acc_balance);
        }
        else if(choice==2)
        {
            int ac_number;
            double ac_balance;
            System.out.println("Input your account number ");
            ac_number=in.nextInt();
            System.out.println("Input your account balance");
            ac_balance=in.nextDouble();
            Q5_CurrentAccount s=new Q5_CurrentAccount(ac_number,ac_balance);
            s.interest();
            System.out.println("Your account number= "+s.acc_number);
            System.out.printf("Your account balance= %.2f",s.acc_balance);

        }
    }
}
