package builtinfu;
import java.util.Scanner;
import java.util.ArrayList;

public class buidlt {
	
	
	public static void main(String args[]) {
		
		
		
		System.out.println(Math.sqrt(25));
		System.out.println(Math.pow(2,3));
		System.out.println(Math.max(100, 20));
		System.out.println(Math.min(20, 50));
		System.out.println(Math.random());
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a name");
		String name=sc.nextLine();
		System.out.println("Name is" + name);
		
		 ArrayList<String> list = new ArrayList<>();
		 list.add("python");
		 list.add("java");
		 System.out.println(list);
		 list.remove("python");
		 System.out.println(list);}

}
