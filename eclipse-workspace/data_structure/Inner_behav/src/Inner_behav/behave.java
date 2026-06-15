package Inner_behav;

class outer{
	int x=10;
	
	class inner{
		
		void show() {
			
			System.out.println("The value of x is" +x);
		}
	}
	
}

public class behave {
	public static void main(String args[]) {
		outer o=new outer();
		outer.inner i=o.new inner();
		i.show();
		
	}

}
