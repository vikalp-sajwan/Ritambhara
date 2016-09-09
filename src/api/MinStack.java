package api;

// class for the MinStackNode that extends StackNode
class MinStackNode extends StackNode{
	
	int minData;
	
	MinStackNode(int data){
		super(data);
		minData = 0;
	}
}

public class MinStack extends Stack{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void push(int data){
		
		MinStackNode temp = new MinStackNode(data);
		temp.next = top;
		if(top == null || data < ((MinStackNode)top).minData ){
			temp.minData = data;
		}
		else{
			temp.minData = ((MinStackNode)top).minData;			
		}
		
		top = temp;
		
	}
	
	public int getMin() throws Exception{
		if(top == null){
			throw new Exception();
		}
		else{
			return ((MinStackNode)top).minData;
			}
		}
}
