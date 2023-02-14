package ejercicio01;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String userList[] = {"#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#"};
		String solList[] = {"-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-"};
		
		int userSelect;

		int moves = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---- BUSCAMINAS 1D ----");
		System.out.println();
		
		Buscaminas.setMines(solList);
		
		Buscaminas.setClues(solList);
		
		//Bucle hasta mirar todos los huecos
		while (moves < 14) {
			
			System.out.println(Arrays.toString(userList));
			System.out.println();
			System.out.print("Descubra una posición (0-19): ");
			
			userSelect = sc.nextInt();
			
			System.out.println();
			
			//Vuelve a empezar si ya fue seleccionado anteriormente
			if (userList[userSelect] == solList[userSelect]) {
				
				continue;
				
			} else {
			
				//Fuera de rango
				if (userSelect < 0 || userSelect > 19) {
					
					System.out.println("ERROR: Ha introducido una posición incorrecta");
					System.out.println();
					continue;
					
				} else {
					
					userList[userSelect] = solList[userSelect];
					
					moves++;
					
					if (solList[userSelect].equals("*")) {
						
						System.out.println("¡¡¡BOOM!!!");
						System.out.println();
						
						break;
						
					}
					
				}
			
			}
				
		}
		
		if (moves == 14) {
			
			System.out.println("¡¡GANASTE!!");
			
		}
		
		System.out.println(Arrays.toString(solList));
	
		sc.close();
		
	}

}
