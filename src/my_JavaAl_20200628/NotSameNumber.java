package my_JavaAl_20200628;

import java.util.ArrayList;

public class NotSameNumber {

	/*
	 * 배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다. 이때, 배열 arr에서 연속적으로 나타나는
	 * 숫자는 하나만 남기고 전부 제거하려고 합니다. 단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다.
	 * 예를 들면,
	 * 
	 * arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다. arr = [4, 4, 4, 3,
	 * 3] 이면 [4, 3] 을 return 합니다. 배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는
	 * solution 함수를 완성해 주세요.
	 * 
	 * 제한사항 배열 arr의 크기 : 1,000,000 이하의 자연수 배열 arr의 원소의 크기 : 0보다 크거나 같고 9보다 작거나 같은 정수
	 * 
	 */
	
	
	
	
	
	//ArrayList를 만들고, 중복되면 빼고 중복값이 아니면 넣는다.
	//다시 List의 값들을 하나씩 배열에 추가한다.
	public int[] solution(int []arr) {
		//중복된 값제외한 것이 몇개인지 봐야함!
		ArrayList<Integer> list = new ArrayList<>();
		
		
		for(int i =0; i<arr.length; i++) {
			boolean isExisted = false;
			
			for(int j =0; j<list.size(); j++) {
				if(arr[i] == list.get(j)) {
					isExisted = true;
					break;
				}
								
			}
			if(isExisted == false) {
				list.add(arr[i]);
				
			}
				
		}
		int [] answer = new int [list.size()];
		for(int i =0; i<list.size(); i++) {
			answer[i] = list.get(i);
		}
		
		return answer;
	}
	
	public int[] solution2(int []arr) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i =0; i<arr.length-1; i++) {
			boolean isExisted = false;
			
			if(arr[i] != arr[i+1]) {
				list.add(arr[i]);	
			}
		}
		//마지막값은 그냥 넣는다.
		list.add(arr[(arr.length)-1]);
		
		int []answer = new int[list.size()];
		for(int i =0; i<list.size(); i++) {
			answer[i] = list.get(i);
		}
		
		return answer;
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		NotSameNumber ns = new NotSameNumber();
	
		System.out.println();
		int[] result3 = ns.solution2(new int[]{1,1,3,3,0,1,1});
		
		for(int val: result3) {
			System.out.print(val +" ");
		}
		
		
		
		
		
		
	}
	
	
	
	
}
