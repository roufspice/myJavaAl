package myJavaAl_codebox;

public class Theater {

	private Seat[][] seats;
	// 2차원 배열

	private int rowCount;
	private int colCount;

	public Theater(int rowCount, int colCount) {
		// 알파벳은 26개만 존재
		if (rowCount > 26) {
			rowCount = 26;
		}
		this.rowCount = rowCount;
		this.colCount = colCount;
		// 좌석배열 생성
		seats = new Seat[rowCount][colCount];

		// 각 Seat 인스턴스 생성
		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				seats[i][j] = new Seat();

			}
		}

	}

	public void printSeatMatrix() {
		System.out.print("  ");
		for (int i = 1; i <= 9; i++) {
			System.out.print("  " + i);
		}
		System.out.println();

		for (int i = 0; i < rowCount; i++) {
			System.out.print((char) ('A' + i) + ": ");

			for (int j = 0; j < colCount; j++) {
				Seat s = seats[i][j];
				if (s.isOccupied()) {
					System.out.print("[O]");
				} else {
					System.out.print("[ ]");

				}
			}
			System.out.println();
		}
	}

	public boolean reserve(String name, char rowChar, int col, int numSeat) {
		// 존재하지 않는 행 또는 열을 입력하면 false를 리턴하고 메소드를 종료합니다.
		if (getRowIndex(rowChar) + 1 > rowCount || col + numSeat - 1 > colCount) {
			return false;
		} else {
			// 하나의 좌석이라도 예약이 되어있다면, 예약하면 안됨.
			for (int i = col - 1; i < col + numSeat - 1; i++) {
				if (seats[getRowIndex(rowChar)][i].getName() != null) {
					break;
				} else {

				}
				for (int j = col - 1; j < col + numSeat - 1; j++) {
					seats[getRowIndex(rowChar)][j].reserve(name);
				}
			}

			return true;
		}

	}

	private int getRowIndex(char uppercaseChar) {

		return uppercaseChar - 'A';
	}

}
