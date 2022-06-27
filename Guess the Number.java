import java.util.Random;
import java.util.Scanner;

class GuesstheNumber {


    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(20) + 1;
        //System.out.println("Random number is " + randomNumber); used to test the code

        int tryCount = 0; //Count the amount of tries the user guessed the Number.
        int i = 0; //variable for tryCount

        while(i < 6) { //This while loop only runs 6 times and stops at correct guess
            System.out.println("Guess a number from 1 to 20. You have six tries to win nothing!");

            Scanner scanner = new Scanner(System.in); //Scanner created to take user input
            int guess = scanner.nextInt();
            tryCount++; //tryCount for accepting guess
            i++;


            if (guess == randomNumber) { //What the loop does if guess is correct
                System.out.println("Correct! You win no dollaz!!!");
                System.out.println("It took you " + tryCount + " tries!");
                break;
            }
            else if (guess > 20){ // Makes sure user do not guess above 20
                System.out.println("Please stay under 20! This counts as a guess! Try again!!!");
            }
            else if (guess < 1){ // User can not guess below 1
                System.out.println("Please stay above 1 but no more than 100! This count as a guess! Try again!!!");
            }
            else if (randomNumber > guess) { // User guess too low
                System.out.println("Please try again! Your guess is too low, Playa!!!");
            }
            else if (randomNumber < guess) { // User guess too high
                System.out.println("Pleas try again! Your guess is too high, Playa!!!");
            }


        }

    }

}