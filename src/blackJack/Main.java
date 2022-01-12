package blackJack;

public class Main {
    public static void main(String[] args) {

        Dealer dealer = new Dealer();
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();

        Game blackJack = new Game();
        blackJack.addPlayerToGame(dealer);
        blackJack.addPlayerToGame(player1);
        blackJack.addPlayerToGame(player2);
        blackJack.addPlayerToGame(player3);

        blackJack.dealPlayersCards();
        blackJack.dealMainRound();
        blackJack.printWinner();
        System.out.println();

    }

}
