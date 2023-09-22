package accessModifiersPackage;

public class VariableCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Helloworld.nameMethod();
		// 2 points local variable create and assign to it or print it directly
		String str = Helloworld.name;
		System.out.println(str);
		//System.out.println(Helloworld.name);
		NewWorld obj =  new NewWorld();
		System.out.println(obj.name1);
		obj.newMethod();
	}
}

class Helloworld { // static and non static
	
	static String name = "Abhi"; //static variable global
	
	public static void nameMethod() {// static method
		String local = "Hi" ; // local variable
		System.out.println(local);
		System.out.println("this is static method");
	}
}

class NewWorld {
	
	String name1 = "Siva"; // Non static variable // reference variable
	public void newMethod() {
		System.out.println("this is not static method");
	}
}

