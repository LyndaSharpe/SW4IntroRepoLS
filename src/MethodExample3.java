public class MethodExample3 {
    static int myMethod (int x) { // passing 1 argument
        return 5 + x; // use return keyword, return int value
    }

    static int myMethod2 (int x, int y) { // passing 2 arguments
        return x -y;
    }


    public static void main(String[] args) { // main method
        System.out.println(myMethod(3)); // output 5 + 3 = 7
        System.out.println(myMethod(5)); // OUTPUT 5 + 5 = 10

        System.out.println(myMethod2(10, 5)); // output 10 - 5 = 5
    }
}

