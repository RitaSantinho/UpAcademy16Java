package pt.upacademy.desafios.desafio5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Desafio {

	public static int countDays(String string, String string2) {
		String[] one =string.split(" ");
		String[] two= string2.split(" ");
		LocalDate firstDate = LocalDate.of (Integer.parseInt(one[2]),Integer.parseInt(one[1]),Integer.parseInt(one[0]));
		LocalDate secondDate = LocalDate.of(Integer.parseInt(two[2]),Integer.parseInt(two[1]),Integer.parseInt(two[0]));
		return (int)ChronoUnit.DAYS.between(firstDate, secondDate);
	
	}

}
