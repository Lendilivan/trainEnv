package trainEnv;

public class SwapTwoNumberExample {

	public static void main(String[] args) {
		
		
		
		int firstNumber =4545444;  //5
		int secondNumber =55555544; //10
		
		System.out.println("Befor Swap first and Second number is  "+ firstNumber+" and " +secondNumber );
		firstNumber =firstNumber+secondNumber; // 15
		secondNumber=firstNumber-secondNumber; //5
		firstNumber=firstNumber-secondNumber; //10
		
		System.out.println("Befor Swap first and Second number is  "+ firstNumber+ " and " +secondNumber );
	}

}
