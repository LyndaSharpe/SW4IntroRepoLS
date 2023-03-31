public class myMethodAgeChecker {
    // age checker method here
    public static void checkAge(int age) { // passing on int age
        // body of the checkAge method
        if (age < 18) {
            System.out.println("Access denied.");
        }else {
            System.out.println("Access granted!");
        }

    }

    public static void main(String[] args) { //main method
        checkAge(20);
        checkAge(10);
        checkAge(15);
        checkAge(40);

    }
}
