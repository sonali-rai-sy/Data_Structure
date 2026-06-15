package string_practice;

public class String_practice {
	
	public static void main (String args[]) {
		
	String	name="JavaDOO";
	int uppercount=0;
	int lowercount=0;
			
	for (int i=0;i<name.length();i++) {
		char charr=name.charAt(i);
		if(Character.isLowerCase(charr)) {
			lowercount=lowercount+1;
		}
			else{
				uppercount=uppercount+1;
				
			}
			
		
		
	}
	
	System.out.println("Total lower count is : " + lowercount);
	System.out.println("Total upper count is : " + uppercount);
		
	}
		
	}

