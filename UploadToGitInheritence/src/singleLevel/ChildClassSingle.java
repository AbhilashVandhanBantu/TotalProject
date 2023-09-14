package singleLevel;

public class ChildClassSingle extends ParentClassSingle{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClassSingle ccs = new ChildClassSingle();
		ccs.cycle();
		ccs.scooty();
		ccs.car();
		ccs.bike();

	}
	
	public void cycle() {
		System.out.println("cycle code executed in child");
	}
	public void scooty() {
		System.out.println("scooty code executed in child");
	}

}
