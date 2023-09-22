package otherPackage;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "this is program";
		
		System.out.println(str.length());
		
		if(str.equals("this is program")) {
			System.out.println("correct");
		}
		
		System.out.println(str.equalsIgnoreCase("THIS is Program"));
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.startsWith("this"));
		System.out.println(str.endsWith("ram"));
		System.out.println(str.indexOf("s"));  // if having multiple it will show only first charecte
		System.out.println(str.lastIndexOf("s"));
		System.out.println(str.charAt(11));
		System.out.println(str.replace("this", "that"));
		System.out.println(str.contains("pro"));
		System.out.println(str.substring(5));
		System.out.println(str.substring(2, 11));
		System.out.println(str.isEmpty());
		String str1[] = str.split(" ");
		for (int i = 0 ; i<str1.length;i++) {
			System.out.println(str1[i]);
		}
		String str2 = "        hello world   ";
		System.out.println(str2);
		System.out.println(str2.trim());
		System.out.println(str.concat(str2));
	}

}
