package LinkedList;

import LinkedList.CircularLinkedList.Node;

public class CircularLinkedList{
	class Node{
		int data;
		Node next;
		
		public Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	public Node head = null;
	public Node tail = null;
	
	public void addNode(int data)
	{
		Node newNode = new Node(data);
		if(head==null)
		{
			head = newNode;
			tail = newNode;
			newNode.next = head;
		}
		else
		{
			tail.next = newNode;
			tail=newNode;
			tail.next = head;
		}
	}
	public void display()
	{
		Node current = head;
		if(head == null)
		{
			System.out.println("List is empty");
			return;
		}
		System.out.println("Nodes of Circular linked list");
		do {
			System.out.print(current.data +" ");
			current = current.next;
		}
		while(current!=head);
		{
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		CircularLinkedList slist = new CircularLinkedList();
		slist.addNode(1);
		slist.addNode(33);
		slist.addNode(2);
		slist.addNode(6);
		
		slist.display();
	}
}
