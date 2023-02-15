package ejercicio02;

public class LasSieteYMedia {

	static String nombreFigura;
	static String nombrePalo;
	
	static void cambioFiguras(int carta) {
		
		switch (carta) {
		
			case 7 -> {
				
				nombreFigura = "Sota";
				
			}
			
			case 8 -> {
				
				nombreFigura = "Caballo";
				
			}
			
			case 9 -> {
				
				nombreFigura = "Rey";
				
			}
			
			default -> {
				
				break;
				
			}
		
		}
		
	}
	
	static void cambioPalo(int palo) {
		
		switch (palo) {
		
			case 0 -> {
				
				nombrePalo = "Copas";
				
			}
			
			case 1 -> {
				
				nombrePalo = "Oros";
				
			}
			
			case 2 -> {
				
				nombrePalo = "Espadas";
				
			}
		
			case 3 -> {
				
				nombrePalo = "Bastos";
				
			}
			
			default -> {
				
				break;
				
			}
			
		}
		
	}
	
}
