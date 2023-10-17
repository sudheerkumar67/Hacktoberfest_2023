import SnakeLadder.Game;
import SnakeLadder.Ladder;
import SnakeLadder.Player;
import SnakeLadder.Snake;

public class PlaySnakeNLadder {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        // ---------------- SNAKE & LADDER GAME ------------- //
        Game snakeLadder = new Game.GameBuilder()
                .addPlayer(new Player("Vagish"))
                .addPlayer(new Player("Varun"))
                .addLadder(new Ladder(3,80))
                .addLadder(new Ladder(12, 81))
                .addLadder(new Ladder(45, 82))
                .addLadder(new Ladder(69, 83))
                .addSnake(new Snake(73, 1))
                .addSnake(new Snake(12, 3))
                .build();

        snakeLadder
                .playNext().playNext()
                .playNext().playNext()
                .playNext().playNext()
                .playNext().playNext()
                .playNext().playNext()
                .playNext().playNext();
    }

}