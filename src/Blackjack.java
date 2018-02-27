import java.util.Scanner;

public class Blackjack
{
    public static void main(String[] args)
    {
        //random number generator
        P1Random rng = new P1Random();

        //Scanner
        Scanner scan = new Scanner(System.in);

        //variables for keeping track of game stats
        int dealerHand, selection, cardValue = rng.nextInt(13) + 1, ties = 0, totalValue = 0;
        double gameNumber = 1, playerWins = 0, dealerWins = 0;

        /*
        Statements to get initial game going
        If-statements are checking for non-numeric cards, like ACES, JACKS, etc., and then adding the card's value
        to totalValue
        Following print statements initialize the while-loop
         */
        System.out.println("START GAME #1\n");
        if (cardValue == 1)
        {
            System.out.println("Your card is a ACE!");
            totalValue++;
            System.out.println("Your hand is: " + totalValue + "\n");
        }
        if (cardValue >= 2 && cardValue <= 10)
        {
            System.out.println("Your card is a " + cardValue + "!");
            totalValue += cardValue;
            System.out.println("Your hand is: " + totalValue + "\n");
        }
        if (cardValue == 11)
        {
            System.out.println("Your card is a JACK!");
            totalValue += 10;
            System.out.println("Your hand is: " + totalValue + "\n");
        }
        if (cardValue == 12)
        {
            System.out.println("Your card is a QUEEN!");
            totalValue += 10;
            System.out.println("Your hand is: " + totalValue + "\n");
        }
        if (cardValue == 13)
        {
            System.out.println("Your card is a KING!");
            totalValue += 10;
            System.out.println("Your hand is: " + totalValue + "\n");
        }

        System.out.println("1. Get another card");
        System.out.println("2. Hold hand");
        System.out.println("3. Print statistics");
        System.out.println("4. Exit\n");
        System.out.print("Choose an option: ");
        selection = scan.nextInt();
        System.out.println("");

        /*
        While-loop checks the selection the player makes so long as it does not equal 4.
        If selection equals 1, a card is drawn and is added to the totalValue.
        If selection equals 2, the player holds and the dealer is randomly assigned a value between 16 and 26.
        The player's hand and the dealer's hand are then compared
        If selection equals 3, the game's stats are displayed.
        If selection equals 4, the game is terminated.
        If selection out of the range between 1 and 4, the player is asked to re-enter a selection
         */
        while (selection != 4)
        {
            if (selection == 1)
            {
                cardValue = rng.nextInt(13) + 1;
                if (cardValue == 1)
                {
                    System.out.println("Your card is a ACE!");
                    totalValue++;
                    System.out.println("Your hand is: " + totalValue + "\n");
                }
                if (cardValue >= 2 && cardValue <= 10)
                {
                    System.out.println("Your card is a " + cardValue + "!");
                    totalValue += cardValue;
                    System.out.println("Your hand is: " + totalValue + "\n");
                }
                if (cardValue == 11)
                {
                    System.out.println("Your card is a JACK!");
                    totalValue += 10;
                    System.out.println("Your hand is: " + totalValue + "\n");
                }
                if (cardValue == 12)
                {
                    System.out.println("Your card is a QUEEN!");
                    totalValue += 10;
                    System.out.println("Your hand is: " + totalValue + "\n");
                }
                if (cardValue == 13)
                {
                    System.out.println("Your card is a KING!");
                    totalValue += 10;
                    System.out.println("Your hand is: " + totalValue + "\n");
                }
                if (totalValue == 21)
                {
                    System.out.println("BLACKJACK! You win!\n");
                    gameNumber++;
                    totalValue = 0;
                    playerWins++;
                    System.out.println("START GAME #" + (int) gameNumber + "\n");

                    cardValue = rng.nextInt(13) + 1;

                    if (cardValue == 1)
                    {
                        System.out.println("Your card is a ACE!");
                        totalValue++;
                        System.out.println("Your hand is: " + totalValue + "\n");
                    }
                    if (cardValue >= 2 && cardValue <= 10)
                    {
                        System.out.println("Your card is a " + cardValue + "!");
                        totalValue += cardValue;
                        System.out.println("Your hand is: " + totalValue + "\n");
                    }
                    if (cardValue == 11)
                    {
                        System.out.println("Your card is a JACK!");
                        totalValue += 10;
                        System.out.println("Your hand is: " + totalValue + "\n");
                    }
                    if (cardValue == 12)
                    {
                        System.out.println("Your card is a QUEEN!");
                        totalValue += 10;
                        System.out.println("Your hand is: " + totalValue + "\n");
                    }
                    if (cardValue == 13)
                    {
                        System.out.println("Your card is a KING!");
                        totalValue += 10;
                        System.out.println("Your hand is: " + totalValue + "\n");
                    }
                }
                if (totalValue > 21)
                {
                    System.out.println("You exceeded 21! You lose.\n");
                    gameNumber++;
                    totalValue = 0;
                    dealerWins++;
                    System.out.println("START GAME #" + (int) gameNumber + "\n");

                    cardValue = rng.nextInt(13) + 1;

                    if (cardValue == 1)
                    {
                        System.out.println("Your card is a ACE!");
                        totalValue++;
                        System.out.println("Your hand is: " + totalValue + "\n");
                    }
                    if (cardValue >= 2 && cardValue <= 10)
                    {
                        System.out.println("Your card is a " + cardValue + "!");
                        totalValue += cardValue;
                        System.out.println("Your hand is: " + totalValue + "\n");
                    }
                    if (cardValue == 11)
                    {
                        System.out.println("Your card is a JACK!");
                        totalValue += 10;
                        System.out.println("Your hand is: " + totalValue + "\n");
                    }
                    if (cardValue == 12)
                    {
                        System.out.println("Your card is a QUEEN!");
                        totalValue += 10;
                        System.out.println("Your hand is: " + totalValue + "\n");
                    }
                    if (cardValue == 13)
                    {
                        System.out.println("Your card is a KING!");
                        totalValue += 10;
                        System.out.println("Your hand is: " + totalValue + "\n");
                    }
                }
                if (totalValue < 21) {
                    System.out.println("1. Get another card");
                    System.out.println("2. Hold hand");
                    System.out.println("3. Print statistics");
                    System.out.println("4. Exit\n");
                    System.out.print("Choose an option: ");
                    selection = scan.nextInt();
                    if (selection != 4) {
                        System.out.println("");
                    }
                }
            }

            if (selection == 2)
            {
                dealerHand = rng.nextInt(11) + 16;
                System.out.println("Dealer's hand: " + dealerHand);
                System.out.println("Your hand is: " + totalValue + "\n");

                if (dealerHand > 21 || ((21 - totalValue) < (21 - dealerHand)))
                {
                    System.out.println("You win!\n");
                    gameNumber++;
                    totalValue = 0;
                    playerWins++;
                    System.out.println("START GAME #" + (int) gameNumber + "\n");

                    cardValue = rng.nextInt(13) + 1;

                    if (cardValue == 1)
                    {
                        System.out.println("Your card is a ACE!");
                        totalValue++;
                        System.out.println("Your hand is: " + totalValue + "\n");
                    }
                    if (cardValue >= 2 && cardValue <= 10)
                    {
                        System.out.println("Your card is a " + cardValue + "!");
                        totalValue += cardValue;
                        System.out.println("Your hand is: " + totalValue + "\n");
                    }
                    if (cardValue == 11)
                    {
                        System.out.println("Your card is a JACK!");
                        totalValue += 10;
                        System.out.println("Your hand is: " + totalValue + "\n");
                    }
                    if (cardValue == 12)
                    {
                        System.out.println("Your card is a QUEEN!");
                        totalValue += 10;
                        System.out.println("Your hand is: " + totalValue + "\n");
                    }
                    if (cardValue == 13)
                    {
                        System.out.println("Your card is a KING!");
                        totalValue += 10;
                        System.out.println("Your hand is: " + totalValue + "\n");
                    }
                }
                else if ((21 - dealerHand) < (21 - totalValue))
                {
                    System.out.println("Dealer wins!\n");
                    gameNumber++;
                    totalValue = 0;
                    dealerWins++;
                    System.out.println("START GAME #" + (int) gameNumber + "\n");

                    cardValue = rng.nextInt(13) + 1;

                    if (cardValue == 1)
                    {
                        System.out.println("Your card is a ACE!");
                        totalValue++;
                        System.out.println("Your hand is: " + totalValue + "\n");
                    }
                    if (cardValue >= 2 && cardValue <= 10)
                    {
                        System.out.println("Your card is a " + cardValue + "!");
                        totalValue += cardValue;
                        System.out.println("Your hand is: " + totalValue + "\n");
                    }
                    if (cardValue == 11)
                    {
                        System.out.println("Your card is a JACK!");
                        totalValue += 10;
                        System.out.println("Your hand is: " + totalValue + "\n");
                    }
                    if (cardValue == 12)
                    {
                        System.out.println("Your card is a QUEEN!");
                        totalValue += 10;
                        System.out.println("Your hand is: " + totalValue + "\n");
                    }
                    if (cardValue == 13)
                    {
                        System.out.println("Your card is a KING!");
                        totalValue += 10;
                        System.out.println("Your hand is: " + totalValue + "\n");
                    }
                }
                if (dealerHand == totalValue)
                {
                    System.out.println("It's a tie! No one wins!\n");
                    gameNumber++;
                    totalValue = 0;
                    ties++;
                    System.out.println("START GAME #" + (int) gameNumber + "\n");

                    cardValue = rng.nextInt(13) + 1;

                    if (cardValue == 1)
                    {
                        System.out.println("Your card is a ACE!");
                        totalValue++;
                        System.out.println("Your hand is: " + totalValue + "\n");
                    }
                    if (cardValue >= 2 && cardValue <= 10)
                    {
                        System.out.println("Your card is a " + cardValue + "!");
                        totalValue += cardValue;
                        System.out.println("Your hand is: " + totalValue + "\n");
                    }
                    if (cardValue == 11)
                    {
                        System.out.println("Your card is a JACK!");
                        totalValue += 10;
                        System.out.println("Your hand is: " + totalValue + "\n");
                    }
                    if (cardValue == 12)
                    {
                        System.out.println("Your card is a QUEEN!");
                        totalValue += 10;
                        System.out.println("Your hand is: " + totalValue + "\n");
                    }
                    if (cardValue == 13)
                    {
                        System.out.println("Your card is a KING!");
                        totalValue += 10;
                        System.out.println("Your hand is: " + totalValue + "\n");
                    }
                }

                System.out.println("1. Get another card");
                System.out.println("2. Hold hand");
                System.out.println("3. Print statistics");
                System.out.println("4. Exit\n");
                System.out.print("Choose an option: ");
                selection = scan.nextInt();
                if (selection != 4) {
                    System.out.println("");
                }
            }

            if (selection == 3)
            {
                double playerCalc = (double) Math.round((playerWins / (gameNumber-1) * 100) * 10) / 10;
                System.out.println("Number of Player wins: " + (int) playerWins);
                System.out.println("Number of Dealer wins: " + (int) dealerWins);
                System.out.println("Number of tie games: " + ties);
                System.out.println("Total # of games played is: " + (int) (gameNumber-1));
                System.out.println("Percentage of Player wins: " + playerCalc + "%" + "\n");

                System.out.println("1. Get another card");
                System.out.println("2. Hold hand");
                System.out.println("3. Print statistics");
                System.out.println("4. Exit\n");
                System.out.print("Choose an option: ");
                selection = scan.nextInt();
                if (selection != 4) {
                    System.out.println("");
                }
            }

            if (selection > 4 || selection < 1)
            {
                System.out.println("Invalid input!");
                System.out.println("Please enter an integer value between 1 and 4.\n");

                System.out.println("1. Get another card");
                System.out.println("2. Hold hand");
                System.out.println("3. Print statistics");
                System.out.println("4. Exit\n");
                System.out.print("Choose an option: ");
                selection = scan.nextInt();
                if (selection != 4) {
                    System.out.println("");
                }
            }
        }
    }
}
