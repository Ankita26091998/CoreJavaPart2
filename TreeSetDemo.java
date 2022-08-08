package com.collectionframework;

import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Neha");
		ts.add("Mrunal");
		ts.add("Ankita");
		ts.add("Sayali");
		// ts.add(null); //will give nullpointerexception
		System.out.println("Treeset data is: " + ts);
		ArrayList<String> list = new ArrayList<>(ts);
		System.out.println("Arraylist of names: " + list);

	}

}
