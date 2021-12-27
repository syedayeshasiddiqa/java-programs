import java.util.Scanner;
public class Data
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values");
        int n=sc.nextInt();
        Double i=sc.nextDouble();
        String t=sc.nextLine();
        System.out.println("Integer:" +n);
        System.out.println("Double:" +i);
        System.out.println("String:" +t);
    }
}