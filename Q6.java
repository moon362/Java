import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Q6 {
    public static void main(String[]args)
    {
        try{
            File file1=new File("Score.txt");
            if(!file1.exists())
            {
                file1.createNewFile();
            }
            FileWriter writer=new FileWriter(file1);
            BufferedWriter bufferedWriter=new BufferedWriter(writer);
            bufferedWriter.write("ID\t  Score");
            bufferedWriter.newLine();
            int n;
            Scanner input=new Scanner(System.in);
            System.out.println("Input Total number of students ");
            n=input.nextInt();
            for(int i=0;i<n;i++)
            {
                String s,s1;
                System.out.println("input id");
                s=input.next();
                System.out.println("input score");
                s1=input.next();
                bufferedWriter.write(s);
                bufferedWriter.write("\t");
                bufferedWriter.write(s1);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            writer.close();
            FileReader reader=new FileReader(file1);
            BufferedReader reader1=new BufferedReader(reader);
            String line;
            int i=0;
            ArrayList<Integer>arint=new ArrayList<>();
            ArrayList<Double>arrdouble=new ArrayList<>();
            Double total=0.0;
            while((line= reader1.readLine())!=null)
            {
                i++;
                if(i==1)continue;
                String []arr=line.split("\t");
                int a=Integer.parseInt(arr[0]);
                double b=Double.parseDouble(arr[1]);
                total+=b;
                arint.add(a);
                arrdouble.add(b);





            }
            reader1.close();
            reader.close();
            i--;
            total=total/i;

            System.out.println("Average score: "+total);
            System.out.println("Id's of students scored above average score");
            for(int j=0;j<i;j++)
            {
                if(arrdouble.get(j)>total){
                    System.out.println(arint.get(j));
                }
            }
            FileWriter writer1=new FileWriter(file1,true);
            bufferedWriter=new BufferedWriter(writer1);
            System.out.println("Total number of new student");
            n=input.nextInt();
            for(int j=0;j<n;j++)
            {
                String s,s1;
                System.out.println("input id");
                s=input.next();
                System.out.println("input score");
                s1=input.next();
                bufferedWriter.write(s);
                bufferedWriter.write("\t");
                bufferedWriter.write(s1);
                bufferedWriter.newLine();

            }
            bufferedWriter.close();
            writer1.close();



        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
