import java.util.Scanner;

// This is a square calculator program Extension
// Wb 1 question 4
public class SquareCalculatorExt { //class
    public static void main(String[] args) { //main method
        // read user input
        // create scanner object
        Scanner reader = new Scanner(System.in);
        System.out.println ("Enter width and height to calculate the perimeter and area of the rectangle");
        System.out.println ("Width = ");
        double width = reader.nextDouble();

        System.out.println ("Height = ");
        double height = reader.nextDouble();

        System.out.println("The width of the rectangle is " + width);
        // short cut sout to print
        System.out.println("The length of the rectangle is " + height);

        // create variable perimeter
        double perimeter = 2 * (width + height) ; // 2L + 2W
        System.out.println("The perimeter of the rectangle is " + perimeter);

        double area = width * height;
        System.out.println("The area of the rectangle is " + area);
    }
}