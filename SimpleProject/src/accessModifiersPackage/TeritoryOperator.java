package accessModifiersPackage;

public class TeritoryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 100;
		int y = 50;
		int z = 80;
		
		//int max = (x<y)?x:y;
		
		int max = (x>y&x>z)?x : ((y>x&y>z)?y:z);
		
		System.out.println(max);

	}

}
