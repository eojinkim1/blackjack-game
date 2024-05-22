package step_1;

import java.util.List;

public class Player {
    private List<Card> hand;
    public Player(List<Card> hand) {
        this.hand = hand;
    }

    public void hit(Card card){
        hand.add(card);
    }

    public void stay(){
    }

    public List<Card> getHand(){
        return hand;
    }
}
