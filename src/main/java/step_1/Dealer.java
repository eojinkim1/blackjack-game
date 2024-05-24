package step_1;

import java.util.List;

public class Dealer {
    private List<Card> hand;
    private static final int HIT_THRESHOLD = 17;

    public Dealer(List<Card> hand) {
        this.hand = hand;
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public List<Card> getHand() {
        return hand;
    }

    public int getHandValue() {
        return BlackJackUtils.handValue(hand);
    }
    public boolean isBusted(){
        return BlackJackUtils.isBusted(hand);
    }

    public boolean shouldHit() {
        return getHandValue() < HIT_THRESHOLD;
    }

    public void drawCard(Deck deck) {
        while (shouldHit()) {
            addCard(deck.drawCard());
        }
    }
}
