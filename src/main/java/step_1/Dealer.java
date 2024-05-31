package step_1;

import java.util.ArrayList;
import java.util.List;

public class Dealer {
    private List<Card> hand;
    private static final int HIT_THRESHOLD = 17;

    public Dealer() {
        this.hand = new ArrayList<>();
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

    public boolean isBusted() {
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

    @Override
    public String toString() {
        return "딜러 카드 : " + hand.toString();
    }

    public String toStringWithHiddenCard() {
        if (hand.size() > 1) {
            List<Card> hiddenHand = new ArrayList<>(hand);
            hiddenHand.set(0, new Card("Hidden"));
            return hiddenHand.toString();
        }
        return "딜러 카드 : " + hand;
    }
}
