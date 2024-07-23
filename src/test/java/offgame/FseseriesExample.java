package offgame;

public class FseseriesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//// 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,
		
		int a=1;
		int b=1;
		System.out.print(a +","+ b+",");    
		int c=0;
		for(int i=0; i<3;i++) {
			
		c=a+b;	
			
		System.out.print(c +","); 
		
		a=b;
		b=c;
			
		}

	}

}
