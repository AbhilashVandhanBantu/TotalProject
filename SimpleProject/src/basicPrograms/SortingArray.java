package basicPrograms;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {23,56,3,4,89,45,65};
		
		Arrays.sort(arr);
		
		for(int i : arr) {
			System.out.println(i);
		}
		
		String arr1[] = {"Abhi" , "Siva" , "New" , "Old"};
		Arrays.sort(arr1);
		
		for(String j : arr1) {
			System.out.println(j);
		}
		

	}

}
