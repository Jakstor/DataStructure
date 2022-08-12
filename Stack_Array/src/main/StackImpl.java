package main;

public class StackImpl {

	int size;
	int arr[];
	int top;
	
	StackImpl(int size){
		this.size = size;
		this.arr = new int[size];
		this.top = 0;
	}
	
	public boolean isFull() {
		if(top == size) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isEmpty() {
		if(top == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void push(int ele) {
		if(!isFull()) {
			arr[top] = ele;
			top++;
		}
		else {
			System.out.println("Stack Overflow...");
		}
	}
	
	public int pop() {
		if(!isEmpty()) {
			int popEle = arr[top-1];
			top--;
			return popEle;
		}
		else {
			System.out.println("Stak Underflow...");
			return -1;
		}
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack is Empty...");
			return -1;
		}
		else {
			System.out.println("top:-"+top);
			return arr[top-1];
		}
	}
	
	public void display() {
		System.out.println("Elements in the Stack:- ");
		for(int i=0;i<top;i++) {
			System.out.println(arr[i]);
		}
	}
}
