package myJavaAl_20200605;

public class Array {
	public static void main(String[] args) {
		// 배열 요소 최대값 구하기
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = a.clone();

		int max = a[0];
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] < a[i + 1]) {
				max = a[i + 1];
			}
		}
		System.out.println("최대값: " + max);

		// 배열 요소 최소값 구하기
		int min = b[0];
		for (int i = 0; i < b.length - 1; i++) {
			if (b[i] > b[i + 1]) {
				min = b[i + 1];

			}

		}
		System.out.println("최소값: " + min);
	}

}
