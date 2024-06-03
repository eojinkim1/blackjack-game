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
    @Override
    public String toString() {
        return hand.toString();
    }
}
