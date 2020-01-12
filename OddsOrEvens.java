/* A game of odds or evens that allows the player to make a choice on how many "fingers" to put out against a computer
who will also put out "fingers". The sum of both players choices will be added and result in a number. If that number is
odd it will display a message saying it was odd. If it was even, it will display a message saying it was even. Based on
who chose what, it will then tell the player who won based on those choices.
 */

import java.util.*;
public class OddsOrEvens {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String playAgain = "yes";

        while (playAgain.startsWith("y")) {
            game();
            System.out.println("Play again? (yes/no)");
            playAgain = input.nextLine();
        }
    }

    public static void game() {
        Scanner input = new Scanner(System.in);


            System.out.println("Let's play a game called \"Odds or Evens\".");
            System.out.println("What is your name?");
            String name = input.nextLine();
            System.out.println("Hi " + name + ", which do you choose? (o)dds or (e)vens?");
            String choice = input.nextLine();

            if (choice.startsWith("o")) {
                System.out.println(name + " has picked odds! The computer will be evens.");
            } else {
                System.out.println(name + " has picked evens! The computer will be odds.");
            }
            System.out.println("--------------------------------------");

            System.out.println("How many \"fingers\" do you put out?");
            int fingers = input.nextInt();
            Random rand = new Random();
            int computer = rand.nextInt(6); //adds a random number between 0 and 6 to the player's choice.
            System.out.println("The computer plays " + computer + " \"fingers\".");
            System.out.println("-----------------------------------------");
            System.out.println(" ");
            System.out.println(fingers + " + " + computer + " = " + (fingers + computer));

            int sum = (fingers + computer);
            boolean oddOrEven = sum % 2 == 0;
            if (oddOrEven) {
                System.out.println(sum + " is ...even!");
                if (choice.startsWith("e")) {
                    System.out.println("The Player wins!!");
                } else {
                    System.out.println("The Computer wins!!");
                }
            } else {
                System.out.println(sum + " is ...odd!");
                if (choice.startsWith("o")) {
                    System.out.println("The Player Wins!!");
                } else {
                    System.out.println("The Computer Wins!!");
                }

            }

        }
    }


