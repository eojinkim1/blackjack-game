package step_1;

import java.util.List;

public class BlackJackUtils {
    private static final int blackJack = 21;
    public static int handValue(List<Card> hand){
        int totalNumbers = 0;
        int aceCount = 0;

        for (Card card : hand) {
            int cardNumber = card.getNUMBER();
            if (cardNumber == 1){
                aceCount++;
                totalNumbers += 11;
            } else if (cardNumber >= 10){
                totalNumbers += 10;
            } else {
                totalNumbers +=cardNumber;
            }
        }
        while (totalNumbers > 21 && aceCount > 0){
            totalNumbers -= 10;
            aceCount--;
        }
        return totalNumbers;
    }
    public static boolean isBusted(List<Card> hand ){
        return handValue(hand) > blackJack;
    }
}
