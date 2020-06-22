package myJavaAl_20200622;

public class IntStackDemo {
	public static void main(String[] args) {
		
		
		IntStack stk = new IntStack(5);
		stk.push(1);
		stk.push(2);
		stk.push(3);
		stk.push(4);
		stk.push(5);
		stk.pop();
		stk.pop();
		System.out.println(stk.pop());
		System.out.println(stk.capacity());
		System.out.println(stk.size());
		System.out.println(stk.peek());
		
		
		stk.dump();
		if(stk.isEmpty()) {
			System.out.println("비었습니다.");
		} else {
			System.out.println("비어있지 않습니다.");
		}
		
		
		
	}

}
