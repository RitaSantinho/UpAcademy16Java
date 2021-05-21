package pt.upacademy.Arrays;

import java.util.Arrays;

public class ExistOnIntArray {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};

		System.out.println(Arrays.stream(arr).anyMatch(x -> x == 2));
		System.out.println(Arrays.stream(arr).anyMatch(x -> x == 6));

		

		System.out.println(existInArray(arr, 2));
		System.out.println(existInArray(arr, 6));
	}
	
	public static boolean existInArray(int[] arr, int val) {
		boolean found = false;
		for(int x : arr){
			if(x == val){
		        found = true;
		        break;
		    }
		}
		return found;
	}

}
