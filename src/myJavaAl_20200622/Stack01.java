package myJavaAl_20200622;

public class Stack01 {
	private int[] arr;
	private int top =0; 
	
	
	public Stack01(int stackSize) {
		this.arr =new int[stackSize];
		
	}
	
	
	public void push(int i) {
		if (top < arr.length) {
			arr[top++] = i;
			System.out.println("pushed: " + i);
		}
		else {
			System.out.println("Stack is full");
		}
		// 더이상 들어갈 공간이 없을 때, stackOverFlow
		
	}
	
	public int pop() {
		if(top > 0) {
			return arr[--top];
			
		}else {
			throw new java.util.NoSuchElementException();
		}
	}
	
	

}
