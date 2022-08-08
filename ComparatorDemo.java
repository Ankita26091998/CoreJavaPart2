package com.collectionframework;

//class Phone {
//	String brand;
//	long model;
//	long price;
//
//	public Phone(String brand, long model, long price) {
//		super();
//		this.brand = brand;
//		this.model = model;
//		this.price = price;
//	}
//
//}
//
//class SortByBrand implements Comparator<Phone> {
//
//	@Override
//	public int compare(Phone p1, Phone p2) {
//		return p1.brand.compareTo(p2.brand);
//	}
//}
//
//class SortByPrice implements Comparator<Phone> {
//
//	@Override
//	public int compare(Phone p1, Phone p2) {
//		return (int) (p1.price - p2.price);
//	}
//}
//
//public class ComparatorDemo {
//
//	public static void main(String[] args) {
//		SortByBrand obj1 = new SortByBrand();
//		SortByPrice obj2 = new SortByPrice();
//		Phone p1 = new Phone("Apple", 10, 60000);
//		Phone p2 = new Phone("Mi", 8, 20000);
//
//		System.out.println("sorting done by brand: " + obj1.compare(p1, p2));
//		System.out.println("sorting done by price: " + obj2.compare(p1, p2));
//
//	}
//
//}
