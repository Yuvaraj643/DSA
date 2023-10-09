package DSA;

import org.w3c.dom.NamedNodeMap;

public class LinkedList {
	public static class Node{
		int data;
		Node next;
		
		Node(int val){
			this.data = val;
		}
	}
	public static Node addLast(Node head, int val) {
		Node n =  new Node(val);
		Node tailNode = head;
		while(tailNode.next != null) {
			tailNode = tailNode.next;
		}
		tailNode.next = n;
		return head;
		
	}
	
	public static Node addFirst(Node head, int val) {
		Node n =  new Node(val);
		n.next = head;
		head =n;
		
		return head;	
	}
	
	public static Node Addat(Node head,int val, int index) {
		Node node = new Node(val);
		Node tempNode = head;
		if (index < 0) {
	        System.out.println("Invalid index");
	    }
	    if (index == 0) {
	        node.next = head;
	        head = node;
	    }
		for(int i=1;i<index && tempNode!=null;i++) {
			tempNode = tempNode.next;
		}
		
		if (tempNode == null) {
	        System.out.println("Invalid index");
	    }
		Node tempNode2 = tempNode.next;
		tempNode.next = node;
		node.next = tempNode2;
		return head;
	}
	
	public static Node RemoveFirst(Node head) {
		if(head == null) {
			return null;
		}
		head = head.next;
		return head;
	}
	
	public static Node RemoveLast(Node head) {
		if(head == null) {
			return null;
		}
		if(head.next==null) {
			return null;
		}
		Node tempNode = head;
		while(tempNode.next.next!=null) {
			tempNode = tempNode.next;
		}
		tempNode.next = null;
		
		return head;
	}
	
	public static Node RemoveAt(Node head,int index) {
		Node tempNode = head;
		for(int i=1;i<index && tempNode!=null;i++) {
			tempNode= tempNode.next;
		}
		Node tempNode1 = tempNode.next.next;
		tempNode.next = tempNode1;
		
		return head;
	}
	
	public static int Length(Node head) {
		int count =0;
		Node tempNode = head;
		
		while (tempNode != null) {
		    count++;
		    tempNode = tempNode.next; 
		}

		return count;
		
	}
	
	public static void main(String[] args) {
	    Node n1 = new Node(10);
	    Node n2 = new Node(20);
	    Node n3 = new Node(30);
	    Node n4 = new Node(40);
	    Node n5 = new Node(50);

	    n1.next = n2;
	    n2.next = n3;
	    n3.next = n4;
	    n4.next = n5;
	    Node head = n1;
	    Node temp = head;
	    head = addFirst(head, 5);
	    head = addLast(head, 60);
	    head = Addat(head,35,3);
	    head = RemoveFirst(head);
	    head = RemoveLast(head);
	    head = RemoveAt(head, 2);
	    int length = Length(head);
	    System.out.println("Length of the linked list: " + length);
	    while (temp != null) {
	        System.out.println(temp.data + " ");
	        temp = temp.next;
	    }
	    
	}

}
