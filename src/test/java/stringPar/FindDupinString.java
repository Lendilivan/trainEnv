package stringPar;

public class FindDupinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String a = "IvanLendilll";
		char[] strar =a.toCharArray();
		int count;
		
		
		for(int i=0; i<strar.length;i++) {
			
			count=1;
			
			for(int j=1+i; j<strar.length;j++) {
				
				if(strar[i]==strar[j] && strar [i] != ' ') {
					count++;
					
					
					strar[j]='0';
					
					
				}
				
				
				
			}
			if(count>1 && strar [i] != '0' ) {
				
				//System.out.println(strar[i]);
				 System.out.println(strar[i] + ": " + (count + 1)); 
			}
			
			
		}
		
		
	
		
		
		
		
		
		/*char[] name = "ivanlendil".toCharArray();
	     for(int i=0 ; i < name.length ; i++){
	         //  System.out.println(name[i]);
	          for(int j=i+1 ; j < name.length ; j++){
	              if(name[i]== name [j])
	                    System.out.print("----"+name[i] +name[j]);
	              
	              
	              
	     }*/
	          
	     }
		
		
		
		
		
		
		
		
		
		
		
	}
		
		
		

	


