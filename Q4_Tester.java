import java.util.Scanner;

public class Q4_Tester {
    public static  void main(String[]args)
    {
        int n;
        Scanner in=new Scanner(System.in);
        System.out.println("Input total number of studnets");
        n=in.nextInt();
        Q4_Student [] s=new Q4_Student[n];
        for(int i=0;i<n;i++)
        {
            String name;
            String date_of_birth;
            char gender;
            double cg;
            System.out.println("Input your name:");
            String token1=in.nextLine();
            name=in.nextLine();

            System.out.println("Input your birthd date by dd/mm/year");
            date_of_birth=in.nextLine();


            System.out.println("Input gender if male input M else if female inpt F");
            gender=in.next().charAt(0);
            System.out.println("input cgpa");
            cg=in.nextDouble();


            s[i]=new Q4_Student(name,gender,date_of_birth,cg);



        }

        for (int i=0;i<n;i++)
        {
            System.out.println("Student "+i+1+" infromation");
            s[i].display();
        }
    }

}
