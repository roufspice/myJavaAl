package my_JavaAl_20200628;

import java.util.ArrayList;

public class FindMiniumNumber {
	/*
	 * 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 
	 * 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 
	 * 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
	 * 
	 * 
	 * 
	 * */

	
	public int[] solution(int[] arr) {
		
		if(arr.length == 1) {
			int[] temp = {-1};
			return temp;
		} else {
			ArrayList<Integer> list = new ArrayList<>();
			for(int i =0; i<arr.length; i++) {
				list.add(arr[i]);
				
			}
			int min = list.get(0);
			for(int i= 1; i<list.size(); i++) {
				if(list.get(i) < min) {
					min = list.get(i);
				}
				
			}
			list.remove(list.indexOf(min));
			int[] temp = new int[arr.length-1];
			for(int i=0; i<temp.length; i++) {
				temp[i] = list.get(i);
			}
			return temp;
		}
		
	}
	
	public static void main(String[] args) {
		FindMiniumNumber fmn = new FindMiniumNumber();
		fmn.solution();
		
		
	}

}
