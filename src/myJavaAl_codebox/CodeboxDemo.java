package myJavaAl_codebox;

public class CodeboxDemo {
	
	public static void main(String[] args) {
		Theater t = new Theater(5,9);
		t.printSeatMatrix();
		System.out.println("김신의님 이름으로 A5부터 2개의 좌석 예약: " + (t.reserve("김신의", 'A', 5, 2) ? "성공" : "실패"));
		t.printSeatMatrix();
		System.out.println("이윤수님 이름으로 C1부터 3개의 좌석 예약: " + (t.reserve("이윤수", 'C', 1, 3) ? "성공" : "실패"));
		t.printSeatMatrix();
		System.out.println("강영훈님 이름으로 D4부터 7개의 좌석 예약: " + (t.reserve("강영훈", 'D', 4, 7) ? "성공" : "실패"));
        System.out.println("문종모님 이름으로 C7부터 3개의 좌석 예약: " + (t.reserve("강영훈", 'C', 7, 3) ? "성공" : "실패"));
        t.printSeatMatrix();
		
	}

}
