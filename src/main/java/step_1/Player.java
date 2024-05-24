package step_1;

import java.util.List;

public class Player {
    private List<Card> hand;
    private static final int blackJack = 21;
    public Player(List<Card> hand) {
        this.hand = hand;
    }

    public void hit(Card card){
        hand.add(card);
    }

    public void stay(){
    }

    public int getHandValue() {
        return BlackJackUtils.handValue(hand);
    }
    public boolean isBusted(){
        return BlackJackUtils.isBusted(hand);
    }
    public List<Card> getHand(){
        return hand;
    }
}
