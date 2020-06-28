package my_JavaAl_20200628;

import java.util.ArrayList;

public class CountDigit {

	// 내가 직접해본 코드!
	public int solution(int n) {
		int answer = 0;
		int countDigit = (int) Math.log10(n) + 1;
		// countDigit = n이 몇자리인지 알려준다.
		int[] arr = new int[countDigit];

		for (int i = 0; i < countDigit; i++) {
			int idx = n % 10;
			arr[i] = idx;
			n /= 10; //여기서 /= += *= 활용할것!

		}
		for (int i = 0; i < arr.length; i++) {
			answer += arr[i];

		}

		return answer;
	}

	// 자릿수구하는 솔루션!!!
	public int solutionA(int n) {
		int answer = 0;

		while (n != 0) {
			answer += n % 10;
			n /= 10;

		}
		return answer;

	}

	public static void main(String[] args) {
		CountDigit c1 = new CountDigit();

		System.out.println(c1.solution(123456789));

	}

}
