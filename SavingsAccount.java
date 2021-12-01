























































import java.util.Scanner;

public class SavingsAccount {
    // States
    String accountNumber; 
    String ifscCode;
    String bankName;
    String branchName;
    String accountHolderName;
    double availableBalance;
    String accountType;
    int atmPin;

    // Methods
    public double getAvailableBalance(){
        return this.availableBalance;
    }

    public void withdrawal(double amount){
        if(this.availableBalance > amount){
             this.availableBalance = this.availableBalance  - amount;
             System.out.println("Withdrawal of Rs : "+ amount+" successfull!");
             System.out.println("Available balance : Rs: "+ this.availableBalance);
        } else {
            System.out.println("Insuffient Funds!!");
        }
    }

    public void deposit(double amount){
        if(amount > 0){
            this.availableBalance = this.availableBalance + amount;
            System.out.println("Deposit of Rs : "+ amount+" successfull!");
            System.out.println("Available balance : Rs: "+ this.availableBalance);
        }else{
            System.out.println("Invalid Amount!");
        }
    }

    public void changePin(){
        System.out.println("Enter the old pin: ");
        Scanner scan = new Scanner(System.in);
        int userpin = scan.nextInt();
        if(this.atmPin == userpin){
            System.out.println("Enter New PIN: ");
            this.atmPin = scan.nextInt();
            System.out.println("New Pin ["+ this.atmPin +"]Set Successfully ! ");
        }else {
            System.out.println("Incorrect Pin!!");
        }
        scan.close();
    }

    public void changePassword(){

    }
    public SavingsAccount(String accountNumber, String ifscCode, String bankName, String branchName, String accountHolderName, double availableBalance, String accountType, int atmPin){
        this.accountNumber = accountNumber;
        this.ifscCode = ifscCode;
        this.bankName = bankName;
        this.branchName = branchName;
        this.accountHolderName = accountHolderName;
        this.availableBalance = availableBalance;
        this.accountType = accountType;
        this.atmPin = atmPin;
    } 


    public static void main(String[] args){
        
        SavingsAccount s1 = new SavingsAccount("123456", "UTIB0023", "Axis Bank", "Coimbatore", "Naveen", 100000.0, "Premium", 1234);

        System.out.println(s1.availableBalance);
        s1.changePin();

    }
}
