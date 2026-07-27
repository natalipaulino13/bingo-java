package paq1;

import java.util.Random;

public class Jugador {

	private String nombre;
	private int numero1;
	private int numero2;
	private int numero3;
	private boolean aciNumero1; //false: no ha acertado
	private boolean aciNumero2;
	private boolean aciNumero3;
	
	public Jugador() {
		super();
	}
	public Jugador(String nombre) {
		super();
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumero1() {
		return numero1;
	}
	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}
	public int getNumero2() {
		return numero2;
	}
	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}
	public int getNumero3() {
		return numero3;
	}
	public void setNumero3(int numero3) {
		this.numero3 = numero3;
	}
	public boolean isAciNumero1() {
		return aciNumero1;
	}
	public void setAciNumero1(boolean aciNumero1) {
		this.aciNumero1 = aciNumero1;
	}
	public boolean isAciNumero2() {
		return aciNumero2;
	}
	public void setAciNumero2(boolean aciNumero2) {
		this.aciNumero2 = aciNumero2;
	}
	public boolean isAciNumero3() {
		return aciNumero3;
	}
	public void setAciNumero3(boolean aciNumero3) {
		this.aciNumero3 = aciNumero3;
	}
	
	
	Random random = new Random ();
		
	public void asignarCarton() {
		this.numero1 = random.nextInt(1, 21);
		do {
			this.numero2 = random.nextInt(1, 21);
		} while (this.numero1 == this.numero2);
		do {
			this.numero3 = random.nextInt(1, 21);
		} while (this.numero3 == this.numero1 || this.numero3 == this.numero2);
		System.out.println(
				"\nLos números de " + this.nombre + " son " + this.numero1 + ", " + this.numero2 + " y " + this.numero3);
	}
	
	
	public void comprobarBola(int bola) {
		if (bola == this.numero1) {
			this.aciNumero1 = true;
			System.out.println("\nLa jugadora " + this.nombre + " tiene el número " + bola);
		}
		if (bola == this.numero2) {
			this.aciNumero2 = true;
			System.out.println("\nLa jugadora " + this.nombre + " tiene el número " + bola);
		}
		if (bola == this.numero3) {
			this.aciNumero3 = true;
			System.out.println("\nLa jugadora " + this.nombre + " tiene el número " + bola);
		}
	}
	
	public boolean esGanador() {
		return this.aciNumero1 && this.aciNumero2 && this.aciNumero3;
	}
	
	
		
		
		
	
	
		
		
		
		
	}

	
	

		
		
	
	
	

