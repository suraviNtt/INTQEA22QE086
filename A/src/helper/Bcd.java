package helper;

public class Bcd extends Abc{

	public void test() {
		System.out.println("Test B");

	}
	
	public static void main(String[] args) {
		
		Abc abc = new Abc();
		abc.test();
		
		Bcd bcd = new Bcd();
		bcd.test();
		
		Abc a = new Bcd();
		a.test();
		
		a.test2();
	}
}
