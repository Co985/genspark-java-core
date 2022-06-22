package genspark.assignments;

import java.util.Scanner;


class Main {
    public static void main(String[] args) {

        friendly friendly = new friendly();
        bad bad = new bad();



        Scanner scanner = new Scanner(System.in);

        System.out.println("You are in a land full of dragons. In front of you, you see two caves.");
        System.out.println("In one cave the dragon is friendly and will share his treasure with you.");
        System.out.println("The other dragon is greedy and hungry and will eat you on site.");
        System.out.println("Which cave will you go into? (1 or 2)");
        //System.out.println(scanner.nextInt());

        //Getcave();
        int command;
        do{

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



    }
        }


