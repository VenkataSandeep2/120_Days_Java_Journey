package d0_While;
import java.util.*;

class Dice 
{
  public static void main(String[] args)
  {
    Random random = new Random();
    int diceRoll;

        do {
        	System.out.println();
            diceRoll = random.nextInt(6) + 1; 
            System.out.println("You rolled a: " + diceRoll);

        // CONDITION: Keep looping as long as the roll is NOT 6
        } while (diceRoll != 6); 

        System.out.println("Congratulations! You rolled a 6 Times.");
    }
}
