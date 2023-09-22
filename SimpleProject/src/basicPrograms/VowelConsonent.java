package basicPrograms;

import java.util.Scanner;

public class VowelConsonent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char c = ')';
		
		if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
			System.out.println("Vowel");
		}
		else if((c>='a'&c<='z')||(c>='A'&c<='Z')){
			System.out.println("Consonent");
		}
		else {
			System.out.println("not alphabet");
		}
		
			
		}

	}
