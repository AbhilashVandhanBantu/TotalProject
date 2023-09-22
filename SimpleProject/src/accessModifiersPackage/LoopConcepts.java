package accessModifiersPackage;

public class LoopConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		operators();
		int scienceMarks = 0;
		if(scienceMarks < 35) {
			System.out.println("Student passed in Science");
		}
		else {
			System.out.println("False statement");
		}
		
		int num = 100;
		
		switch (num) {
			case 100:
				System.out.println("num is "+num);
				break;
			case 200:
				System.out.println("num is "+num);
				break;
			default:
				System.out.println("default block will executed");
		}
		
		//String name[] = {"Abhi","Nagi","Siva"};
		//System.out.println(name[0]);
		//System.out.println(name[1]);
		//System.out.println(name[2]);
		//System.out.println(name[3]);

	}
	
	public static void operators() {
		int a = 30;
		a++;
		System.out.println(a); //a=a+1
		System.out.println(++a); //a=1+a
		
		int b = 40;
		System.out.println(b--); //a=a+1
		System.out.println(--b); //a=1+a
		
	}
	
	
	

}
