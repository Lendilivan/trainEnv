package oopsjPar;

public class calssB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EncapPar obj  = new EncapPar();
		String val2= obj.Getname();
		System.out.println(val2);
		obj.Setname("ivan");
		String val= obj.Getname();
		System.out.println(val);

	}

}
