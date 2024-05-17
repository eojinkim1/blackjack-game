package step_1;

import java.util.List;

public class BlackjackGame {
    public static void main(String[] args) {
        printDeck();
//        System.out.println("게임을 시작합니다.");
//
//        System.out.println("딜러 카드 : ");
//        System.out.println("플레이어 카드 : ");
//
//        System.out.println("행동을 결정해주세요. Hit or Stay? (H/S): ");
//
//
//
//        System.out.println("승리했습니다!");
//        System.out.println("패배했습니다ㅠ");
//
//        System.out.println("게임을 다시 시작하시겠습니까? ( Y / N )");
//        System.out.println("새로운 게임을 시작합니다!");
//
//        System.out.println("게임이 종료되었습니다.");

    }

    private static void printDeck() {
        Deck deck = new Deck();
        List<Card> cards = deck.getCards();
        for (Card card : cards) {
            System.out.println(card);
        }
    }
}
