

package object_classes;
class calculator{
	
	int a;
	public int add(int num1,int num2){
		int r=num1+num2;
		return r;
		
	}
	
}


public class Object_classes {
	public static void main(String args[]) {
		int a=10;
		int b=20;
		calculator ch=new calculator();
		int result=ch.add(a,b);
		System.out.println(result);
		
	}

}
