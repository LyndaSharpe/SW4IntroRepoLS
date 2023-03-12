import java.util.Scanner; //import Scanner function

public class TimesTableWhileLoop {
    public static void main(String[] args) {
        //this program can read user times table required

        // create object scanner
        Scanner myObj = new Scanner(System.in);

        // read user required time table
        System.out.println("Which TimesTable Do You Want To Run? : "); // string name
        int table = myObj.nextInt(); // can read Integer value . Beware to check data type
        System.out.println(" I Want To Run The " + table + " Times Table");

        // While loop and answer
        int counter = 1;
        while (counter <=12) {
            System.out.println(counter + "x" + table + "=" + counter * table);
            counter ++;
        }
    }
}
