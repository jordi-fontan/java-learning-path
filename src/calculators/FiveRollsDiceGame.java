package calculators;

import java.util.Random;
import java.util.Scanner;

public class FiveRollsDiceGame {
    public static void main(String... args)
    {
        // The game is: roll a die 5 times
        // on a 20 square board you win if you land at position 20

        //Put this in a loop
        boolean repeat=true;
        while(repeat) {
            // current roll
            int dieRoll = 0;
            // total
            int total = 0;

            // Checker fpr going more than 20
            boolean out = false;

            Random random = new Random();
            for (int i = 1; i < 6; i++) {
                dieRoll = random.nextInt(6) + 1;
                System.out.printf("You've rolled a %d%n", dieRoll);
                total += dieRoll;
                if (total > 20) {
                    System.out.printf("Roll #%d. You've rolled a %d. You are now on space %d and you have lost :(%n", i, dieRoll, total);
                    break;
                } else if (total==20) {
                    System.out.printf("Roll #%d. You've rolled a %d. You are now on space %d. You Win !!:(%n", i, dieRoll, total);
                    break;
                }
                else if (total<20 && i==5) {
                    System.out.printf("Roll #%d. You've rolled a %d. You are now on space %d. You didn't make it :((%n", i, dieRoll, total);
                    break;
                }
                    System.out.printf("Roll #%d. You've rolled a %d. You are now on space %d and have %d more to go %n", i, dieRoll, total, 20 - total);
            }
            // Ask the user for repeat
            Scanner sc=new Scanner(System.in);
            System.out.println("Repeat? Y/N");
            if("n".equalsIgnoreCase(sc.next())) repeat=false;
        }

    }
}
