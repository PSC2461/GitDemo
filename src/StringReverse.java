
public class StringReverse {

	public static void main(String[] args) {
		
		String s="chaudhari";
		String d="";
		
		// we use two string methods here..s.lengh()--give length of string and s.charAt() --give character at index
		//we use empty string variable to store value and simply concatenate in loop
		
		for(int i=s.length()-1; i>=0; i-- ) {
			
			
			d=d + s.charAt(i);
		}
		
		System.out.println("reversed string is: " +d);
	

	}

}
