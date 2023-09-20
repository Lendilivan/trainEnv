package basicjav;

import java.util.ArrayList;
import java.util.Scanner;

public class PalindromeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String n,x = "";
	
		Scanner scanner = new Scanner(System.in);
		 System.out.println("****************");
		n=scanner.nextLine();
		
		
          for(int i =n.length()-1; i>=0;i--) {
        	  
        	  x = x+n.charAt(i);
          }
          
          System.out.println("Given " + n);
          System.out.println("afetr " + x);
          
          
         if(n.equals(x)) {
        	 
        	 System.out.println("yes");
        	 
         }else{
        	 
        	 System.out.println("No");
         }
        
	}

}
