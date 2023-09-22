package basicPrograms;

public class LargeNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[] = {5,7,10};
		
		int max = num[0];
		for(int i:num) {
			
			if (i>max) {
				max = i;
			}
		}
		System.out.println(max);

	}

}
