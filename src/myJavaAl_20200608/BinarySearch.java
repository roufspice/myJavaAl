package myJavaAl_20200608;
// binarysearch는 배열이 정렬되어있어야 하는 전제조건이 필요하다!
// 알고리즘의 성능을 객관적으로 평가하는 기준: 복잡도(complexity)
// 시간복잡도(time complexity):실행에 필요한 시간을 평가
// 공간복잡도(space complexity): 기억영역과 파일 공간이 얼마나 필요한가를 평가한 것!
public class BinarySearch {
	//메소드를 만든다.
	public boolean binSearch(int[] a, int len, int key) {
		int start = 0;
		int end = len-1;
		int mid;
		
		while(start<= end) {
			mid = (start+end)/2;
			if(a[mid] == key) {
				return true;
			} else if(a[mid] > key) {
				end = mid -1;
			} else {
				start = mid+1;
			}
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		int[] intArray = new int[] {};
		for(int i =0; i<intArray.length; i++) {
			intArray[i] = i+1;
			
		}
		
		BinarySearch bs = new BinarySearch();
		boolean result = bs.binSearch(intArray, 500, 1001);
		System.out.println(result);
		
	}
	


}


