package basicPrograms;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char user = 'C';
		
		char vowels[] = {'a','e','i','o','u','A','E','I','O','U'};
		int count = 0;
		for (int i = 0 ; i<vowels.length;i++) {
			
			if (user==vowels[i]) {
				System.out.println("Given character is vowel");
				count++;
			}
			
		}
		if (count !=1) {
			System.out.println("Given character is Consonent");
		}

	}

}
