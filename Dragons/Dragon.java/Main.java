package genspark.assignments;

import java.util.Scanner;
import java.util.Random;

class Main {
    public static void main(String[] args) {

        friendly friendly = new friendly();
        bad bad = new bad();

        int tryCount = 0; //tryCount added to count tries as directed
        int i = 0; //integer created to run tryCount loop



        System.out.println("You are in a land full of dragons. In front of you, you see two caves.");
        System.out.println("In one cave the dragon is friendly and will share his treasure with you.");
        System.out.println("The other dragon is greedy and hungry and will eat you on site.");
        //System.out.println(scanner.nextInt());

        while(true) {
            System.out.println("Which cave will you go into? (1 or 2)"); //User input which cave

            Random random = new Random(); //added random loop here so that the outcome would not be the same within the loop
            int randomNumber = random.nextInt(2) + 1;
            Scanner scanner = new Scanner(System.in); //Scanner for input can go here or at beginning
            int guess = scanner.nextInt();
            tryCount++; //to make tryCount work within the loop
            i++;

            if(guess != randomNumber){ //to bring out mean dragon at random
                bad.Talk();
                System.out.println("You guessed, " + tryCount + " times before getting eaten."); // tells user how many guesses before being eaten

                break; //program ends the game
            }
            if(guess == randomNumber){ //game continues if the correct cave is selected
                friendly.Talk();
            }
        }
        //Getcave();
      /*  int command;
        do{ // This do loop works but the bad dragon is always in cave 1 and friendly dragon in cave 2.

           // bad[1] bad.Talk();
           // friendly[2] friendly.Talk();
            command = scanner.nextInt();
            switch (command){
                case 1:
                    friendly.Talk();
                    break;
                case 2:
                    bad.Talk();
                    break;
                default:
                    cave.Talk();
                    break;
            }
        }while(command < 2);

*/

    }
        }


