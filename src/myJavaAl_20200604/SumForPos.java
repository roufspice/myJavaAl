package myJavaAl_20200604;

import java.util.Scanner;

public class SumForPos {

	
	//자릿수 출력해주는 프로그램, 정수형을 문자열로 바꿔주는 Integer.toString();
	public void countDigit(long num) {
		if(num > 0) {
		
			long countDigit = Long.toString(num).length();
			
			System.out.printf("입력하신 %d의 자릿수는  %d 입니다.%n",num,countDigit);
		} else {
			System.err.println("양의 정수를 입력해주세요!!");
		}
		
	}
	public static void main(String[] args) {
		SumForPos sfs = new SumForPos();
		sfs.countDigit(65468531684435153L);
		
		
	}
	
	

}
