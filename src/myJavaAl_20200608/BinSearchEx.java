package myJavaAl_20200608;

public class BinSearchEx {

	/*
	 * 1번부터 20번까지의 번호를 랜덤하게 뽑아, 각 배열에 집어넣는다.(중복을 허용하지 않음) 배열길이는 10개 각 배열을 오름차순으로
	 * 정렬한다. 정렬된 배열중에 해당번호 (17번)이 있는지 검색한다(binarySearch 활용)
	 *
	 */

	public int[] random(int[] a) {

		for (int i = 0; i < a.length; i++) {
			int randomNumber = (int) (Math.random() * 20) + 1; // 1~20까지의 번호를 랜덤하게 뽑는다.
			// 중복되는 값이 있는지 체크
			boolean isExisted = false;
			for (int j = 0; j < i; j++) {
				if (a[j] == randomNumber) {
					isExisted = true;
					break;
				}

			}
			if (!isExisted) {
				a[i] = randomNumber;
			} else {
				i--;
			}
		}
		return a;
	}

	public void print(int[] a) {
		for (int i : a) {
			System.out.print(i + " ");

		}
	}

	public int[] ascending(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int tmp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = tmp;
				}
			}
		}
		return a;
	}

	public void binSearch(int[] a, int key) {
		int start = 0;
		int end = a.length - 1;
		int mid;
		boolean result = false;
		while (start <= end) {
			mid = (start + end) / 2;
			if (a[mid] == key) {
				result = true;
				break;
			} else if (a[mid] > key) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		if(result == true) {
			System.out.println("찾는값이 있습니다.");
		} else {
			System.out.println("찾는값이 없습니다.");
		}
		
	}
	
	public void binSearchForLoop(int []a, int key ) {
		boolean result = false;
		for(int start = 0; start<=a.length-1; start++) {
			int end = a.length -1;
			int mid = (start+end)/2;
			if(a[mid]==key) {
				result = true;
				break;
			} else if(a[mid]>key) {
				end = mid-1;
				
			}else {
				start = mid+1;
			}
		}
		if(result == true) {
			System.out.println("찾는값이 있습니다.");
		}
		else {
			System.out.println("찾는값이 없습니다.");
		}
	}

}
