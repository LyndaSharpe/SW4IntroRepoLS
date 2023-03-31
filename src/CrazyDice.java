<<<<<<< HEAD
// creating dice program using Random class
// crazy dice: generate rantom number between 1 to 12

import java.util. Random;
public class CrazyDice {
    public static void main(String[] args) {
        Random random = new Random();
        //create an instance/object of the random
        int diceNumber = random.nextInt (12)+1; //boundary = total numbers +1 to start at 1 and not 0
        System.out.println("The dice number is " + diceNumber);

    }
=======
// creating dice program using Random class
// crazy dice: generate rantom number between 1 to 12

import java.util. Random;
public class CrazyDice {
    public static void main(String[] args) {
        Random random = new Random();
        //create an instance/object of the random
        int diceNumber = random.nextInt (12)+1; //boundary = total numbers +1 to start at 1 and not 0
        System.out.println("The dice number is " + diceNumber);

    }
>>>>>>> 188b3a207009a7d71c1ae4aeb9971feb0b1756cc
}