import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = input.next();

        StringBuffer s1 = new StringBuffer(s);
        String s2 = s1.reverse().toString();

        if(s.equalsIgnoreCase(s2))
            System.out.println("This String is a palindrome");
        else
            System.out.println("This String is not a palindrome");

    }
}