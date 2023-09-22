package accessModifiersPackage;

public class DrivingLiscense {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 18;
		
		if(age >= 18) {
			System.out.println("Eligible for Driving Liscense");
		}else {
			System.out.println("Not eligible for Driving Liscense");
		}
		
		int maths = 60;
		int science = 50;
		int english = 40;
		int french = 30;
		
		if(maths >= 60 && science >= 50 && (english >= 40 || french >=30)) {
			System.out.println("Student is eligible for Higher class");
		}else {
			System.out.println("Student is not elegible for higer class");
		}

	}

}
