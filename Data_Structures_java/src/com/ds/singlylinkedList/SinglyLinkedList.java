package com.ds.singlylinkedList;

public class SinglyLinkedList {

	private ListNode head;

	private static class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}

	}

	public void printSinglyLinkedList() {
		ListNode current = head;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

	public int findLength() {
		if (head == null)
			return 0;

		int count = 0;
		ListNode current = head;
		while (current != null) {
			count++;
			current = current.next;
		}
		return count;
	}

	public void inserNodeAtBeginning(int data) {
		ListNode newNode = new ListNode(data);
		newNode.next = head;
		head = newNode;
	}

	public static void main(String[] args) {

		SinglyLinkedList sll = new SinglyLinkedList();

		sll.head = new ListNode(10);
		ListNode second = new ListNode(20);
		ListNode third = new ListNode(30);
		ListNode fourth = new ListNode(40);

		sll.head.next = second;
		second.next = third;
		third.next = fourth;

		sll.printSinglyLinkedList();

		sll.inserNodeAtBeginning(6);
		System.out.println("Length:" + sll.findLength());
		sll.printSinglyLinkedList();
	}

}
