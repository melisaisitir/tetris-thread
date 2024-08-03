package game;

public class Launcher {
	public static void main(String[] args) {

		Game game1 = new Game("My Tetris 1");
		game1.start();

		Game game2 = new Game("My Tetris 2");

		game2.start();
	}
}
