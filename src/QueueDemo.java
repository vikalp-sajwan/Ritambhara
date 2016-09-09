import api.Queue;
import api.QueueEmptyException;

public class QueueDemo {
	
	public static void main(String[] args) {
		
		Queue q = new Queue();
		try {
			System.out.println(q.delete());
		} catch (QueueEmptyException e) {
			System.out.println(e);
		}
		q.insert(1);
		q.insert(2);
		q.insert(3);
		try {
			q.display();
		} catch (QueueEmptyException e) {
			System.out.println(e);
		}
		try {
			System.out.println(q.delete());
		} catch (QueueEmptyException e) {
			System.out.println(e);
		}
		try {
			q.display();
		} catch (QueueEmptyException e) {
			System.out.println(e);
		}
		
	}
}
