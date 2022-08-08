package com.collectionframework;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// 8 is capacity i.e maximum element we can enter, 0.50 is load factor ,after
		// that load factor it will increase capacit
//		HashSet<Integer> hashSet = new HashSet<>(8, (float) 0.50);
//
//		HashSet<Integer> hashSet1 = new HashSet<>();
//		hashSet1.add(1);
//		hashSet1.add(2);
//		hashSet.add(50);
//		hashSet.add(20);
//		hashSet.add(30);
//		hashSet.add(40);
//		hashSet.add(20);
//		hashSet.add(10);
//		hashSet.add(100);
//		hashSet.addAll(hashSet1);
//		hashSet.add(null);
//		System.out.println("Values inserted in set are: " + hashSet);
//		System.out.println(hashSet.isEmpty());
//		System.out.println(hashSet.remove(20));
//		System.out.println("Values inserted in set are: " + hashSet);
//		System.out.println(hashSet.size());
//		System.out.println(hashSet.contains(10));
//		System.out.println(hashSet.hashCode());
//		hashSet.clear();
//		System.out.println("Values inserted in set are: " + hashSet);
		HashSet<Integer> h1 = new HashSet<>();
		h1.add(1);
		h1.add(2);
		h1.add(3);
		h1.add(4);
		HashSet<Integer> h2 = new HashSet<>();
		h2.add(2);
		h2.add(3);
		h2.add(5);
		h1.addAll(h2);
		System.out.println(h1);
		System.out.println(h1.retainAll(h2));
		System.out.println(h2.removeAll(h2));
		System.out.println(h1);

	}

}
