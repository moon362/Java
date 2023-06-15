import java.util.ArrayList;

public class Q7 {
    public  static void main(String[]args)
    {
        ArrayList<Double>ar=new ArrayList<>();

        ar.add(12.34);
        ar.add(34.5);
        ar.add(5.6);
        ar.add(7.89);
        ar.add(10.12);
        ar.add(3.45);
        for(int i=0;i<ar.size();i++)
        {
            System.out.print(ar.get(i)+" ");
        }
        System.out.println();
        ar.remove(5.6);
        ar.remove(10.12);
        for(int i=0;i<ar.size();i++)
        {
            System.out.print(ar.get(i)+" ");
        }
    }
}
