
public class Grilo extends Thread {

	int pulos;
	int goal;
	int distAtual;
	int lugar = 0;
	int id;
	int lap;

	public Grilo(int id, int goal) {
		this.id = id;
		this.goal = goal;

	}

	public void win() {

		Main.posicao++;
		System.out.println("O Grilo " + id + " venceu em " + Main.posicao + "� lugar com " + pulos + " pulos.");

	}

	public void run() {

		while (this.distAtual < goal) {
			int distpulo = (int) (Math.random() * 100.0);
			distAtual = distAtual + distpulo;
			System.out.println("O Grilo " + id + " pulou " + distpulo + " e ja percorreu " + distAtual);
			this.pulos++;
			distpulo = 0;

			try {
				sleep(100 + (int) (Math.random() * 100.0));
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}

		win();

	}

}
