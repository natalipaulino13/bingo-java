package paq1;

import java.util.Random;

public class Bombo {

	private int ultimaBola;
	
	
	
	
	public Bombo() {
		super();
	}
	
	
	public int getUltimaBola() {
		return ultimaBola;
	}

	public void setUltimaBola(int ultimaBola) {
		this.ultimaBola = ultimaBola;
	}



	Random r = new Random();

	public int sacarBola() {

		int bola;

		do {
			bola = r.nextInt(1, 21);

		} while (bola == this.ultimaBola);

		this.ultimaBola = bola;
		return bola;

	}
	
	
	
	
	
}
