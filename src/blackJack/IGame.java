package blackJack;

public interface IGame {

    void addPlayerToGame(Player player);

    void dealPlayersCards();

    void dealMainRound();

    void printWinner();
}
