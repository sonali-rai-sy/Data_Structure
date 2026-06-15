package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
public class Arrrr {
public static void main(String args[]) {
	
	ArrayList<Integer> arra=new ArrayList<>();
	System.out.print("Enter 3  number be");
	for (int i=0;i<4;i++) {
	Scanner sc=new Scanner(System.in);
	
	int number=sc.nextInt();
	arra.add(number);
	
	
	}
	System.out.println(arra);
}
	
}
