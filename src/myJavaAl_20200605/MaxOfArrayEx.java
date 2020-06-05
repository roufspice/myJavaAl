package myJavaAl_20200605;

import java.util.Random;
import java.util.Scanner;

// 키와 사람수도 난수로 생성하도록 하고 입력한 사람들의 키의 최대값과 최소값을 구하는  프로그램을 짜보시오!!!
public class MaxOfArrayEx {
	
	public static void main(String[] args) {
		
		Random rd = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("키가 가장 큰 사람과 작은 사람을 찾는 프로그램입니다.");
		System.out.println("사람 수: ");
		int num = (int)(Math.random()*1000);
		
		int[] intArray = new int[num];
		
		for(int i = 0; i<num; i++) {
			System.out.printf("%d번 사람의 '키'를 입력: %n",i+1);
			intArray[i] = rd.nextInt(100)+ 100;
			System.out.println(intArray[i]);
			
		}
		System.out.println("============================");
		System.out.printf("최대값: %d%n",maxOf(intArray));
		System.out.printf("최소값: %d%n",minOf(intArray));
		System.out.printf("검사횟수: %d",num);
		
		
		
		
		
	}
	
	
	
	//배열을 생성해서 배열의 최대값을 구하는 메소드
	
	public static int maxOf(int[] a) {
		//배열의 인덱스 값중 최대값을 리턴하는 메소드
		int max = a[0];
		for(int i =0; i < a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		return max;
		
	}
	
	public static int minOf(int[] a) {
		//배열의 인덱스 값중 최소값을 리턴하는 메소드
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]< min) {
				min = a[i];
			}
			
		}
		return min;
	}
	
	
	

}
