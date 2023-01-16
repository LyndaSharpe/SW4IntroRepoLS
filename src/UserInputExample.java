import java.util.Scanner; //import Scanner function

public class UserInputExample {
    public static void main (String[] args) {
        //this program can read user name and age

        // create object scanner
        Scanner myObj = new Scanner(System.in);

        // read user name
        System.out.println("Enter your name : "); // string name
        String name = myObj.nextLine(); // can read String value
        System.out.println(" My name is : " + name);

        // read user name
        System.out.println("Your brain age : "); // string name
        Integer brainAge = myObj.nextInt(); // can read Integer value
        System.out.println(" My brain age is : " + brainAge);
    }
}
