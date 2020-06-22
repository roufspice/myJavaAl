package myJavaAl_20200622;

public class Stack01 {
	//stack 선언! push() pop() peak() search();
	private int max;
	private int ptr;
	private int[] stk;
	
	//실행시 예외: 스택이 비어있음
	public class EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException() {}
	}
	
	//실행 시 예외: 스택이 가득차 있음
	public class OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException() {}
		
	}
	
	public Stack01(int cap) { //스택 본체용 배열을 생성 : 스택은 비어있음
		ptr = 0; //데이터가 하나도 없기 때문에 ptr = 0;
		max = cap;
		try {
			stk = new int[max];
			
		} catch(OutOfMemoryError e) {
			max = 0;
		}
		
	}
	
	//push() 
	public int push(int x) {
		
		if(ptr >= max) 
			throw new OverflowIntStackException();
		
		return stk[ptr++] = x; //전달받은 데이터 x를 배열요소 stk[ptr]에 저장하고 스택 포인터(ptr)을 1증가시킴.
		
	}
	
	//pop() 스택의 꼭대기에서 데이터를 제거하고 그값을 반환하는 메소드
	//스택이 비어있을 경우 예외처리를 합니다.
	
	public int pop() throws EmptyIntStackException {
		if (ptr <= 0) throw new EmptyIntStackException();
		return stk[--ptr]; //스택포인터 str 값을 하나 갑소시키고 꼭대기에 있는 데이터를 반환!
		
	}
	
	//peek() 스택의 꼭대기에 있는 데이터를 몰래 엿보는 메서드!
	//스택이 비어있는 경우, 예외처리 합니다.
	public int peek() throws EmptyIntStackException {
		if (ptr <= 0) throw new EmptyIntStackException();
		return stk[ptr -1];
		
	}

}
