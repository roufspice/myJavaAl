package myJavaAl_20200622;

class StackDemo {
	// stack 후입선출~!
	// 배열로 Stack 구현!!!
	int top;
	int[] stack;
	int size;

	public StackDemo(int size) {
		this.size = size;
		stack = new int[size]; // size를 스택의 최대값으로 설정
		top = -1; // top의 값 초기화
	}

	private void push(int item) {
		stack[++top] = item; //초기값이 -1이니까 stack[++top]
		System.out.println(stack[top] + " push!");

	}

	private void peek() {
		System.out.println(stack[top] + " peek!");

	}

	private void pop() {
		System.out.println(stack[top] + " pop!");
		stack[top--] = 0;
	}

	private int search(int item) {
		for (int i = 0; i <= top; i++) { // for문은 top만큼
			if (stack[i] == item)
				return (top - i) + 1; // top - 탐색한 배열의 인덱스, 배열이므로 + 1추가
		}
		return -1;
	}

	private boolean empty() {
		return size == 0;

	}

}
