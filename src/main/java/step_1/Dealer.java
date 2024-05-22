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
        int totalNumbers = 0;
        int aceCount = 0;

        for (Card card : hand) {
            int cardNumber = card.getNUMBER();
            if (cardNumber == 1) {
                aceCount++;
                totalNumbers += 11;
            } else if (cardNumber >= 10) {
                totalNumbers += 10;
            } else {
                totalNumbers += cardNumber;
            }
        }
        while (totalNumbers > 21 && aceCount > 0) {
            totalNumbers -= 10;
            aceCount--;
        }
        return totalNumbers;
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
