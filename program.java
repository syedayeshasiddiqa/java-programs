import java.util.Scanner;
class Condition 
{
    public static void main(String[] args) 
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter any number:");
     int n=sc.nextInt();
     if (n%2==0)
     {
         System.out.println("Weird");
     }
     else if(2<=n && n<=5)
    {
        System.out.println("Not weird");
    }
    else if(6<=n && n<=20)
    {
    System.out.println("weird");
    } 
    else if(n>20) 
    {
    System.out.println("Not Weird");
   }
 }
}  

    

