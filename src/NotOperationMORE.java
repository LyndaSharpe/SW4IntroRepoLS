public class NotOperationMORE {
    public static void main(String[] args) {
        // OR statement
        String GameCont = "YES"; // String = Game Continue
        if (! (GameCont.equals ("Y") || (GameCont.equals ("YES") || (GameCont.equals("Yes"))))){
            System.out.println("The game will stop");
        } else  {
            System.out.println("The game will continue");}
    }
    }