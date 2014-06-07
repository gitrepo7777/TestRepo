package com.vani;

import com.vani.BinaryTree.Node;

public class BinTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinTree bt = new BinTree();
		bt.run();

	}
	
	public void run()
	{
		Node root = new Node(5);
		insertNode(root, 1);
		insertNode(root, 8);
		insertNode(root, 6);
		insertNode(root, 3);
		insertNode(root, 9);
		
		printInOrder(root);
	}
	
	public void insertNode(Node node, int value)
	{
		

/*	    if (value < node.value) {
	      if (node.left != null) {
	    	  insertNode(node.left, value);
	      } else {
	        System.out.println("  Inserted " + value + " to left of "
	            + node.value);
	        node.left = new Node(value);
	      }
	    } else if (value > node.value) {
	      if (node.right != null) {
	    	  insertNode(node.right, value);
	      } else {
	        System.out.println("  Inserted " + value + " to right of "
	            + node.value);
	        node.right = new Node(value);
	      }
	    }*/
	  
	    
		
		if(value < node.value)
		{
			if(node.left != null){
				insertNode(node.left, value);
			}else{
				node.left  = new Node(value);
			}
		}
		else if(value > node.value)
		{
			if(node.right != null)
			{
				insertNode(node.right, value);
			}else
			{
				node.right = new Node(value);
			}
		}
	}
	
	public void printInOrder(Node node)
	{


	  
		
		if(node != null)
		{
			printInOrder(node.left);
			System.out.println("Node Value " + node.value);
			printInOrder(node.right);
			
		}
			
		
	}
	
	static class Node{

	   /* Node left;

	    Node right;

	    int value;

	    public Node(int value) {
	      this.value = value;
	    }*/
	  
	    
		Node left;
		Node right;
		int value;
		
		public Node(int nodeValue )
		{
			value = nodeValue;
			
		}
	}

}
