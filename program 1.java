import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();
        String str = A.length() + B.length();
        System.out.println(str);
        if (A.compareTo(B) > 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
            String a = A.substring(0, 1).toUpperCase() + A.substring(1) + B.substring(0, 1).toUpperCase()
                    + B.substring(1);
            System.out.println(a);
        }

    }
}