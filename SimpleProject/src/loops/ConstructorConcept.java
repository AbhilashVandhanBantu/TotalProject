package loops;

public class ConstructorConcept {
	
	ConstructorConcept(){
		
		System.out.println("constructor without arguments");
		
	}
	
	ConstructorConcept(int a , int b){
		System.out.println("Constructor with arguments "+a + b + " "+ (a+b));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorConcept c = new ConstructorConcept();
		
		ConstructorConcept c1 = new ConstructorConcept(10,20);
	}

}
