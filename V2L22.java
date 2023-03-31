public class V2L22 {
    //The main method is needed to successfully run the application
    public static void main (String[] args) {

// declare some variables
int num1 = 7;  //integer variable
float num2 = 18.01f; //float (decimal) number
String name = "Joe Bloggs"; //creating a string variable
boolean gender = true; // creating a boolean variable
    int[] arr = new int[5];
    int[] arr2 = {5, 2, 6, 3, 7, 2}; //creating an array with values

        // selection using a conditional statement
     if (num1==25) {
         System.out.println("The value of the variable is 25");
     } else {
         System.out.println("The value of the variable does not equal 25");
     }
    //Example of iteration (a loop)
     for (int i = 0; i <5; i++) {
         System.out.println("This line will be printed 5 times, this is a number: " + (i+1));
     }

     // CAlling a method
    int myAge = 16;
     yourNextBirthday(myAge);
}

// A method which exists outside the main method
public static void yourNextBirthday(int age){
    age++;
    System.out.println("On your next birthday, you will be " + age + " years old");
    }
}