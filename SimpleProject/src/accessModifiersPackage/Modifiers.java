package accessModifiersPackage;

public class Modifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Modifiers mref = new Modifiers(); // memory
		mref.publicMethod();
		mref.privateMethod();
		mref.protectedMethod();
		mref.defaultPackage();

	}
	// public private protected default
	
	public static void publicMethod() {  // we can use for complete project
		System.out.println("Public Method");
	}
	
	private void privateMethod() { // we can use only for class
		System.out.println("Private Method");
	}
	protected void protectedMethod() { //only package - if you inherit any class you can use protected method in other package
		System.out.println("Protected Method");
	}
	void defaultPackage() {  // only for package
		System.out.println("Default package");
	}
	

}
