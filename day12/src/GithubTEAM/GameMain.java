package GithubTEAM;

import java.util.Scanner;

public class GameMain {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Game game = new Game();

		game.setLevel(sc);
		game.setRandom();
		game.getStart(sc);

		sc.close();
	}
}


