/*

Write a Program DeckOfCards.java, to initialize deck of cards having suit
("Clubs", "Diamonds", "Hearts", "Spades") & Rank ("2", "3", "4", "5", "6", "7", "8",
"9", "10", "Jack", "Queen", "King", "Ace"). Shuffle the cards using Random
method and then distribute 9 Cards to 4 Players and Print the Cards received by
the 4 Players using 2D Array...

*/
import java.util.Random;

public class CardOfDesk {

    int noOfTotalCards = 52 ;
    int cardsPerPlayer = 9 ;
    int NoOfPlayers = 4 ;
    String[] cardsArray = new String[noOfTotalCards];
    String[] cardType = new String[4];
    String[] cardNumbers = new String[13];

    CardOfDesk(){
        cardType = new String[] { "Clubs", "Diamonds", "Hearts", "Spades" };
        cardNumbers = new String[]{ "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
        NoOfPlayers = 4;
        cardsPerPlayer = 9;
    }
    public String[] getAllCards(){
        int cardNo = 0;
        for(int i=0;i<cardType.length;i++){
            for(int j=0;j<cardNumbers.length;j++){
                cardsArray[cardNo] = cardType[i]+" "+cardNumbers[j];
                cardNo+=1;
            }
        }
        return cardsArray;
    }
    public String[] getShuffleCards(String[] array){
        Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			int randomIndexToSwap = rand.nextInt(array.length);
			String temp = array[randomIndexToSwap];
			array[randomIndexToSwap] = array[i];
			array[i] = temp;
		}
        return array;
    }
    public void printPlayerCards(String[] shuffleCards){
        int player=1;
        int shuffledCardIndex=0;
        while(player<=this.NoOfPlayers){
            System.out.println("Player "+ player + ":");
            int card=0;
            while (card<this.cardsPerPlayer){
                System.out.print(shuffleCards[shuffledCardIndex] + ", ");
                card++;
                shuffledCardIndex++;
            }
            System.out.println();
            player++;
        } 
    }
    public static void main(String[] args) {
        CardOfDesk game = new CardOfDesk();
        String[] allCards = game.getAllCards();
        String[] shuffleCards = game.getShuffleCards(allCards);
        game.printPlayerCards(shuffleCards);
    }
}