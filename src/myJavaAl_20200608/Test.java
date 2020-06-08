package myJavaAl_20200608;

public class Test {
	//갯수가 n인 배열 a에서 key와 일치하는 모든 요소의 인덱스를 배열 idx의 맨 앞부터 순서대로 저장하고
	//일치한 갯수를 반환하는 메소드를 작성하세요.
	//예를 들어 8인 배열 a의 요소가 {1,9,2,9,4,6,7,9}이고 key가 9이면 배열 idx에 {1,3,7}을 저장하고 3을반환합니다.

	
	public void searchIdx(int[]a, int n, int key, int[]idx) {
		int count = 0;
		for(int i =0; i<a.length; i++) {
			if(a[i] == key) {
				idx[count] = i;
				count++;
			}
		}
		System.out.println("일치한 개수: "+ count);
		for(int i = 0; i<count; i++) {
			System.out.print(idx[i] + " ");
			
		}
	}
	
	
	public static void main(String[] args) {
		Test t1 = new Test();
		int[] intArray = {4,9,7,4,5,2,3,5,1,0,5,3,4,4,4,4,4};
		int[] idx = new int[100];
		
		
		
		t1.searchIdx(intArray, intArray.length, 4, idx);
		
		
	}


	


	
	
}		// TODO Auto-generated method stub



