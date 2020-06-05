package myJavaAl_20200605;

public class ArrayEqual {

	// 배열b의 모든 요소를 배열 a에 복사하는 메소드 copy를 작성하세요.
	public static int[] copy(int[] a, int[] b) {
		
		for(int i = 0; i < a.length; i++) {
			b[i] = a[i];
			//이건 코딩이 아닐 수도 있지...
			
		}
		// 반환값은 복사된 a배열!
		return a;
	}

	// 배열 b의 모든 요소를 배열 a의 역순으로 복사하는 메소드 rcopy를 작성하세요
	public static int[] rcopy(int[] a, int[] b) {
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
			
		}
		for(int i = 0; i < (b.length)/2; i++) {
			
		}

		// 배열 b는 a열의 모든 요소의 역순이다!
		return b;
	}

	public static void main(String[] args) {

		int[] a = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int[] b = { 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000 };
		
		/*
		copy(a, b);

		for (int value : a) {
			System.out.print(value + "\t");
		}
		System.out.println();
		for (int value : b) {
			System.out.print(value + "\t");

		}
		System.out.println();
		*/
		
		
		rcopy(a, b);
		

		for (int value : a) {
			System.out.print(value + "\t");
		}
		System.out.println();
		for (int value : b) {
			System.out.print(value + "\t");

		}
		System.out.println();

		
		
		
		

	}

}
