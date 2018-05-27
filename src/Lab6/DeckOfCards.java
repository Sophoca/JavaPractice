package Lab6;    // Fig 7.10

import java.security.SecureRandom;

public class DeckOfCards {
    private Card[] deck;
    private static int currentCard;
    private static final int NUMBER_OF_CARDS=52;
    private static final SecureRandom randomNumbers=new SecureRandom();

    public DeckOfCards(){
        String[] faces={"Ace", "Deuce", "Three", "Four", "Five", "Six",
        "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String[] suits={"Hearts", "Diamonds", "Clubs", "Spades"};
        deck = new Card[NUMBER_OF_CARDS];
        currentCard=0;

        for(int count=0; count<deck.length; count++){
            deck[count]=new Card(faces[count%13], suits[count/13]);
        }
    }

    public void shuffle(){
        currentCard=0;
        for(int first=0; first<deck.length; first++){
            int second=randomNumbers.nextInt(NUMBER_OF_CARDS);

            Card temp=deck[first];
            deck[first]=deck[second];
            deck[second]=temp;
        }
    }

    public Card dealCard(){
        if(currentCard<deck.length){
            return deck[currentCard++];
        }
        else return null;
    }

    private int reFace(Card A){
        String face=A.getFace();
        switch (face){
            case "Ace":
                return 130;
            case "King":
                return 120;
            case "Queen":
                return 110;
            case "Jack":
                return 100;
            case "Ten":
                return 90;
            case "Nine":
                return 80;
            case "Eight":
                return 70;
            case "Seven":
                return 60;
            case "Six":
                return 50;
            case "Five":
                return 40;
            case "Four":
                return 30;
            case "Three":
                return 20;
            case "Deuce":
                return 10;
            default:
                return 0;
        }
    }

    private int reSuit(Card A){
        String suit=A.getSuit();
        switch(suit){
            case "Spades":
                return 4;
            case "Hearts":
                return 3;
            case "Diamonds":
                return 2;
            case "Clubs":
                return 1;
            default:
                return 0;
        }
    }

    public Card compare(Card A, Card B){
        Card temp=null;
        int a=reFace(A)+reSuit(A), b=reFace(B)+reSuit(B);
        if(a>b){
            System.out.println("\nA is win!");
            temp=A;
        }
        else if(b>a){
            System.out.println("\nB is win!");
            temp=B;
        }
        else System.out.println("\nError!");
        return temp;
    }
}
