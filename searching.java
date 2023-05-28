package demo;
import java.util.Scanner;



public class searching {
	private Node head;
	private int size;
	
	class Node{
		
		int data; 
		Node next;
		
		Node(int data)
		{
			this.data = data;
			this.next = null;
		}
		
		
		void addFirst(int data) {
			Node newnode = new Node(data);
			if(head == null)
			{
				
				head = newnode;
			}
			
			newnode.next = head;
			head.next = null;
		}
		
		void deleteFirst()
		{
			if(head == null)
			{
				System.out.println("Null");
			}
			
			head = head.next;
		}
		
		void insertLast(int data)
		{
			Node newNode = new Node(data);
			if(head == null)
			{
	  
		     head = newNode;
				
			}
			
			Node curNode  = head;
			while(curNode.next != null)
			{
				curNode = curNode.next;
				
			}
			
			curNode.next = newNode;
			newNode.next = null;
		}
		
		void deleteLast()
		{

			if(head == null)
			{
				System.out.println("Null");
			}
			
			Node sLast = head;
			Node lastNode = head.next;
			
			while(lastNode.next != null)
			{
				sLast = sLast.next;
				lastNode = lastNode.next;
				
				
			}
		
			
			sLast.next = null;
			
		}
		
	   }

	public static void main(String[] args) {
		
		
		searching a  = new searching();
		a
		
		
	 
	}
}


