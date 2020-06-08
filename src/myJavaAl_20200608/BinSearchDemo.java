package myJavaAl_20200608;

public class BinSearchDemo {
	public static void main(String[] args) {
		
		int[] a1 = new int[10];
		BinSearchEx bs= new BinSearchEx();
		bs.random(a1);
		bs.ascending(a1);
		bs.print(a1);
		System.out.println();
		bs.binSearch(a1, 8);
		bs.binSearchForLoop(a1, 8);
		
		
		
		
		

	}
}
