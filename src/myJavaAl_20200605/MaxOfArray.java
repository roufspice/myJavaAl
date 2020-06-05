package myJavaAl_20200605;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArray {
	
	
	public static int maxOfArrayRand(int[] a) {
		int max = a[0];
		for(int i = 0; i <a.length; i++) {
			if(a[i] > max) {
				max = a[i];
				
			}
		}
		return max;
		
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("키의 최대값을 구합니다.");
		System.out.print("사람 수 : ");
		
		int num = stdIn.nextInt();
		
		int [] height = new int[num];
		
		for(int i =0; i < height.length; i++) {
			System.out.printf("%d 번 사람의 키 입력 %n",i+1);
			height[i] = rand.nextInt(100) + 100 ;		//키의 범위는 생성한 난수를 100 으로 나눈 나머지(0~99)에 100을 더하므로 100~199cm 까지입니다.
			System.out.println(height[i] + "cm");
			
		}
		
		System.out.println("최대값은 " + maxOfArrayRand(height) + "입니다."
				);
		
		
		
	}

}

