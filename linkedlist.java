

import java.util.*;
import java.lang.*;
import java.io.*;


class linkedlist
{
	public static void main (String[] args) throws java.lang.Exception
	{   Scanner input = new Scanner(System.in);
		Node n1 = new Node(10);
		Node n2 = new Node(19);
		Node n3 = new Node(33);
		Node n4 = new Node(23);
		Node n5 = new Node(235);
		Node n6 = new Node(998);
		Node n7 = new Node(98);
		Node n8 = new Node(88);
		Node n9 = new Node(78);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		n7.next = n8;
		n8.next = n9;
		n9.next = null;
      Node head = n1;
       Node current = head;
	   int flag = 0;
	   System.out.println("enter the element that you want to enter");
	   int req = input.nextInt();
		while(current.next != null){
		     if(current.data == req){
				flag = 1;
			 }
			 current = current.next;
		}
	
		if(flag == 1){
			System.out.println("element is present in the linked list");
		}
		else{
			System.out.println("element is not presnt in the linked list");
		}
		

	}
}
class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
	}
}