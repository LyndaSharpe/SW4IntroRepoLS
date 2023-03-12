import java.util.Scanner; //import Scanner function

public class SumNumbers {
    public static void main(String[] args) {
        //this program can read how many times the user wants to sum up

        // create object scanner
        Scanner myObj = new Scanner(System.in);

        // read user required times to sum up
        System.out.print("Input a number to sum to : "); // string name
        int sumTo = myObj.nextInt(); // can read Integer value . Beware to check data type

        // While loop and answer

        int i = 1;
        int sumTotal = 0;
        //Test Condition
        while (i <= sumTo) {
            //Update current sumTotal until the test condition is true
            sumTotal = sumTotal + i;
            //Increment the variable
            i++;
            //Print the sumTotal
            System.out.println("Sum Total: " + sumTotal);
        }
    }
}