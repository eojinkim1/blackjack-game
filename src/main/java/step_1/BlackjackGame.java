package step_1;

import java.util.Scanner;
public class BlackjackGame {
    private Deck deck = new Deck();
    private Player player = new Player();
    private Dealer dealer = new Dealer();

    public static void main(String[] args) {
        BlackjackGame game = new BlackjackGame();
        game.startGame();
    }
    public void startGame() {
        System.out.println("게임을 시작합니다.");
        dealCards();
        statusDisplay();

        play();

        if (!player.isBusted()){
            dealer.drawCard(deck);
        }

        showFinalHands();
        determineWinner();
    }

    private void dealCards() {
        player.addCard(deck.drawCard());
        dealer.addCard(deck.drawCard());
        player.addCard(deck.drawCard());
        dealer.addCard(deck.drawCard());
    }

    private void statusDisplay() {
        System.out.println("플레이어 카드 : " + player);
        System.out.println("딜러 카드 : " + dealer.toStringWithHiddenCard());
    }

    private void play() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("행동을 결정해주세요. Hit or Stay? (H/S): ");
            String action = scanner.next().toUpperCase();

            if (action.equals("H")) {
                player.addCard(deck.drawCard());
                if (player.isBusted()) {
                    System.out.println("플레이어 버스트!");
                    break;
                }
                dealer.drawCard(deck);
                    statusDisplay();
                if (dealer.isBusted()){
                    System.out.println("딜러 버스트!");
                    break;
                }
            } else if (action.equals("S")) {
                break;
            } else {
                System.out.println("잘못된 입력입니다. 'H'를 입력해서 히트하거나 'S'를 입력해서 스테이하세요.");
            }
        }
    }

    private void showFinalHands() {
        System.out.println("카드를 오픈합니다.");
        System.out.println("플레이어 카드 : " + player);
        System.out.println("플레이어 카드 합계: " + player.getHandValue());
        System.out.println("딜러 카드 : " + dealer);
        System.out.println("딜러 카드 합계: " + dealer.getHandValue());
    }

    private void determineWinner() {
        int playerValue = player.getHandValue();
        int dealerValue = dealer.getHandValue();

        if (player.isBusted() && !dealer.isBusted()) {
            System.out.println("딜러 승!");
        } else if (dealer.isBusted() && !player.isBusted()) {
            System.out.println("플레이어 승!");
        } else if (playerValue > dealerValue) {
            System.out.println("플레이어 승!");
        } else if (playerValue < dealerValue) {
            System.out.println("딜러 승!");
        } else {
            System.out.println("무승부!");
        }
    }
}