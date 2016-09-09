import api.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack stack1 = new Stack();
		
		if (stack1.isEmpty()) {
			System.out.println("the stack is empty");
		} 
		else
			System.out.println("stack is Not empty");
		
		System.out.println("push 1");
		stack1.push(1);
		
		if (stack1.isEmpty()) {
			System.out.println("the stack is empty");
		} 
		else
			System.out.println("stack is Not empty");
		
		try {
			stack1.printStack();
		} catch (Exception e2) {
			System.out.println("stack is empty");
		}
		
		System.out.println("push 2 3 4");
		stack1.push(2);
		stack1.push(3);
		stack1.push(4);
		
		try {
			stack1.printStack();
		} catch (Exception e1) {
			System.out.println("stack is empty");
		}
		
		System.out.println("pop");
		try {
			stack1.pop();
		} catch (Exception e) {
			System.out.println("stack is empty");
		}
		
		try {
			stack1.printStack();
		} catch (Exception e) {
			System.out.println("stack is empty");
		}
	}
}
