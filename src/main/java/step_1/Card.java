package step_1;

public class Card {
    private final String SUIT;
    private final int NUMBER;

    public Card(String suit, int number) {
        this.SUIT = suit;
        this.NUMBER = number;
    }
    public String getSUIT(){
        return SUIT;
    }
    public int getNUMBER(){
        return NUMBER;
    }

    @Override
    public String toString() {
        return SUIT + NUMBER;
    }
}
