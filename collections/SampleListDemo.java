package com.abhishek.collections;

import java.util.Arrays;

class SampleList<E> {

	private int size = 0;
	private final static int DEFAULT_SIZE = 10;
	private Object[] elements;

	public SampleList() {
		elements = new Object[DEFAULT_SIZE];
	}

	public void add(E e) {
		if (size == elements.length) {
			ensureCapacity();
		}
		elements[size++] = e;
	}

	private void ensureCapacity() {
		int newSize = elements.length * 2;
		elements = Arrays.copyOf(elements, newSize);
	}

	public E get(int index) {
		if (index >= size || index < 0) {
			throw new IndexOutOfBoundsException("Index is : " + index + " Size is : " + size);
		}
		return (E) elements[index];
	}

}

public class SampleListDemo {

	public static void main(String args[]) {
		SampleList<String> sample = new SampleList<String>();
		sample.add("Hello");
		System.out.println(sample);
	}
}
