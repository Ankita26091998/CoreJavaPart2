package com.collectionframework;

import java.util.Stack;

public class StackOperation {

	public static void main(String[] args) {
		Stack<Integer> li = new Stack<>();
		System.out.println(li.isEmpty());
		li.push(12);
		li.push(30);
		li.add(90);
		li.add(78);
		li.push(90);
		li.add(98);
		System.out.println("list is: " + li);
		System.out.println(li.pop());
		System.out.println(li.pop());
		li.push(23);
		System.out.println("list is: " + li);
		System.out.println(li.pop());
		System.out.println("top of stack: " + li.peek());
		System.out.println("capacity of stack: " + li.capacity());
		System.out.println(li.indexOf(12));
		System.out.println("list is: " + li);

		System.out.println("list is: " + li.search(30));

	}

}
