import java.util.Scanner;

public class BankFundsCheck {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your Bank balance: ");
        int bankBal = reader.nextInt(); //collecting integer value

        if (bankBal == 0){
            System.out.println("You have no funds in your Bank Account");
        } else if (bankBal <0) {
            System.out.println("WARNING: You are using your overdraft");
        } else if (bankBal >0 && bankBal <85000) {
            System.out.println("Your funds are protected");
        } else if (bankBal>85000) {
            System.out.println("You have too much money in this account, open another to split funds to be protected.");
        }
    }
}
