package new2024par;

public class ReverseNumberpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		int a = 112233;
	/*	int rev=0;
		
		while(a!=0) {
			
			rev=rev*10+a%10;
			
			a=a/10;
			
			
		}*/

		
	/*	StringBuffer sb = new StringBuffer(String.valueOf(a));
		StringBuffer	rev=sb.reverse();  */
		
		StringBuilder sb = new StringBuilder();
		
		StringBuilder	rev=	sb.append(a);
		
		System.out.println(rev);
	}

}
