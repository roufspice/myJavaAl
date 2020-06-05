package myJavaAl_20200605;

public class ReverseArray {
	//배열을 역순을 만드는 알고리즘!!
	
	public static int[] reverse(int[] a) {
		for(int i = 0; i < (a.length)/2; i++) {
			int t;
			t = a[i];
			a[i] = a[(a.length)-i-1];
			a[(a.length)-i-1] = t;
			System.out.println(i +"번 스와핑!");
		}
		return a;
		
	}
	
	public static String[] reverse(String[] a) {
		for(int i = 0; i < (a.length)/2; i++) {
			String t;
			t = a[i];
			a[i] = a[(a.length)-i-1];
			a[(a.length)-i-1] = t;
			System.out.println(i+1 +"번 스와핑!");
		}
		return a;
		
	}
	
	
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6,7,8,9,};
		reverse(a);
		
		for (int i : a) {
			System.out.print(i +" ");
			
		}
		System.out.println();
		String[] b = {"1번", "2번", "3번", "4번", "5번"};
		
		reverse(b);
		
		for (String str : b) {
			System.out.print(str +" ");                                                                                                                                                                                                                  
		}
		
		int[] c = a;
		
		boolean iscorrect = a.equals(c);
		
		if(iscorrect) {
			System.out.println("참입니다.");
			
		} else {
			System.out.println("거짓입니다.");
		}
		
		

}
}

