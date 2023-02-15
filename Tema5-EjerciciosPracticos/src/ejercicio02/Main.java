package ejercicio02;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int baraja[][] = new int[4][10];
		
		int player = 1;
		float pointsJ1 = 0, pointsJ2 = 0;
		int carta = 0;
		int palo = 0;
		boolean primeraCarta = true;
		String election;
		String cartaMostrada;
		String paloMostrado = null;
		
		System.out.println("---- LAS SIETE Y MEDIA ----");
		System.out.println();
		
		Arrays.fill(baraja, 1);
		
		while (player <= 2) {
		
			System.out.println("### Turno del jugador " + player + " ###");
			
			if (primeraCarta == true) {
				
				System.out.print("¿Quieres sacar una carta? (s/n) ");
				
				primeraCarta = false;
				
			} else {
				
				System.out.print("¿Quieres sacar otra carta? (s/n) ");
				
			}
			
			election = sc.next();

			if (election.equals("s")) {

				carta = (int)(Math.random() * 10);
				palo = (int)(Math.random() * 4);
				
				while (baraja[carta][palo] == 0) {
					
					carta = (int)(Math.random() * 10);
					palo = (int)(Math.random() * 4);
					
				}
				
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
				
				switch (palo) {
				
					case 0 -> {
						
						paloMostrado = "Oros";
						
					}

					case 1 -> {
						
						paloMostrado = "Copas";
						
					}

					case 2 -> {
						
						paloMostrado = "Espadas";
						
					}
						
					case 3 -> {
						
						paloMostrado = "Bastos";
						
					}
					
				}
				
				if (carta <= 6) {
					
					System.out.println("Su carta es: " + carta + " de " + paloMostrado);
					
				} else {
					
					System.out.println("Su carta es: " + carta + " de " + paloMostrado);
					
				}
				
				if (player == 1) {
					
					System.out.println("Tienes " + pointsJ1 + " puntos");
					
				} else {
					
					System.out.println("Tienes " + pointsJ2 + " puntos");
					
				}
					

			} else {
				
				continue;
				
			}
			
			if (points)
			player++;
				
		}

	}

}
