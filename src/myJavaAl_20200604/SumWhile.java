package myJavaAl_20200604;

public class SumWhile {

	// 1. n이 7이면 '1+2+3+4+5+6+7 = 28'로 출력하는 프로그램을 작성하세요.

	public void sumof(int num) {
		int sum = 0;
		for (int i = 1; i < num + 1; i++) {

			sum += i;

		}
		System.out.printf("'1+2+3+4+5+6+%d' = %d%n", num, sum);

	}

	// 정수 a, b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 메소드!!
	public void sumof(int a, int b) {
		int sum = 0;
		if(a<=b) {
		for (int i = 0; i < b - a + 1; i++) {
			sum += a + i;

		}
		System.out.printf("%d 이상 %d 이하의 정수의 총합은: %d%n",a,b,sum);

	} else {
		for(int i = 0; i <a-b+1; i++) {
			sum += b+i;
		}
		System.out.printf("%d 이상 %d 이하의 정수의 총합은: %d%n",b,a,sum);
	}

}
}

