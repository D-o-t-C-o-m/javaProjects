package com.mycompany.blackjack;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

//I suspect I should build this game in a standalone method with basically only 'Play' in main 
public class blackJack {

    static String deck() {
        //TODO Find a better method for building this array
        String[] deck = {"2♠", "3♠", "4♠", "5♠", "6♠", "7♠", "8♠", "9♠", "10♠", "J♠", "Q♠", "K♠", "A♠", "2♥", "3♥", "4♥", "5♥", "6♥", "7♥", "8♥", "9♥", "10♥", "J♥", "Q♥", "K♥", "A♥", "2♦", "3♦", "4♦", "5♦", "6♦", "7♦", "8♦", "9♦", "10♦", "J♦", "Q♦", "K♦", "A♦", "2♣", "3♣", "4♣", "5♣", "6♣", "7♣", "8♣", "9♣", "10♣", "J♣", "Q♣", "K♣", "A♣"};
        Random random = new Random();
        int index = random.nextInt(deck.length);
        return (deck[index]);
        //TODO remove the index listed here from the array so you can't draw the same card twice
        //TODO learn how to reset the array at the end of the game
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the shittiest casino in virtual space");
        System.out.println("");
        // TODO make this a cool ascii thing
        int bank = 100;
        // Loop to begin the game
        System.out.println("Would you like to play? Y/N: ");
        while (true) {
            String start = scanner.nextLine().trim().toLowerCase();
            // TODO do not allow bets over the bank

            if (!start.contentEquals("y") && !start.contentEquals("n")) {
                System.out.println("Invalid input, please try again.");
                continue;
            } else if (start.contentEquals("n")) {
                System.out.println("Please come back another time. You're cashing out with $" + bank);
                break;
            } else {
                System.out.println("");
                System.out.println("Excellent, You're starting with $" + bank + " in the bank.");
                System.out.println("");
                System.out.println("Enter your bet amount.");
                int bet = Integer.valueOf(scanner.nextLine());
                // TODO Add validation that bet is a number
                System.out.println("You're betting $" + bet);
                //TODO make the hand into an array instead of 50 variables
                String playerCard1 = deck();
                String playerCard2 = deck();
                String dealerCard1 = deck();
                String dealerCard2 = deck();
                System.out.println("Your hand " + playerCard1 + " " + playerCard2);

                while (true) { //this loop is where it not being an array screws me over
                    System.out.println("Would you like to (H)it or (S)tand? ");
                    String playerAction = scanner.nextLine().trim().toLowerCase();
                    if (!playerAction.contentEquals("h") && !playerAction.contentEquals("s")) {
                        System.out.println("Invalid input, please enter (H) for a hit, or (S) to stand");
                        continue;
                    } else if (playerAction.contentEquals("h")) {
                        String playerCard3 = deck();
                        System.out.println("Your hand is now " + playerCard1 + " " + playerCard2 + " " + playerCard3);
                        //If someone hits a second time it overrides card 3, probably need to come up with something for that. like hit triggers a new card assigned to PC [X]?
                        continue;
                    } else {
                        System.out.println("Dealer's hand " + dealerCard1 + " " + dealerCard2);
                        //dealer is lazy and never hits
                        break;
                    }
                }

                //This is only temporary until I figure out how to get the login in place to compare the values of the strings
                //Maybe I can "Index" match or something similar to basically say index 0 is a 2 so it's equal to 2? I would also need to figure out how to do Aces since they can be 1 or 11
                System.out.println("Did you win? Y/N ");
                String win = scanner.nextLine().trim().toLowerCase();
                if (!win.contentEquals("y") && !win.contentEquals("n")) {
                    System.out.println("Invalid input, game treated as a loss.");
                    bank -= bet;
                    continue;
                } else if (win.contentEquals("y")) {
                    bank += bet;
                    System.out.println("Congratulation! Your bet paid off and you now have $" + bank);
                    System.out.println("");
                    System.out.println("Would you like to play again? Y/N: ");
                    continue;
                } else if (bank <= 0) {

                    System.out.println("You're bankrupt, Partner");
                    break;
                } else {
                    bank -= bet;
                    System.out.println("That's too bad, that leaves you with $" + bank + " in the bank");
                    System.out.println("");
                    System.out.println("Would you like to play again? Y/N: ");
                    //         }
                } 
            }
            
        }
    }
}
//        }
//  }
//}
