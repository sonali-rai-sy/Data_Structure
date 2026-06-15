package Practice_dsa;

public class DSA {

 public static void main(String aargs[]) {
	 int [] myarr= {10, 5, 20, 8, 15};
	 int max=myarr[0];
	 int diff=0;
	 int min=myarr[0];
	 for (int i=0;i<myarr.length;i++) {
		 if(myarr[i]>max) {
			 
			 max=myarr[i];
		 }
		 for (int j=0;j<myarr.length;j++) {
		 if(myarr[j]<min) {
			 min=myarr[j];
		 }
		 }
		 
	 }
	 System.out.println("Maximum number is = " +max);
	 System.out.println("Minimum number is = " +min);
	 diff=max-min;
	 System.out.println("Difference of maximum and minimum number in array is = " + diff);
	 
 }
}