package step_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private final List<Card> CARD_DECK;
    public Deck() {
        this.CARD_DECK = new ArrayList<>();
        initializeDeck();
        shuffleDeck();
    }
    private void initializeDeck(){
        String[] suits = {"♦", "♥", "♣", "♠"};
        for (String suit : suits) {
            for (int number = 1; number <= 13; number++) {
                CARD_DECK.add(new Card(suit, number));
            }
        }
    }
    private void shuffleDeck(){
        Collections.shuffle(CARD_DECK);
    }
    public List<Card> getCARD_DECK(){
        return CARD_DECK;
    }
    public Card drawCard(){
        if (CARD_DECK.isEmpty()){
            return null;
        }
        return CARD_DECK.removeFirst();
    }
    public void resetDeck(){
        CARD_DECK.clear();
        initializeDeck();
        shuffleDeck();
    }
}
