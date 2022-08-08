package com.collectionframework;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<String> pr = new PriorityQueue<String>();
		pr.add("Neha");
		pr.add("Mrunal");
		pr.add("Ankita");
		pr.add("Sayali");
		System.out.println("PriorityQueue data is: " + pr);
		System.out.println("PriorityQueue hashCode is: " + pr.hashCode());
		System.out.println("PriorityQueue peek is: " + pr.peek());
		System.out.println("PriorityQueue data is: " + pr);
		System.out.println("PriorityQueue size is: " + pr.size());

	}

}
