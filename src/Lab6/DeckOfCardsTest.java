package Lab6;    // Fig 7.11

import static Lab6.DeckOfCards3.*;

public class DeckOfCardsTest {
    public static void main(String[] args) {
        DeckOfCards myDeckOfCards=new DeckOfCards();
        myDeckOfCards.shuffle();

        //----------Question 3-B-----------
        System.out.println("----------Question 3-B-----------");
        Card A=myDeckOfCards.dealCard(), B=myDeckOfCards.dealCard();
        System.out.printf("%nA: %-19s%nB: %-19s%n", A, B);
        myDeckOfCards.compare(A, B);

        //----------Question 3-C-----------
        System.out.println("\n----------Question 3-C-----------\n");
        DeckOfCards2 myDeckOfCards2=new DeckOfCards2();
        myDeckOfCards2.shuffle();
        String[] tempDeck=new String[53];
        for(int i=1; i<=52; i++){
            Card2 card=myDeckOfCards2.dealCard();
            String temp=card.toString();
            String[] splitTemp=temp.split(" of ");
            int tempFace=Integer.parseInt(splitTemp[0]);
            int tempSuit=Integer.parseInt(splitTemp[1]);

            for(Faces face:Faces.values()){
                for(Suits suit:Suits.values()){
                    if(tempFace==face.getValue()&&tempSuit==suit.getValue()){
                        tempDeck[i]=face.name()+" of "+suit.name();
                    }
                }
            }
        }
        for(int j=1; j<=52; j++){
            System.out.printf("%-19s", tempDeck[j]);
            if(j%4==0) System.out.println();
        }

        //----------Question 3-D-----------
        System.out.println("\n----------Question 3-D-----------\n");
        deck = new Card[NUMBER_OF_CARDS];

        for(int count=0; count<deck.length; count++){
            deck[count]=new Card(faces[count%13], suits[count/13]);
        }
        shuffle();
        for(int i=1; i<=52; i++){
            System.out.printf("%-19s", dealCard().toString());
            if(i%4==0) System.out.println();
        }

    }
}
