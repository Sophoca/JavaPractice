package Lab6;    // Fig 7.9

public class Card {
    private final String face;
    private final String suit;

    public Card(String cardFace, String cardSuit){
        this.face=cardFace;
        this.suit=cardSuit;
    }

    public String getFace() {
        return face;
    }

    public String getSuit() {
        return suit;
    }

    public String toString(){
        return face+" of "+suit;
    }
}
