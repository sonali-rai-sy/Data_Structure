package stack_p;
import java.util.Stack;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Stack_p {
public static void main(String arg[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a  5 array element");
	ArrayList<Integer> num=new ArrayList<>();
for (int i=0;i<5;i++) {
	
	 num.add(sc.nextInt());
}
Collections.sort(num);
System.out.println("Sorted array is :" + num);

for (int j=0;j<num.size()-1;j++) {
	
		
		System.out.println("Next Greater elemet for " + num.get(j)  + "-> is" + num.get(j+1) );
	
	
	
	
}
	
	
	
	
	
	
	
	
	
}
		
		
		
	}


