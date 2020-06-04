package myJavaAl_20200604;

import java.util.Scanner;

public class MaxDemo {
	public static void main(String[] args) {
	
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("최대값 , 최소값을 찾아봅시다!");
		System.out.println("값을 입력해주세요>");
		int a = stdIn.nextInt();
		System.out.println("값을 입력해주세요>");
		int b = stdIn.nextInt();
		
		System.out.println("값을 입력해주세요>");
		int c = stdIn.nextInt();
		
		int max = a;
		if(b> max) max = b;
		if(c> max) max = c;
		
		System.out.println("최대값 출력: "+ max);
		
	}

}
