package pt.upacademy.desafios.desafio4;

import java.util.stream.Stream;
public class Desafio {

	public static int[] ints(String string) {
		if(string.equals("")) {
			return new int [] {};
		}
		String[] numbers = string.split(" ");
		return Stream.of(numbers)
				.filter(i->i.chars().allMatch( Character::isDigit ))
				.mapToInt(i->Integer.parseInt(i))
				.toArray();
	}

}
