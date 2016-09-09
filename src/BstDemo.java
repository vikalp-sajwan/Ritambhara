import api.BST;

public class BstDemo {

	public static void main(String[] args) {

		BST bst1 = new BST();

		if (bst1.isEmpty()) {
			System.out.println("empty");
		} else
			System.out.println("not empty");

		bst1.insertNode(5);

		if (bst1.isEmpty()) {
			System.out.println("empty");
		} else
			System.out.println("not empty");

		bst1.insertNode(6);
		bst1.insertNode(4);
		bst1.insertNode(8);

		System.out.println("Tree in IN order:");
		bst1.printInOrder();

		System.out.println("Tree in Pre order:");
		bst1.printPreOrder();

		System.out.println("Tree in Post order:");
		bst1.printPostOrder();
	}

}
