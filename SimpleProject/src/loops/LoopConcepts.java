package loops;

public class LoopConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Arguments aug = new Arguments();
		aug.banglore();
		aug.adding(10, 20);
		System.out.println(aug.customerId(12, "Abhi", 2023));
	}
}


class Arguments{
	
	public void banglore() {   //No Arguments method
		System.out.println("this is banglore");
	}
	
	public int adding(int a , int b) {
		int sum = a+b;
		return sum;
	}
	public String concat(String name , String user) {
		String str = name+user;
		return str;
		
	}
	
	public String customerId(int sNo , String name , int year) {
		String str = sNo+name+year;
		return str;
	}
}
