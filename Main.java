package paq1;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scLine = new Scanner (System.in);
		
		Bombo bombo = new Bombo();

		Jugador j1 = new Jugador("Irene");
		Jugador j2 = new Jugador("Nataly");
		Jugador j3 = new Jugador("Milena");
		Jugador j4 = new Jugador("Rocío");
		Jugador j5 = new Jugador("Kimmy");

		j1.asignarCarton();
		j2.asignarCarton();
		j3.asignarCarton();
		j4.asignarCarton();
		j5.asignarCarton();

		
		System.out.println("\nPulsa ENTER para sacar una bola ");
		scLine.nextLine(); 
		
		boolean bolaGanadora = false; 
		
		while (!bolaGanadora) {
			int bola = bombo.sacarBola();
			System.out.println("Ha salido la bola " + bola);
			j1.comprobarBola(bola);
			j2.comprobarBola(bola);
			j3.comprobarBola(bola);
			j4.comprobarBola(bola);
			j5.comprobarBola(bola);
			
			if (j1.esGanador()) {
				System.out.println("\nLa jugadora " + j1.getNombre() + " ha ganado");
				bolaGanadora = true; 
			}else if (j2.esGanador()) {
				System.out.println("\nLa jugadora " + j2.getNombre() + " ha ganado");
				bolaGanadora = true; 
			}else if (j3.esGanador()) {
				System.out.println("\nLa jugadora " + j3.getNombre() + " ha ganado");
				bolaGanadora = true; 
			}else if (j4.esGanador()) {
				System.out.println("\nLa jugadora " + j4.getNombre() + " ha ganado");
				bolaGanadora = true; 
			}else if (j5.esGanador()) {
				System.out.println("\nLa jugadora " + j5.getNombre() + " ha ganado");
				bolaGanadora = true; 
			}
			if (!bolaGanadora) {
				System.out.println("\nPulsa ENTER para sacar una bola");
				scLine.nextLine(); 
			}
		}
		
		System.out.println("La partida ha finalizado");
			
		
	}

}
