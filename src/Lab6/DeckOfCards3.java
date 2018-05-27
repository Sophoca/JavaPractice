package Lab6;    // Fig 7.10

import java.security.SecureRandom;

public class DeckOfCards3 {
    public static final int NUMBER_OF_CARDS=52;
    private static final SecureRandom randomNumbers=new SecureRandom();
    public static Card[] deck = new Card[NUMBER_OF_CARDS];
    private static int currentCard=0;
    //private static int count;

    static String[] faces={"Ace", "Deuce", "Three", "Four", "Five", "Six",
            "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    static String[] suits={"Hearts", "Diamonds", "Clubs", "Spades"};

    public static void shuffle(){
        currentCard=0;
        for(int first=0; first<deck.length; first++){
            int second=randomNumbers.nextInt(NUMBER_OF_CARDS);

            Card temp=deck[first];
            deck[first]=deck[second];
            deck[second]=temp;
        }
    }

    public static Card dealCard(){
        if(currentCard<deck.length){
            return deck[currentCard++];
        }
        else return null;
    }

}
