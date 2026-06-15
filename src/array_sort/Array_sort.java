package array_sort;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class Array_sort {
	public static void main(String args[]) {
		int sum=0;
		int avg=0;
		ArrayList<Integer> avg_arr=new ArrayList<>();
		System.out.println("Enter 5 number");
		Scanner sc=new Scanner(System.in);
		for (int i=0;i<5;i++) {
			
			int num=sc.nextInt();
			avg_arr.add(num);
		}
			for (int i=avg_arr.size()-1;i>=0;i--) {
				System.out.println("Array is : " + avg_arr.get(i));
				System.out.println("Now the array is" + avg_arr);
				
				
			
			
			}
		
		
		
		
		
		
		
	}
}
