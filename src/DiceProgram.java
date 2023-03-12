// creating dice program using Random class

import java.util. Random;
public class DiceProgram {
    public static void main(String[] args) {
        Random random = new Random();
        //create an instance/object of the random
        int diceNumber = random.nextInt (6)+1;
        System.out.println("The dice number is " + diceNumber);

   }
}
