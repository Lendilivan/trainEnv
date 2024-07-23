package trainEnv;



public class SwapTwoNumberExample {

	public static void main(String[] args) {
		
		
		/*CompProg01 myobj = new CompProg01();
		
		//myobj.setName("Ivan");
		
		
		
		//System.out.println(myobj.getName());*/
		
		
		int firstNumber =1;  //5
		int secondNumber =-5; //10
		
		System.out.println("Befor Swap first and Second number is  "+ firstNumber+" and " +secondNumber );
		firstNumber =firstNumber+secondNumber; // 15
		secondNumber=firstNumber-secondNumber; //5
		firstNumber=firstNumber-secondNumber; //10
		
		System.out.println("After Swap first and Second number is  "+ firstNumber+ " and " +secondNumber );
	}

}
