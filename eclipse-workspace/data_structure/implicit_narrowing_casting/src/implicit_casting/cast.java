package implicit_casting;

public class cast {
	
	public static void main(String args[]) {
		
		int a=10;
		double b=12.5;
		double result= a + b;
		System.out.println("Result of implicit value is " + result);
		
		 int num = 5004;
		 double doubleNum = (double) num;
		 System.out.println("The value of " + num + " after converting to the double is " + doubleNum);
		 
		 
		 int result1= 16;
		 double d=12.6;
		 double result3= result1 + d;
		 System.out.println("Before implicit conversion" + result3);
		 int result4= (int)result3;
		 System.out.println("After implicit conversion value is " + result4);
      		
	}

}
