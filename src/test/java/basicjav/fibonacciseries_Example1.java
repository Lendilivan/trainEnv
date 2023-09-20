package basicjav;

import java.util.Scanner;

public class fibonacciseries_Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in);
		System.out.println("--------------------");
		int input =15;//scanner.nextInt();
		//int input=10;
		int x = 0;
		int y = 1;
		int z;
		
		System.out.print(x+","+y+","); //0
	
	//	0, 1, 1, 2, 3, 5, 8, 13, 21, 34
		
		for(int i=2;i<input;i++) {
			
			 z = x+y;
			System.out.print(z+","); 
			
			x=y;
			y=z;
			
	
	}

}
}