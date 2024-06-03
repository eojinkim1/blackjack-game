package step_1;

public class Card {
    private final String SUIT;
    private final int NUMBER;

    public Card(String suit, int number) {
        this.SUIT = suit;
        this.NUMBER = number;
    }
    public Card(String hidden){
        this.SUIT = hidden;
        this.NUMBER = 0;
    }

    public int getNUMBER(){
        return NUMBER;
    }

    @Override
    public String toString() {
        if (NUMBER == 0) {
            return "Hidden";
        } else {
            String textCard = switch (NUMBER) {
                case 1 -> "A";
                case 11 -> "J";
                case 12 -> "Q";
                case 13 -> "K";
                default -> String.valueOf(NUMBER);
            };
            return SUIT + textCard;
        }
    }
}
