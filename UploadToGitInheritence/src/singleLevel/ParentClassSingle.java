package singleLevel;

public class ParentClassSingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentClassSingle pcs = new ParentClassSingle();
		pcs.car();
		pcs.bike();

	}
	 public void car() {
		 System.out.println("car code executed in parent");
	 }
	 public void bike() {
		 System.out.println("bike code executed in parent");
	 }

}
