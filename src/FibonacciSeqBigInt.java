import java.math.BigInteger; //Import BigInteger Class (can use valueof or ZERO methods etc) more effective than recursion
public class FibonacciSeqBigInt {
    public static void main(String[] args) {
        fibonacci(100);
    } // end of main method

    // fibonacci generator
    public static void fibonacci(long counter) {
        BigInteger num1 = BigInteger.valueOf(0);
        BigInteger num2 = BigInteger.valueOf(1);
        BigInteger nextNum = BigInteger.valueOf(0); // 0 1 nextNum

        System.out.print(num1 + " " + num2 + " ");
        // loop through to the end of the counter to generate the next sequence
        for (long i = 2; i < counter; i++) { //start at 2 as first 2 results already defined
            nextNum = num1 .add(num2);
            System.out.println(nextNum + " ");
            num1 = num2;
            num2 = nextNum;
        }
    }
}
