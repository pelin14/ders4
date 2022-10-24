package githubDeneme;

import java.util.Scanner;

public class Swap2 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] array = {56,42,23,14,78,96,37,68,86,12};
		swap(array);
		for(int i:array) {
			System.out.printf(i + " ");
		}
		
	}
	

	public static void swap(int[] array) {
		for(int firstAr = 0 , lastAr=array.length-1 ; firstAr<=4 ; firstAr++,lastAr--) {
			int temp = array[lastAr];
			array[lastAr]=array[firstAr];
			array[firstAr]=temp;
		}
	}
	

}
