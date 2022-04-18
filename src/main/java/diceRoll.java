import java.util.Random;

import static java.lang.System.out;

public class diceRoll {
    public static void main(String args[]) {
        int randomNumber = new Random().nextInt(20) + 1;
        out.println(randomNumber);
    }
}
