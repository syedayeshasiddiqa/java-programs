import java.util.Scanner;
public class Program {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values");
        int n=sc.nextInt();
        double i=sc.nextDouble();
        sc.nextLine();
        String t=sc.nextLine();
        sc.close();
        System.out.println("Integer:" +n);
        System.out.println("Double:" +i);
        System.out.println("String:" +t);
    }
}