package day3;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Arithmetic operators
		
		int a,b;
		a=10;
		b=5;
		System.out.println("The Sum of a and b :"+(a+b));
		System.out.println("The Subtraction of a and b :"+(a-b));
		System.out.println("The Multiplication of a and b :"+(a*b));
		System.out.println("The division of a and b :"+(a/b));
		System.out.println("The Modulo division of a and b :"+(a%b));
		
		//Relational operators
		
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		String c="Sriram";
		String d="Potla";
		System.out.println(c==d);
		System.out.println(c!=d);
		
		//Logical operators
		
		boolean e=true;
		boolean f=false;
		boolean g=100>200; //false
		boolean h=200>150; //true
		System.out.println("The value of logical and is :"+(e&&f));
		System.out.println("The value of logical or is :"+(e||f));
		System.out.println("The value of logical not e is :"+(!e));
		System.out.println("The value of logical not f is :"+(!f));
		System.out.println("The value of logical and of g and h is :"+(g&&h));
		System.out.println("The value of logical or of g and h is :"+(g||h));
		System.out.println("The value of logical not of g is :"+(!g));
		System.out.println("The value of logical not of h is :"+(!h));
		

	}

}
