package new2024par;

public class ReveString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String input = "ivanlendil";
		
		String rev="";
		
		//char[] b =input.toCharArray();
		

		for(int i=input.length()-1; i>=0; i--) {
			
			rev= rev+input.charAt(i);
		}
		
System.out.println(rev);
	}

}
