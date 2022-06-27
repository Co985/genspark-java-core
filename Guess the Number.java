import java.util.Random;
import java.util.Scanner;

class GuesstheNumber {


    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        System.out.println("Random number is " + randomNumber);

        int tryCount = 0; //Count the amount of tries the user guessed the Number.
        int i = 0;

        while(i < 6) {
            System.out.println("Guess a number from 1 to 100. You have six tries to win nothing!");

            Scanner scanner = new Scanner(System.in);
            int guess = scanner.nextInt();
            tryCount++;
            i++;
            //int x [] = scanner.nextLine;
            //System.out.println("You have guessed these numbers, " + guess + " Please guess again!");

            if (guess == randomNumber) {
                System.out.println("Correct! You win no dollaz!!!");
                System.out.println("It took you " + tryCount + " tries!");
                break;
            }
            else if (guess > 100){
                System.out.println("Please stay under 100! This counts as a guess! Try again!!!");
            }
            else if (guess < 1){
                System.out.println("Please stay above 1 but no more than 100! This count as a guess! Try again!!!");
            }
            else if (randomNumber > guess) {
                System.out.println("Please try again! Your guess is too low, Playa!!!");
            }
            else if (randomNumber < guess) {
                System.out.println("Pleas try again! Your guess is too high, Playa!!!");
            }




        }

        }


}