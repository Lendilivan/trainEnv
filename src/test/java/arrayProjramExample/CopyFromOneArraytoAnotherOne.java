package arrayProjramExample;

public class CopyFromOneArraytoAnotherOne {

	public static void main(String[] args) {
		
		
		int a[]= new int[] {1,2,1,2};
		
		int b[]= new int [] {a.length};
		
		
		for (int i=0; i<=a.length;i++) {
			
			b[i] = a[i];	
		
			
		}
		
		System.out.println();
		
		
		
		
		
		
		
		for (int i=0; i<=a.length;i++) {
			 
			
	
				
			}
		
		
		System.out.println("+++++++++"+b.length);
		
		for(int j=0; j<=b.length;j++) {
			
			System.out.println(b[j]);
			
		}
		
		
		System.out.println();
	  
	}

}
