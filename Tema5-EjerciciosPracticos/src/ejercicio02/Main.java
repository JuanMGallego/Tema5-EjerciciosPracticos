package ejercicio02;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int baraja[][] = new int[4][10]; //Baraja de cartas para descartar
		
		final double MAX_PUNTOS = 7.5; //Cantidad limite
		final double PUNTOS_FIGURAS = 0.5; //Valor figuras de la baraja
		
		//Valores de la carta
		int carta = 0;
		int palo = 0;
		
		//Puntos de cada jugador
		double puntosJ1 = 0;
		double puntosJ2 = 0;
		
		//(s/n) para coger otra carta
		String eleccion;
		
		//Titulo
		System.out.println("---- LAS SIETE Y MEDIA ----");
		
		//relleno baraja
		for (int i = 0; i < baraja.length; i++) {
			
			Arrays.fill(baraja[i], 1);
			
		}
		
		
		//Turno jugador 1
		
		System.out.println();
		System.out.println("### Turno del JUGADOR 1 ###");
		System.out.println();
		System.out.print("¿Quieres sacar una carta? (s/n) ");
		
		eleccion = sc.next();
		
		//Mientras diga que si
		while (eleccion.equals("s")) {
			
			//Carta aleatoria
			carta = (int)(Math.random() * 10);
			palo = (int)(Math.random() * 4);
			
			//Bucle por si la carta ya salió
			while (baraja[palo][carta] == 0) {
				
				carta = (int)(Math.random() * 10);
				palo = (int)(Math.random() * 4);
				
			}
			
			//Eliminación de la baraja
			baraja[palo][carta] = 0;
			
			//Cambiar a String el palo
			LasSieteYMedia.cambioPalo(palo);
			
			//Si es una figura
			if (carta >= 7) {
				
				//Añade su valor a los puntos del jugador
				puntosJ1 += PUNTOS_FIGURAS;
				
				//Cambia su nombre
				LasSieteYMedia.cambioFiguras(carta);
				
				//Lo muestra
				System.out.println("Tu carta es: " + LasSieteYMedia.nombreFigura + " de " + LasSieteYMedia.nombrePalo);
			
			//Si no es figura
			} else {
				
				//Suma su valor +1 porque el array es de 0-9
				puntosJ1 += (carta + 1);
				
				//Lo muestra
				System.out.println("Tu carta es: " + (carta + 1) + " de " + LasSieteYMedia.nombrePalo);
				
			}
			
			//Muestra los puntos
			System.out.println("Tienes " + puntosJ1 + " puntos");
			
			//Si no se pasó puede seguir pidiendo o plantarse
			if (puntosJ1 < MAX_PUNTOS) {
				
				System.out.print("¿Quieres sacar otra carta? (s/n) ");
				eleccion = sc.next();
				
			//Si no, sale
			} else {
				
				System.out.println("¡TE HAS PASADO!");
				
				break;
				
			}
			
		}
		
		
		// Lo mismo para el Turno del jugador 2
		
		System.out.println();
		System.out.println("### Turno del JUGADOR 2 ###");
		System.out.println();
		System.out.print("¿Quieres sacar una carta? (s/n) ");
		
		eleccion = sc.next();
		
		while (eleccion.equals("s")) {
			
			carta = (int)(Math.random() * 10);
			palo = (int)(Math.random() * 4);
			
			while (baraja[palo][carta] == 0) {
				
				carta = (int)(Math.random() * 10);
				palo = (int)(Math.random() * 4);
				
			}
			
			baraja[palo][carta] = 0;
			
			LasSieteYMedia.cambioPalo(palo);
			
			if (carta >= 7) {
				
				puntosJ2 += PUNTOS_FIGURAS;
				
				LasSieteYMedia.cambioFiguras(carta);
				
				System.out.println("Tu carta es: " + LasSieteYMedia.nombreFigura + " de " + LasSieteYMedia.nombrePalo);
				
			} else {
				
				puntosJ2 += (carta + 1);
				
				System.out.println("Tu carta es: " + (carta + 1) + " de " + LasSieteYMedia.nombrePalo);
				
			}
			
			System.out.println("Tienes " + puntosJ2 + " puntos");
			
			if (puntosJ2 < MAX_PUNTOS) {
				
				System.out.print("¿Quieres sacar otra carta? (s/n) ");
				eleccion = sc.next();
				
			} else {
				
				System.out.println("¡TE HAS PASADO!");
				
				break;
				
			}
			
		}
		
		//Solución
		System.out.println("El JUGADOR 1 tiene " + puntosJ1 + " puntos y el JUGADOR 2 tiene " + puntosJ2 + " puntos");
		
		//Si se pasan
		if (puntosJ1 > MAX_PUNTOS && puntosJ2 > MAX_PUNTOS) {
			
			System.out.println("¡EMPATE! Los dos jugadores se han pasado");
			
		//Si se pasa el 1
		} else if (puntosJ1 > MAX_PUNTOS) {
			
			System.out.println("¡El jugador 1 se ha pasado, por lo que gana el jugador 2!");
			
		//Si se pasa el 2
		} else if (puntosJ2 > MAX_PUNTOS) {
			
			System.out.println("¡El jugador 2 se ha pasado, por lo que gana el jugador 1!");
		
		//Si tiene mas el 1
		} else if (puntosJ1 > puntosJ2) {
			
			System.out.println("¡El jugador 1 está más cerca de Las Siete Y Media por lo que ha ganado!");
			
		//Si tiene más el 2
		} else if (puntosJ2 > puntosJ1) {
			
			System.out.println("¡El jugador 2 está más cerca de Las Siete Y Media por lo que ha ganado!");
			
		//Si tienen lo mismo
		} else if (puntosJ1 == puntosJ2) {
			
			System.out.println("¡EMPATE! Los dos jugadores consiguieron los mismos puntos");
			
		}
		
		sc.close();
		
	}

}
