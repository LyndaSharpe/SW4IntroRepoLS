import java.util.Scanner; //import Scanner function

public class TimesTable {
    public static void main(String[] args) {
        //this program can read user times table required

        // create object scanner
        Scanner myObj = new Scanner(System.in);

        // read user required time table
        System.out.println("Which TimesTable Do You Want To Run? : "); // string name
        int table = myObj.nextInt(); // can read Integer value
        System.out.println(" I Want To Run The " + table + " Times Table");

        // For loop and answer
        for (int counter = 1; counter <= 12; counter++) {
            System.out.println(counter + "x" + table + "=" + counter * table);
        }
    }
}

