package step_1;

import java.util.List;

public class BlackJackUtils {
    private static final int BLACKJACK = 21;
    private static final int FACE_CARD_VALUE = 10;
    private static final int ACE_HIGH_VALUE = 11;
    private static final int ACE_LOW_VALUE = 1;
    public static int handValue(List<Card> hand){
        int totalNumbers = 0;
        int aceCount = 0;

        for (Card card : hand) {
            int cardNumber = card.getNUMBER();
            if (cardNumber == ACE_LOW_VALUE){
                aceCount++;
                totalNumbers += ACE_HIGH_VALUE;
            } else {
                totalNumbers += Math.min(cardNumber, FACE_CARD_VALUE);
            }
        }
        totalNumbers = adjustAce(totalNumbers, aceCount);
        return totalNumbers;
    }

    private static int adjustAce(int totalNumbers, int aceCount) {
        while (totalNumbers > BLACKJACK && aceCount > 0){
            totalNumbers -= 10;
            aceCount--;
        }
        return totalNumbers;
    }

    public static boolean isBusted(List<Card> hand ){
        return handValue(hand) > BLACKJACK;
    }
}
