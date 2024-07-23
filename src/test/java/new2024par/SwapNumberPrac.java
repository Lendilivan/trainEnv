package new2024par;

public class SwapNumberPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a =123;
		int b = 321;
		
		System.out.println("Befor Swap a is = " +a+" and b is = "+b);
		
/*		// Type 1
		
		int t=b;
		
		b=a;
		
		a=t;*/
		
		//using logic 
		
/*	b=a+b;  //30
	
	a=b-a; //20
	b=b-a;  //10*/
		
		
		// use single line 
		
		
		b=a+b-(a=b);
		
	//	b=a+b-(a=b);          
		
		
		
		
		System.out.println("After Swap a is = " +a+" and b is = "+b);

	}

}
