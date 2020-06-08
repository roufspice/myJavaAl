package myJavaAl_20200608;

public class SeqSearchSen {
	public int seqSearchSen(int[] a, int n, int key) {
		int i =0;
		a[n] = key;
		
		while(true) {
			if(a[i] == key) {
				break;
			} else {
				i++;
			}
		}
		return i == n ? -1 : i;
	}

}
