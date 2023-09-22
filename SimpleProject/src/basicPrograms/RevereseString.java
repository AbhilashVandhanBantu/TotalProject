package basicPrograms;

public class RevereseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello world now"; //olleH dlrow won
		System.out.println(str);
		
		char ch[] = str.toCharArray();    // to convert string to charecter array
		String rev = "";   
		for(int i = ch.length-1 ; i>=0 ; i--) {   // calling index from last to first by using decrement
			rev = rev + ch[i];  // string lo one by one store cheskoni add cheskuntnam
		}
		String str1[] = rev.split(" ");   //to split the string and convert to string Array
		String revTotal = "";
		for(int i =str1.length-1 ; i>=0 ; i--) {
			revTotal = revTotal + str1[i] + " ";
		}
		System.out.println(revTotal);
	}
}
