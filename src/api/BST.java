package api;

// class for the node of the tree
class TreeNode {
	int data;
	TreeNode right;
	TreeNode left;

	TreeNode(int d) {
		data = d;
		right = null;
		left = null;
	}
}

// class for the Binary Search Tree
public class BST {
	TreeNode head = null;

	// function to check if tree is empty
	public boolean isEmpty() {
		if (head == null)
			return true;
		else
			return false;
	}

	// Wrapper function
	// function to insert an element in the BST
	public void insertNode(int data) {
		if (head == null) {
			head = new TreeNode(data);
			return;
		} else
			insert(head, data);
	}

	// recursive function
	private void insert(TreeNode r, int d) {
		if (r.data > d) {
			if (r.left == null) {
				r.left = new TreeNode(d);
				return;
			} else
				insert(r.left, d);
		}

		else {
			if (r.right == null) {
				r.right = new TreeNode(d);
				return;
			} else
				insert(r.right, d);
		}
	}

	// function to print tree in IN ORDER
	// WRAPPER FUNCTION
	public void printInOrder() {
		inOrder(head);
	}

	// recursive function
	private void inOrder(TreeNode r) {
		if (r == null) {
			return;
		}
		inOrder(r.left);
		System.out.println(r.data);
		inOrder(r.right);
	}

	// function to print tree in PRE ORDER
	// WRAPPER FUNCTION
	public void printPreOrder() {
		preOrder(head);
	}

	// recursive function
	private void preOrder(TreeNode r) {
		if (r == null) {
			return;
		}
		System.out.println(r.data);
		preOrder(r.left);
		preOrder(r.right);
	}

	// function to print tree in Post ORDER
	// WRAPPER FUNCTION
	public void printPostOrder() {
		postOrder(head);
	}

	// recursive function
	private void postOrder(TreeNode r) {
		if (r == null) {
			return;
		}
		postOrder(r.left);
		postOrder(r.right);
		System.out.println(r.data);
	}
}
