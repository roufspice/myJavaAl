package myJavaAl_20200622;

import java.util.EmptyStackException;

public class IntStack {
	private int top;
	private int[] stk;
	
	//
	
	public IntStack(int capacity) {
		top = 0;
		this.stk = new int[capacity];
		
		
	}
	
	public int push(int i) {
		if(top < stk.length){
			return stk[top++] = i;
		} else {
			throw new java.util.NoSuchElementException();
			
		}
	}
	
	public int pop() {
		if(top > 0) {
			return stk[--top];
			
		}else {
			throw new java.util.NoSuchElementException();
		}
		
	}
	
	public int peek() throws EmptyStackException {
		if(top > 0) {
			return stk[top-1];
		} else {
			throw new EmptyStackException();
		}
		
	}
	public int capacity() {
		return stk.length;
	}
	
	public int size() {
		return top;
	}
	
	public boolean isEmpty() {
		return top <=0;
		
	}
	//스택안의 모든 데이터를 바닥 -> 꼭대기 순서로 출력
	public void dump() {
		if(top <= 0) {
			System.out.println("Stack is empty");
		} else {
			for (int i=0; i< top; i++) {
				System.out.print(stk[i] + " ");
			
			}
			System.out.println();
		}
		
	}
	
	

}
