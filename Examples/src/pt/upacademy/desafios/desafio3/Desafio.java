package pt.upacademy.desafios.desafio3;

public class Desafio {

	public static int points(String[] strings) {
		int totalPoints=0;
		for(String goals : strings) {
			String[] game = goals.split(":");
			if(Integer.parseInt(game[0])> Integer.parseInt(game[1])) {
				totalPoints+=3;
			}
			if(Integer.parseInt(game[0])== Integer.parseInt(game[1])) {
				totalPoints+=1;
			}
			if(Integer.parseInt(game[0])< Integer.parseInt(game[1])) {
				totalPoints+=0;
			}
			
		}
		return totalPoints;
	}

}
