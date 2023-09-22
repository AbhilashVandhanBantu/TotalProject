package basicPrograms;

public class AddArrayNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {65,23,65,98,134,25,54};
		
		int sum = 0 ;
		for (int i : arr){
			sum = sum+i;
		}
		System.out.println(sum);

	}

}
