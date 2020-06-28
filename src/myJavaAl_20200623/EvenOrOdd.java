package myJavaAl_20200623;

public class EvenOrOdd {
	
	public String evenOrOdd(int num) {
		return num%2 == 0 ? "Even":"Odd";
	}
	
	public static void main(String[] args) {
		
		EvenOrOdd eo = new EvenOrOdd();
		
		String result = eo.evenOrOdd(0);
		System.out.println(result);
	}

}
