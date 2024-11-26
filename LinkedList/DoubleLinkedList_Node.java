package com.LinkedList;
class DNode{
	int data;
	DNode prev;
	DNode next;
	
	public DNode(int data) {
		this.data=data;
		this.prev=null;
		this.next=null;
	}
}
public class DoubleLinkedList_Node {
	public static void forwardTraversal(DNode head) {
        // Start traversal from the head of the list
        DNode curr = head;

        // Continue until the current node is 
        // null (end of the list)
        while (curr != null) {
          
            // Output data of the current node
            System.out.print(curr.data + " ");
          
            // Move to the next node
            curr = curr.next;
        }

        // Print newline after traversal
        System.out.println();
    }

    // Function to traverse the doubly linked list 
  	//in backward direction
    public static void backwardTraversal(DNode tail) {
      
        // Start traversal from the tail of the list
        DNode curr = tail;

        // Continue until the current node is 
        // null (end of the list)
        while (curr != null) {
          
            // Output data of the current node
            System.out.print(curr.data + " ");
          
            // Move to the previous node
            curr = curr.prev;
        }

        // Print newline after traversal
        System.out.println();
    }
    public static void findLength(DNode head) {
    	int count=0;
    	DNode curr=head;
//    	if(curr.prev==null||curr==null||curr.next==null) {
//    		System.out.println(count);
//    	}
    	while(curr!=null) {
    		count++;
    		curr=curr.next;
    	}
    	System.out.println(count);
    }
    public static DNode insertBeginning(DNode head,int data) {
    	DNode new_node =new DNode(data);
    	
    	new_node.next=head;
    	
    	if(head!=null) {
    		head.prev=new_node;
    	}
    	
    	return new_node;
    }
    public static void print(DNode head) {
    	DNode curr=head;
    	while(curr!=null) {
    		System.out.print(curr.data+" ");
    		curr=curr.next;
    	}System.out.println();
    }
    public static void main(String[] args) {
		DNode head=new DNode(1);
//		DNode first=new DNode(2);
//		DNode second=new DNode(3);
		
//		head.next=first;
//		first.prev=head;
//		first.next=second;
//		second.prev=first;
		
//		forwardTraversal(head);
//		backwardTraversal(second);
//		findLength(head);
		head=insertBeginning(head, 0);
		print(head);
	}
}
