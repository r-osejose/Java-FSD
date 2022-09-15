package LinkedList;

import LinkedList.DoublyLinkedList.Node;

public class DoublyLinkedList{
	class Node{
		int data;
		Node prev;
		Node next;
		
		public Node(int data)
		{
			this.data = data;
			this.prev = null;
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
			head.prev = null;
			tail.next = null;
		}
		else
		{
			tail.next = newNode;
			newNode.prev = tail;
			tail=newNode;
			tail.next = null;
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
		System.out.println("Nodes of Doubly linked list");
		while(current!=null)
		{
			System.out.print(current.data +" ");
			current = current.next;
		}
	}
	public static void main(String args[])
	{
		DoublyLinkedList slist = new DoublyLinkedList();
		slist.addNode(11);
		slist.addNode(9);
		slist.addNode(2);
		slist.addNode(12);
		slist.addNode(7);
		slist.addNode(9);
		
		slist.display();
	}
}
