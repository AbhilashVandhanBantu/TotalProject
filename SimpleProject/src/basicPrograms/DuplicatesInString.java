package basicPrograms;

public class DuplicatesInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "shimakh technology";
		
		char ch[] = str.toCharArray();
		
		for (int i=0 ; i<ch.length ; i++) {
			for (int j=i+1 ; j<ch.length ; j++) {
				if(ch[i]==ch[j]) {
					System.out.println(ch[i]);
					ch[j]='\0';
					break;
				}
			}
		}

	}
}
