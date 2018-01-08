package BinaryTree;

public class BinaryTree {
		Node root;
		BinaryTree(int p){
			root= new Node(p);
		}
		BinaryTree(){
			root= null;
		}
		public static void printInorder(Node node){
			if(node== null){
				return;
			}
			printInorder(node.left);
			System.out.println(node.value);
			printInorder(node.right);
			
		}
		public static void main(String[] args){
			BinaryTree tree=new BinaryTree();
			tree.root=new Node(13);
			tree.root.left=new Node(2);
			tree.root.right=new Node(1);
			tree.root.left.left=new Node(4);
			tree.root.left.right=new Node(5);
			tree.root.right.left=new Node(3);
			
			System.out.println(tree.root.left.left.value);
		printInorder(tree.root);
		}
}
