package basicPrograms;

public class StarProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 5;
		
		for (int i =1 ; i <= num ; i++) {
			
			for (int j = 0 ; j<i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
