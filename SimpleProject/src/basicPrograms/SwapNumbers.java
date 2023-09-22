package basicPrograms;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = 20;
		
		System.out.println("before swap a and b is " + a + " and " +b);
		
		int c = a;  // using variable
		a = b;
		b = c;
		
		System.out.println("before swap a and b is " +a + " and " +b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("before swap a and b is " +a + " and " +b);
		

	}

}
