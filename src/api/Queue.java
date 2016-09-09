package api;

import java.util.LinkedList;

// class to implement Queue using Linkedlist
public class Queue extends QueueEmptyException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private LinkedList<Integer> ls = new LinkedList<Integer>();
	
	public void insert( int data){
		ls.add(data);
	}
	
	public int delete() throws QueueEmptyException
	{
		if(ls.isEmpty())
			throw new QueueEmptyException();
		return ls.removeFirst();
	}
	
	public void display() throws QueueEmptyException{
		if(ls.isEmpty())
			throw new QueueEmptyException();
		else
			System.out.println(ls);
	}
}
