package Stack;
import java.util.Stack;
import java.util.Scanner;


public class stack {
	public static void main(String args[]) {
		Stack<Character> num=new Stack<>();
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		for (int i=0;i<name.length();i++) {
			
			num.push(name.charAt(i));
		}
		
		
		
		
	}

}
