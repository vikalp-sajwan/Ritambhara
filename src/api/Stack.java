package api;

// class for the stack node
class StackNode{
	int data;
	StackNode next;
	
	// constructor to initialize the object
	StackNode(int data){
		this.data = data;
		next = null;
	}
}

// class for the stack
public class Stack extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	StackNode top;
	
	// constructor to initialize the object
	public Stack(){
		top = null;
	}
	
	// class method for POP operation
	public int pop()throws Exception{
		
		if(top == null){
			throw new Exception();
		}
		else{
			int temp = top.data;
			top = top.next;
			return temp;
		}
		
		
	}
	
	// class method for the PUSH operation
	public void push(int data){
		StackNode temp = new StackNode(data);
		temp.next = top;
		top = temp;
	}
	
	// class method for the ISEMPTY
	public boolean isEmpty(){
		if(top == null)
			return true;
		else 
			return false;
	}
	
	// class method for the PRINT fn
	public void printStack() throws Exception{
		
		if(top == null){
			throw new Exception();
		}
		else{
			StackNode temp = top;
			System.out.println("");
			while (temp != null){
				System.out.print(temp.data + "\t");
				temp = temp.next;
			}
		}
	}
}
	
