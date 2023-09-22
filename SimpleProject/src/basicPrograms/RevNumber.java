package basicPrograms;

public class RevNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 2335656;
		RevNumber rn = new RevNumber();
		System.out.println(rn.reverse(number));

	}
	
	public int reverse(int num) {
		int rev = 0;
		while(num != 0) {
			int rem = num%10;
			rev = rev*10+rem;
			num = num/10;
		}
		return rev;
		
	}

}
