public class HogwartsApp {
    // list all attributes
    String firstName;
    String lastName;
    int age;

    // default constructor
    public HogwartsApp(){
        firstName = "Harry";
        lastName = "Potter";
        age = 12;
    }

    // parameterised constructor
    public HogwartsApp (String firstName, String lastName, int age) { // pass on parameters
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // main methods
    public static void main(String[] args) {
        HogwartsApp student1 = new HogwartsApp();
        System.out.println(student1.firstName + " " + student1.lastName + " " + student1.age);

        HogwartsApp student2 = new HogwartsApp("Hermione", "Granger", 12);
        System.out.println(student2.firstName + " " + student2.lastName + " " + student2.age);

        HogwartsApp student8 = new HogwartsApp("wICKED", "fAIRY", 12);
        System.out.println(student8.firstName + " " + student8.lastName + " " + student8.age);



    }
}
