package com.LinkedList;

import java.util.NoSuchElementException;

public class LinkedList {

	Node head=null;
	Node tail=null;
	int size=0;
	public void InsertStart(int data){
		Node temp = new Node(data);
		if(head==null){
			head=temp;
			tail=temp;
		}
		else{
			temp.link=head;
			head=temp;
		}
		size++;
	}
	public int getElement(int index) {
		if(index>size) {
			//throw new NullPointerException("<--Element index exceeds-->");	
		}
		Node getNode=head;
		for(int i=0;i<index;i++) {
			getNode=getNode.link;
			
		}
		return getNode.data;	
	}
	public void get(int index) {
		if(getElement(index)!=-1)
			System.out.println(getElement(index));
		System.out.println("Element index exceeds");
		
	}
	public void InsertLast(int data){
		Node temp1 = new Node(data);
		if(head==null){
			head=temp1;
			tail=temp1;
		}
		else{
			tail.link=temp1;
			tail=temp1;
		}
		size++;
	}

	// Java Function to remove the first node
	// of the linked list
	public void removeFirstNode()
	{
		if (size == 0)
			throw new NoSuchElementException("no elements");
		if (size==1)
			head=tail=null;
		size--;
		head=head.link;
		size--;
	}

	public void removeLastNode()
	{
		if (size == 0)
			throw new NoSuchElementException("no elements");
		if (size==1)
			head=tail=null;
		size--;

		Node temp=head;
		while (temp.link!=tail) {
			temp=temp.link;
		}temp.link=null;
	}

	public void InsertAt(int position,int data)
	{
		if (position==0) {
			InsertStart(data);
		}
		if (position==size) {
			InsertLast(data);
		}
		// 1 2 3 --> 4(2)
		if (position>size) {
			throw new IndexOutOfBoundsException();
		}
		Node new_node = new Node(data);
		Node current = head;
		for(int i=0;i<position-1;i++){
			current=current.link;
		}
		Node next=current.link;
		current.link=new_node;
		new_node.link=next;

	}
	public void DeleteAt(int position) {
		if(position>size) {
			throw new IndexOutOfBoundsException();
		}
		if(position==0) {
			removeFirstNode();
			return;
		}
		if(position==(size-1)) {
			removeLastNode();
			return;
		}
		Node curreNode=head;
		for(int i=0;i<position-1;i++) {
			curreNode=curreNode.link;
		}
		Node nexNode=curreNode.link.link;
		curreNode.link=nexNode;
		size--;
		
	}
	

	public void print(){
		//Node temp=head;
		while(head!=null){
			System.out.println(head.data);
			head=head.link;
		}
	}

}

