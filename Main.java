
public class Main {

	static int posicao = 0;
	static int goal = 300;
	static int totalGrilos = 6;

	public static void main(String[] args) {

		Grilo[] g = new Grilo[totalGrilos];

		for (int i = 0; i < totalGrilos; i++) {

			g[i] = new Grilo(i + 1, goal);
			g[i].start();

		}

	}

}
