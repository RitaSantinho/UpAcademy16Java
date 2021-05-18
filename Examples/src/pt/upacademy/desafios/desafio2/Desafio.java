package pt.upacademy.desafios.desafio2;

public class Desafio {

	public static String order(String string) {
		if(string.equals("")) {
			return string;
		}
		String[] parts = string.split(" ");
		String orderedParts = "";
		Integer count = 1;
		
		while (count <= parts.length) {
			for (int i = 0; i < parts.length; i++) {

				if (parts[i].contains(String.valueOf(count))) {
					orderedParts += parts[i]+" ";
					count++;
					continue;
				}
				
			}
		}
		System.out.println(orderedParts.trim());
		return orderedParts.trim();
	}
}