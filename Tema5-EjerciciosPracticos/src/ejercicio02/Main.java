package ejercicio02;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int baraja[][] = new int[4][10];
		
		int player = 1;
		int pointsJ1 = 0, pointsJ2 = 0;
		int carta = 0;
		int palo = 0;
		String election;
		String cartaMostrada;
		String paloMostrado;
		
		System.out.println("---- LAS SIETE Y MEDIA ----");
		System.out.println();
		
		while (player <= 2 && pointsJ1 <= 7.5) {
		
			System.out.println("### Turno del jugador " + player + " ###");
			System.out.print("¿Quieres sacar una carta? (s/n) ");
			election = sc.next();
			
			Arrays.fill(baraja, 1);

			if (election.equals("s")) {
			
				while (baraja[carta][palo] == 1) {
					
					carta = (int)(Math.random() * 10);
					palo = (int)(Math.random() * 4);
					
					switch (carta) {
					
					case 7:
						
						if (player == 1) {
							
							pointsJ1 += 0.5;
							
						} else {
							
							pointsJ2 += 0.5;
							
						}
						
						cartaMostrada = "Sota";
						
					case 8:
						
						if (player == 1) {
							
							pointsJ1 += 0.5;
							
						} else {
							
							pointsJ2 += 0.5;
							
						}
						
						cartaMostrada = "Caballo";
						
					case 9:
						
						if (player == 1) {
							
							pointsJ1 += 0.5;
							
						} else {
							
							pointsJ2 += 0.5;
							
						}
						
						cartaMostrada = "Rey";
					
					default:
						
						if (player == 1) {
							
							pointsJ1 += carta;
							
						} else {
							
							pointsJ2 += carta;
							
						}
					
					}
					
				}
			
			}
				
		}

	}

}
