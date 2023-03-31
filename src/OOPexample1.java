public class OOPexample1 { //main class
    //list all attributes
    int x;

    public OOPexample1(){ //constructor method, name = class name () is empty = default
        x = 5; //instantiate the value of x
    }

     public static void main(String[] args) { //main methods
    // creation of object
         OOPexample1 myObj = new OOPexample1(); //creating object1
         System.out.println(myObj.x);
    }
}
