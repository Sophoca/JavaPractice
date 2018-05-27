package Lab6;    // Fig 7.10

import java.security.SecureRandom;

enum Faces {
    Ace(130), Deuce(10), Three(20), Four(30), Five(40), Six(50), Seven(60), Eight(70),
    Nine(80), Ten(90), Jack(100), Queen(110), King(120);
    private int value;

    private Faces(int value) {
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}

enum Suits {
    Hearts(3), Diamonds(2), Clubs(1), Spades(4);
    private int value;

    private Suits(int value) {
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}

public class DeckOfCards2 {
    private Card2[] deck;
    private int currentCard;
    private static final int NUMBER_OF_CARDS = 52;
    private static final SecureRandom randomNumbers = new SecureRandom();

    DeckOfCards2(){
        deck = new Card2[NUMBER_OF_CARDS];
        currentCard=0;

        for(int count=0; count<deck.length; count++){
            deck[count]=new Card2((count%13+1)*10, (count/13)+1);
        }
    }

    public void shuffle(){
        currentCard=0;
        for(int first=0; first<deck.length; first++){
            int second=randomNumbers.nextInt(NUMBER_OF_CARDS);

            Card2 temp=deck[first];
            deck[first]=deck[second];
            deck[second]=temp;
        }
    }

    public Card2 dealCard(){
        if(currentCard<deck.length){
            return deck[currentCard++];
        }
        else return null;
    }
}
