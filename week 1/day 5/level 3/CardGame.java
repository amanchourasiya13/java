import java.util.*;

public class CardGame{
    
    // Method to initialize the deck of cards with suits and ranks
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }
    
    // Method to shuffle the deck
    public static String[] shuffleDeck(String[] deck) {
        Random random = new Random();
        for (int i = 0; i < deck.length; i++) {
            // Swap the current card with a randomly selected card
            int randomCardIndex = i + random.nextInt(deck.length - i);
            String temp = deck[i];
            deck[i] = deck[randomCardIndex];
            deck[randomCardIndex] = temp;
        }
        return deck;
    }

    // Method to distribute the cards to players
    public static String[][] distributeCards(String[] deck, int numPlayers, int cardsPerPlayer) {
        if (numPlayers * cardsPerPlayer > deck.length) {
            System.out.println("Not enough cards to distribute to players.");
            return new String[0][0];
        }
        
        String[][] players = new String[numPlayers][cardsPerPlayer];
        int cardIndex = 0;
        
        // Distribute the cards
        for (int i = 0; i < numPlayers; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                players[i][j] = deck[cardIndex++];
            }
        }
        return players;
    }

    // Method to print the players and their cards
    public static void printPlayersCards(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            for (String card : players[i]) {
                System.out.print(card + ", ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Initialize the deck of cards
        String[] deck = initializeDeck();
        
        // Shuffle the deck
        deck = shuffleDeck(deck);
        
        // Prompt the user for the number of players and cards per player
        System.out.print("Enter the number of players: ");
        int numPlayers = scanner.nextInt();
        System.out.print("Enter the number of cards per player: ");
        int cardsPerPlayer = scanner.nextInt();
        
        // Distribute the cards to players
        String[][] players = distributeCards(deck, numPlayers, cardsPerPlayer);
        
        // Print the players and their cards
        printPlayersCards(players);
        
        // Close the scanner
        scanner.close();
    }
}
