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

	public int cancel(String name) {
		// 이름 name으로 예약된 자리를 취소하고, 취소된 좌석의 수를 리턴한다.
		int seatsCount = 0;
		// name으로 등록된 자리를 찾아야 한다! 있으면 해당 자리를 취소하고 없으면 패스!
		// 검색부터!
		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				if (seats[i][j].getName() == name) { // 해당name으로 등록된 자리이면!
					seats[i][j].cancel(); // 해당 name을 지운다.
					seatsCount++; // 취소된 좌석의 수를 리턴한다.

				}

			}
		}

		return seatsCount;

	}

	public int cancel(char rowChar, int col, int numSeat) {
		// 메소드 오버로딩, 파라미터로 받는 열, 행, 좌석 수에 해당되는 모든 좌석의 예약을 취소합니다.
		int seatsCount = 0;
		// 파라미터로 입력된 값으로 해당 인덱스를 찾아야함.
		int rowCount = getRowIndex(rowChar);
		for (int i = col-1; i < col + numSeat-1; i++) {
			if (seats[rowCount][i].getName() != null) {
				seats[rowCount][i].cancel(); // 예약된 이름이 있다면 취소하기
				seatsCount++;
			}

		}

		// t.cancel('G',3,4): G3부터 G6까지 네 자리중 G3, G4를 취소하고 2리턴!
		return seatsCount;
	}

	
	 public int getNumberOfReservedSeat() { //예약된 모든 좌석 수를 리턴하는 메소드입니다.
		 int reservedSeats = 0;
		 for(int i =0; i<rowCount; i++) {
			 for(int j =0; j<colCount; j++) {
				 if(seats[i][j].getName() !=null) {
					 reservedSeats++;
				 }
			 }
		 }
		 
		 
		 return reservedSeats;
		 
	 }
		 

	 
	 
	 
	private int getRowIndex(char uppercaseChar) {

		return uppercaseChar - 'A';
	}

}
