package accessModifiersPackage;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		
		//Airthematic Operators
		/*System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);*/
		
		//Assignment operators
		/*a+=b; //a=a+b
		System.out.println(a);
		a-=b; //a=a-b
		System.out.println(a);
		a*=b; //a=a*b
		System.out.println(a);
		a/=b; //a=a/b
		System.out.println(a);
		a%=b; //a=a%b
		System.out.println(a);*/
		
		//increment and decrement
		/*a++;
		System.out.println(a);
		b--;
		System.out.println(b);*/
		
		//Logical operators
		/*System.out.println(true && true);  //true output
		System.out.println(true && false); //false output
		System.out.println(false && true); //false output
		System.out.println(false && false); //false output
		System.out.println(true || true);  //true output
		System.out.println(true || false); //true output
		System.out.println(false || true); //true output
		System.out.println(false || false); //false output
		
		System.out.println(!true); //false output
		System.out.println(!false); //true output*/
		
		//Relational operators
		/*System.out.println("a==b is"+(a==b)); //returns boolean value
		System.out.println("a!=b is"+(a!=b));
		System.out.println("a>b is"+(a>b));
		System.out.println("a<b is"+(a<b));
		System.out.println("a>=b is"+(a>=b));
		System.out.println("a<=b is"+(a<=b));*/
		
		//Ternary operator
		
		int c = (a<b)?a:b;		//if condition is false b will assign to c
		System.out.println(c);
		
		int d = (a>b)?a:b;		//if condition is true a will assign to c
		System.out.println(d);
		

	}

}
