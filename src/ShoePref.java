public class ShoePref {
    public static void main(String[] args) {
        // OR statement
        String ShoeColour = "black"; // String = ShoeColour
        if ((ShoeColour=="black")|| (ShoeColour=="brown")){
            System.out.println("Your shoe colour is available");
        } else {
            System.out.println("Only " + (ShoeColour) + " is available");}
    }
    }