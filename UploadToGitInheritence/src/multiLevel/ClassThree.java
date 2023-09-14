package multiLevel;

public class ClassThree extends ClassTwo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassThree cth = new ClassThree();
		cth.bus();
		cth.flight();
		
		cth.cycle();
		cth.scooty();
		
		cth.bike();
		cth.car();

	}
	
	public void bus() {
		System.out.println("bus code executed");
	}
	public void flight() {
		System.out.println("flight code executed");
	}

}
