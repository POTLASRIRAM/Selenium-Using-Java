package day3;

public class Operators2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Increment and Decrement operators
		
		int a=10;
		System.out.println(a); //prints a value
		System.out.println(a++); //post increment -- output will be 10 since increments after printing a
		System.out.println(a++); //Output will be 11 since before this one inc happened and then a increments after printing
		System.out.println(++a); //pre increment -- output will be 13 since before printing a value will be incremented
		System.out.println(++a); //Output will be 14 since incrementing before printing
		
		System.out.println("\n"+a); //prints a value
		System.out.println(a--); //post decrement -- output will be 14 since decrements after printing a
		System.out.println(a--); //Output will be 13 since before this one dec happened and then a decrements after printing
		System.out.println(--a); //pre decrement -- output will be 12 since before printing a value will be decremented
		System.out.println(--a); //Output will be 11 since decrementing before printing
		
		// Assignment operator
		
		int b=10;
		System.out.println("\n"+b);
		System.out.println(b=1);// Assigning value 1 to b
		System.out.println(b+=1);// Adding b=b+1
		System.out.println(b-=1);// Decrementing b by 1
		System.out.println(b*=5);// Multiplying b value with 5
		System.out.println(b/=5);// Dividing b value by 5
		System.out.println(b%=1);// Modulo of b by 1
		
		// Conditional/Ternary operators
		
		int c=200;
		int d=200;
		int e=(c>d)? d:c;
		System.out.println(e);
		int f=(c<d)? d:c;
		System.out.println(f);
		int g=(c==d)? d:c;
		System.out.println(g);
		
		int age=18;
		String res = (age>=18)? "Eligible":"Ineligible";
		System.out.println(res);

	}

}
