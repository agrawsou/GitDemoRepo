package defaultPackage;

public class Factorial {

	static long fact;

	public static void main(String[] args) {

		// Using while loop

//		while(num!=0) {
//			fact = fact * num;
//			num--;
//		}
//		
//		System.out.println("Factorial of the given number is "+fact);

		// Using for loop

//		for(int i=num;i>0;i--) {
//			fact = fact * i;
//		}
//		
//		System.out.println("Factorial of the given number is "+fact);
		
		int factorialValue = recursiveFact(6);
		
		System.out.println("Factorial of the given number is "+factorialValue);

	}

	static int recursiveFact(int num) {
		if(num==0)
			return 1;
		else
		return(num*recursiveFact(num-1));
	}

}
