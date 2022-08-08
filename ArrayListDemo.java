package com.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Ankita");
		list.add(0, "Vaishnavi");
		list.add(null);
		list.add("Shivani");
		list.add(2, "Shreya");
		System.out.println("List of elements: " + list);
		System.out.println("Length of list: " + list.size());
		System.out.println("Get value from list: " + list.get(0));
		System.out.println("Set value into list: " + list.set(2, "Nikita"));
		System.out.println("List of elements: " + list);
		System.out.println("Remove element from list: " + list.remove(0));
		System.out.println("List of elements: " + list);

		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		String arr[] = list.toArray(new String[0]);
		System.out.println("Array of elements: " + list);

		for (String s : arr) {
			System.out.println(s);
		}
	}

}
