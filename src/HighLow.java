import java.util.Scanner;



public class HighLow {
    public static void main(String[] args) {
        guessTheNumber();

    }


    public static double getRandomIntegerBetweenRange(double min, double max){
        double number = (int)(Math.random()*((max-min)+1))+min;
        return number;
    }

    public static void guessTheNumber () {
        Scanner guessed = new Scanner(System.in);
        double num = (int) getRandomIntegerBetweenRange(1, 100);
        System.out.println("Please guess the random number between 1 and 100");
        int secondResponse = guessed.nextInt();
        int guessCount = 0;
        int guessLimit = 10;
        boolean outOfGuesses = false;

        while (secondResponse != num) {
            if (guessCount < guessLimit) {
                if (secondResponse < num) {
                    System.out.println("HIGHER!");
                    System.out.println("Guess again");
                    secondResponse = guessed.nextInt();
                    guessCount++;

                } else if (secondResponse > num) {
                    System.out.println("LOWER!");
                    System.out.println("Guess again");
                    secondResponse = guessed.nextInt();
                    guessCount++;
                }
            } else {
                outOfGuesses = true;
                System.out.println("Sorry! You ran out of guesses.");
                break;
            }
        }

        if (secondResponse == num) {
            System.out.println("Correct, Good Guess.");
        }
    }

}
