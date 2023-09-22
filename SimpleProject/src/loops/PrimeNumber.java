package loops;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 50;
		for (int i =2 ; i<=n ; i++) {   // 2 to 50      49 times // 1 is not a prime or composite
			System.out.println(i);  // 3  (2)  1 or 3
									//17 (2 to 16)
		}

	}

}
/*
int n=60; // we are initializing the value
for(int i=2;i<=n;i++) { // here we are  verifying the condition and we are informing to start the execution from 2
	int count=0; 
	for (int j=2;j<i;j++){  j=2 i = 4
	
		if(i%j==0){   4%2 =0   4%3 =1  
			count++;   // count = 1
		}
	}
if (count==0) {
	System.out.println( "print the value of i: "+i); //2 3 
}
}
*/