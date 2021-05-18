package pt.upacademy.desafiosResolutionJSC.desafio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Desafio {

	private static Scanner scanner;

	public static int[] ints(String msg) {
		int option = 4;
		
		switch (option) {
		case 1:
			return result1(msg);
		case 2:
			return result2(msg);
		case 3:
			return result3(msg);
		default:
			return result4(msg);
		}
	}

	private static int[] result1(String msg) {
		List<Integer> result = new ArrayList<Integer>();

		scanner = new Scanner(msg);
		while (scanner.hasNext()) {
			if (scanner.hasNextInt()) {
				result.add(scanner.nextInt());
			} else {
				scanner.next();
			}
		}
		
		return result.stream().mapToInt(i -> i).toArray();
	}
	
	private static int[] result2(String msg) {
		List<Integer> result = new ArrayList<Integer>();

		String[] numbers = msg.split(" ");
		for (String string : numbers) {
			try {
				int num = Integer.parseInt(string);
				result.add(num);
			} catch (Exception e) {}
		}
		
		return result.stream().mapToInt(i -> i).toArray();
	}
	
	private static int[] result3(String msg) {
		List<Integer> result = new ArrayList<Integer>();

		if (msg == "") return new int[]{};
		String[] numbers = msg.split(" ");
		for (String s : numbers) {
			boolean isInt = true;
			for(int i = 0; i < s.length(); i++) {
		        if(Character.digit(s.charAt(i),10) < 0) {
		        	isInt = false;
		        	break;
		        }
		    }
			if (isInt) result.add(Integer.parseInt(s));
		}
		
		return result.stream().mapToInt(i -> i).toArray();
	}
	
	private static int[] result4(String msg) {
		return Stream.of(msg.split(" "))
				.filter(i-> i.matches("-?\\d+"))
				.mapToInt(i -> Integer.parseInt(i))
				.toArray();
	}
}