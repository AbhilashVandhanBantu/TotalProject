package basicPrograms;

public class EndNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 12345678;
		EndNumber en = new EndNumber();
		int lastdigit = en.lastNumber(num);
		System.out.println(en.multi(lastdigit));

	}
	
	public int lastNumber(int number) {
		int lastNumber = number%10;
		return lastNumber;
	}
	
	public int multi(int num) {
		return num*10;
		
	}

}
