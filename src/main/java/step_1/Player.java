package step_1;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Card> hand;
    public Player() {
        this.hand = new ArrayList<>();
    }

    public void addCard(Card card){
        hand.add(card);
    }

    public int getHandValue() {
        return BlackJackUtils.handValue(hand);
    }
    public boolean isBusted(){
        return BlackJackUtils.isBusted(hand);
    }

    @Override
    public String toString() {
        return hand.toString();
    }
}
