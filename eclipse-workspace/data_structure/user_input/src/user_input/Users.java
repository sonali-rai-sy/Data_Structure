package user_input;
import java.util.Scanner;

public class Users {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number");
        int num=sc.nextInt();
        System.out.print("Entered number is" + num);
	}


}
