import java.io.*;
import java.util.*;
public class Test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        String B=sc.nextLine();
        //String C=A+B;
        //System.out.println(C.length());
        if(A.equals(B)){
            System.out.println("yes");
        }else{
             System.out.println("no");
         }
         System.out.print(A.substring(0,1).toUpperCase()+A.substring(1).toLowerCase()+" ");
         System.out.print(B.substring(0,1).toUpperCase()+B.substring(1).toLowerCase()+" ");  
    }
}      
