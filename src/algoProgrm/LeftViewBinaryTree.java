/**
 * 
 */
package treedatastructure;

import java.util.LinkedList;
import java.util.Queue;

import treedatastructure.RightLevelOrderBtree.Node;

/**
 * @author 212720190
 * @date Dec 21, 2019
 */
public class LeftViewBinaryTree {
	Node root;

	static class Node {
		Node left,right;
		int data;

		Node(int data) {
			this.data = data;
		}
	}

	static void leftView(Node root) {
		Queue<Node> q = new LinkedList<>(); 
		q.add(root);

		while(!q.isEmpty()) {
			int size = q.size();
			int i=size;
			while(i-->size) {
				Node val = q.poll();
				if(i==size-1)
					System.out.print(val.data+" ");

				if(val.left !=null) {
					q.add(val.left);
				}
				if(val.right !=null) {
					q.add(val.right);
				}
			}
		}
	}
	public static void main(String[] args) {

		LeftViewBinaryTree obj = new LeftViewBinaryTree();
		obj.root = new Node(10);
		obj.root.left = new Node(12);
		obj.root.right = new Node(15);
		obj.root.left.left = new Node(20);
		obj.root.left.right = new Node(22);

		leftView(obj.root);
	}

}
