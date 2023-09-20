package trainEnv;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String orginal= "ivan";
		char[] a= orginal.toCharArray();
		String reverse="";
		
		
	for(int i=a.length-1;i>=0;i--) {
		
		reverse=reverse+a[i];
	}
		
		System.out.println(reverse);
		
		if(orginal.equalsIgnoreCase(reverse)) {
			
			System.out.println("pal");
		}else {
			
			System.out.println("No pal");
			
		}
		
	
	}

		
		
}
