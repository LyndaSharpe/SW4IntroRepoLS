// Nested loop: consist of an outer loop and one or  more inner loops
// be careful: your counter must have different  name!!
public class NestedLoop {
    public static void main(String[] args) {

        for (int i=1; i<=1; i++) { // outer loop starts i = 1 and stays at 1
            for (int j=0; j <= 9; j++) { // innter loop starts j = 0 through to 9
                System.out.println(i  + "" + j);
            } // inner loop end
        } // outer loop end
    }
}
