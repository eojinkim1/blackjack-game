package step_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards;

    public Deck() {
        this.cards = new ArrayList<>();
        initializeDeck();
        shuffleDeck();
    }
    private void initializeDeck(){
        String[] suits = {"♦", "♥", "♣", "♠"};
        for (String suit : suits) {
            for (int number = 1; number <= 13; number++) {
                cards.add(new Card(suit, number));
            }
        }
    }
    private void shuffleDeck(){
        Collections.shuffle(cards);
    }
    public List<Card> getCards(){
        return cards;
    }
    public Card drawCard(){
        if (cards.isEmpty()){
            return null;
        }
        return cards.remove(0);
    }

    public void printDeck() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }
}
