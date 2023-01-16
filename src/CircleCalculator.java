// This is a circle calculator program
// Wb 1 question 3
public class CircleCalculator { //class
    public static void main(String[] args) { //main method
        // declare variables circle radius
        // assign value 12.0

        float circleRadius = 12.0f; // data type is double to accept decimal number (float as alternative to double for decimal management)


        System.out.println("The radius of the circle is " + circleRadius);
        // short cut sout to print

        // create variable diameter
        double circleDiameter = 2 * (circleRadius) ; // 2 x radius
        System.out.println("The diameter of the circle is " + circleDiameter);

        // create variable circumference
        double circleCircumference = 2 * 3.14 * (circleRadius); // 2 x 3.14 x radius
        System.out.println("the circumference of the circle is " + circleCircumference);

        // create variable area
        double circleArea = 3.14 * (circleRadius) * (circleRadius)  ; //  3.14  x radius x radius
        System.out.println("the area of the circle is " + circleArea);
    }

}
