package myJavaAl_20200604;

public class Max {

	public void max3(int a, int b, int c) {
		int max = a;
		if(b>max) max = b;
		if(c>max) max = c;
		
		System.out.println("최대값은: " + max);
	}
	
	//1. 네 값의 최댓값을 구하는 max4 를 작성하세요.
	public int max4(int a, int b, int c, int d) {
		int max = 0;
		if(max < a) max = a;
		if(max < b) max = b;
		if(max < c) max = c;
		if(max < d) max = d;
		
		
		return max;
		
	}
	
	//2. 세값의 최솟값을 구하는 min3 메소드를 작성하세요.
	
	public int min3(int a, int b, int c) {
		int min = a;
		if(min > b) min = b;
		if(min > c) min = c;
		
		return min;
	}
	
	//3. 네값의 최솟값을 구하는 min4 메소드를 작성하세요!
	public int min4(int a, int b, int c, int d) {
		int min = a;
		if(b < min) min = b;
		if(c < min) min = c;
		if(d < min) min = d;
		
		return min;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Max m = new Max();
		System.out.println(m.max4(10, 20, 30, 40));
		
		System.out.println(m.min3(1,2,3));
		System.out.println(m.min3(10000, 5500000, 548480480));
		
		System.out.println(m.min4(1000,2000,3000,4000));
	}
	
}
