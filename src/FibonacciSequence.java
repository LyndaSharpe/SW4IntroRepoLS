public class FibonacciSequence {
    public static void main(String[] args) {
        fibonacci(50);
    } // end of main method

    // fibonacci generator
    public static void fibonacci(long counter) {
        long num1 = 0;
        long num2 = 1;
        long nextNum = 0; // 0 1 nextNum

        System.out.print(num1 + " " + num2 + " ");
        // loop through to the end of the counter to generate the next sequence
        for (long i=2; i <counter; i++) { //start at 2 as first 2 results already defined
            nextNum = num1 + num2;
            System.out.println(nextNum + " ");
            num1 = num2;
            num2 = nextNum;
        }
    }
}