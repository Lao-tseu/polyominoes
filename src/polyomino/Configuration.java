package polyomino;

public class Configuration {

	public Polyomino[] polyominoes;
	public Point[] bottomLeft;
	public int xmax;
	public int ymax;
	public int tailleTuiles;
	public int width;

	public Configuration(Polyomino[] polyominoes, Point[] bottomLeft, int xmax, int ymax,
			int tailleTuiles, int width) {
		this.polyominoes = polyominoes;
		this.bottomLeft = bottomLeft;
		this.xmax = xmax;
		this.ymax = ymax;
		this.tailleTuiles = tailleTuiles;
		this.width = width;
	}

	public Configuration(Polyomino[] polyominoes) {
		this.polyominoes = polyominoes;
		int N = this.polyominoes.length;
		this.bottomLeft = new Point[N];
		for (int i = 0; i < N; i++) {
			this.bottomLeft[i] = new Point();
		}
		int x = 0;
		this.ymax = 0;
		for (int i = 0; i < N; i++) {
			Polyomino p = this.polyominoes[i];
			this.bottomLeft[i].x = x;
			this.bottomLeft[i].y = 0;
			System.out.println(bottomLeft[i]);
			x += p.largeur + 1;
			this.ymax = Math.max(this.ymax, p.hauteur);
		}
		this.xmax = x;
		this.tailleTuiles = 10 * 25 / N;
		this.width = this.tailleTuiles / 10;

	}

}