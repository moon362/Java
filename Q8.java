import java.util.Scanner;

public class Q8 {
   static boolean has44(int arr[],int n)
    {
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]==4)
            {
                if(arr[i+1]==4)return true;
            }
        }

        return false;
    }

    public static  void main(String[]arhgs)
    {
        int arr_size;
        Scanner in=new Scanner(System.in);
        arr_size=in.nextInt();
        int []arr=new int[arr_size];
        for(int i=0;i<arr_size;i++)
        {
            arr[i]=in.nextInt();
        }
        boolean flag= has44(arr,arr_size);
        System.out.println(flag);
    }
}
