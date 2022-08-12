package main;

public class StackMain {

	public static void main(String[] args) {
		
		StackImpl stack = new StackImpl(5);
		stack.push(0);
		stack.push(1);
		stack.push(2);
		stack.display();
		System.out.println(stack.peek()); 
		System.out.println(stack.pop());
		System.out.println(stack.peek());
	}

}
