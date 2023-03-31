// Method Overloading
// import java scanner
import java.util.Scanner;
public class MinandMaxExt {
    public static void main(String[] args) { //MAIN METHOD
        // create scanner object
        Scanner reader = new Scanner(System.in);
        // read user input (int) num1, num2, num3
        System.out.println("Enter 3 numbers");
        double numOne = reader.nextDouble();
        double numTwo = reader.nextDouble();
        double numThree = reader.nextDouble();
        //determine if INT of DOUBLE numbers
        if (numOne % 1 == 0 && numTwo % 1 == 0 && numThree % 1 == 0) {
            System.out.println("The biggest number is " + maxNumber(numOne, numTwo, numThree)); //print out the biggest number
            System.out.println("The smallest number is " + minNumber(numOne, numTwo, numThree)); //print out the smallest number
        } else { //method overloading
            System.out.println("The biggest number is " + maxNumber(numOne, numTwo, numThree)); //print out the biggest number
            System.out.println("The smallest number is " + minNumber(numOne, numTwo, numThree)); //print out the smallest number
        } //END OF MAIN METHOD
    }

        //Method to find the biggest number
        static int maxNumber ( int a, int b, int c){
            // do if else if statement to find the biggest number, use return keyword
            if (a > b && a > c) { // a is biggest
                return a;
            } else if (b > a && b > c) { //b is biggest
                return b;
            } else {
                return c; //c is biggest
            }
        }
        //Method to find the biggest number

    //Method to find the smallest number
    static int minNumber(int a, int b, int c){
        // do if else if statement to find the smallest number, use return keyword
        if (a < b && a < c) { // a is smallest
            return a;
        } else if (b < a && b < c ){ //b is smallest
            return b;
        } else {
            return c; //c is smallest
        }
    }
    static double maxNumber(double a, double b, double c) {
        // do if else if statement to find the biggest number, use return keyword
        if (a > b && a > c) { // a is biggest
            return a;
        } else if (b > a && b > c) { //b is biggest
            return b;
        } else {
            return c; //c is biggest
        }
    }

    static double minNumber(double a, double b, double c){
        // do if else if statement to find the smallest number, use return keyword
        if (a < b && a < c) { // a is smallest
            return a;
        } else if (b < a && b < c ){ //b is smallest
            return b;
        } else {
            return c; //c is smallest
        }
    }
}
