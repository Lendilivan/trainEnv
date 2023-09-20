package basicjav;

public class Dummy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int str1 = 15;
		int str2 = 15;
		Integer str3 = new Integer(15);
		Integer str4 = new Integer(15);

		System.out.println(str1 == str2);       // true (reference equality)
		System.out.println(str1 == str3);       // false (different objects)
		System.out.println(str3.equals(str4));  // true (content equality)
		System.out.println(str3==str4);  // true (content equality)*/

		
		//0,1,1,2,3,5,8,13,21,34,55,89,144,233,377,
		
		int a=0;
		int b=1;
		int c;
		
		System.out.print(""+a+","+b+",");
		
		for(int i=2; i<10;i++) {
			
			c=a+b;
			System.out.print(c+",");
			
			a=b;
			b=c;
		}
		
		
		
	}

}

