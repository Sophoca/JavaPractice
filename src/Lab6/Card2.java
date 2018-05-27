package Lab6;    // Fig 7.9

public class Card2 {
    private final int face;
    private final int suit;

    public Card2(int cardFace, int cardSuit){
        this.face=cardFace;
        this.suit=cardSuit;
    }

    public int getFace() {
        return face;
    }

    public int getSuit() {
        return suit;
    }

    public String toString(){
        return face+" of "+suit;
    }
}
