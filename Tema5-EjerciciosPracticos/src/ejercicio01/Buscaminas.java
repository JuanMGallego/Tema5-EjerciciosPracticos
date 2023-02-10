package ejercicio01;

public class Buscaminas {

	static void setMines(String[] solList) {
		
		int restMines = 6;
		int posMine;
		
		while (restMines > 0) {
			
			posMine = (int)(Math.random() * 20);
			
			if (solList[posMine].equals("-")) {
				
				solList[posMine] = "*";
				
				restMines--;
				
			}
			
		}
		
	}
	
	static void setClues(String[] solList, String[] userList) {
		
		for (int i = 0 ; i < solList.length ; i++) {
			
			if (!solList[i].equals("*")) {
			
				if (i == 0) {
					
					if (solList[i + 1].equals("*")) {
						
						solList[i] = "1";
						
					} else {
						
						solList[i] = "0";
						
					}
					
				} else if (i == solList.length - 1) {
					
					if (solList[i - 1].equals("*")) {
						
						solList[i] = "1";
						
					} else {
						
						solList[i] = "0";
						
					}
				
				} else if (solList[i - 1].equals("*") && solList[i + 1].equals("*")) {
					
					solList[i] = "2";
					
				} else if (solList[i - 1].equals("*") || solList[i + 1].equals("*")) {
					
					solList[i] = "1";
					
				} else {
					
					solList[i] = "0";
					
				}
			
			}
				
		}
		
	}
	
}
