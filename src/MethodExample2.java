public class MethodExample2 {
    public static void main(String[] args) { // main method
        myMethod("James"); // pass on argument James
        myMethod("Lilly"); // pass on argument Lilly
        myMethod("Harry"); // pass on argument Harry
    }

    // create my own methods
    static void myMethod (String firstName) { // pass on parameter firstName
        System.out.println( firstName + " Potter");
    }
}
