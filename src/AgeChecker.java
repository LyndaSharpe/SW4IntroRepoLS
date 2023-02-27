import java.util.Scanner; //import scanner function FIRST

// This is an AgeChecker input by user example
// Coding exercise AgeChecker
public class AgeChecker { //class
    public static void main(String[] args) { //main method
        // read user input
        // create scanner object
        Scanner reader = new Scanner(System.in); //creating user input - add scanner first
        System.out.println ("Please enter your age: "); //user input....remember sout shortcut
        int age = reader.nextInt(); //collecting the value
        System.out.println("You confirmed your age as: " + age); //writing the collected value

        //check if age is more than 17, if so, grant access, else no access
        //if, else statement
        //check for negative number and prompt for valid age

        if (age <0 ){
            System.out.println("Please enter a valid age!");
        } else if (age > 17) {
            System.out.println("Access Granted!");
        } else  {
            System.out.println("Access Denied!");
        }


    }
}