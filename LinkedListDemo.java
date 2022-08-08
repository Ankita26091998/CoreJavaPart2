package com.collectionframework;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("Ankita");
		list.add(0, "Vaishnavi");
		list.add("Shivani");
		list.add(2, "Shreya");
		System.out.println("List of elements: " + list);
		System.out.println("Length of list: " + list.size());
		System.out.println(list.contains("Ankita"));
		System.out.println(list.isEmpty());
		System.out.println("first element: " + list.peek());
		System.out.println("first element: " + list.poll());

		System.out.println("Set value into list: " + list.set(2, "Nikita"));
		System.out.println("List of elements: " + list);
		System.out.println("Remove element from list: " + list.remove(0));
		System.out.println("List of elements: " + list);
	}

}
