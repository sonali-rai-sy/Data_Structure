package Queue_practice;
import java.util.*;
public class Queue_C {
public static void main(String args[]) {
	
	Queue<Integer> queuecreation=new LinkedList<>();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 5 queue element");
	for(int i=0;i<5;i++) {
		int num=sc.nextInt();
		
		queuecreation.add(num);
		
	}
	
	queuecreation.remove();
	System.out.println(queuecreation);
	
}
	
	
}
