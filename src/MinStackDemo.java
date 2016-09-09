import java.util.Scanner;
import api.MinStack;

public class MinStackDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MinStack stack1 = new MinStack();
		do {
			System.out.println();
			System.out.println("1)Push.");
			System.out.println("2)Pop.");
			System.out.println("3)Display.");
			System.out.println("4)Minimum.");
			System.out.println("5)Exit.");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter the Data:");
				sc.nextLine();
				int data = sc.nextInt();
				stack1.push(data);

				break;
			case 2:
				try {
					stack1.pop();
				} catch (Exception e) {
					System.out.println("stack is empty");
				}
				break;
			case 3:
				try {
					stack1.printStack();
				} catch (Exception e) {
					System.out.println("stack is empty");
				}
				break;
			case 4:
				try {
					System.out.println(stack1.getMin());
				} catch (Exception e) {
					System.out.println("stack is empty");
				}
				break;
			case 5:
				System.exit(0);
				break;
			}

		} while (true);

	}

}