package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	
	Integer size=0;
	

	@Override
	public boolean add(T item) {
		if (size < items.length) {
			items[size] = item;
			size++;
			return true;
		} else {
			Object[] items2=new Object[items.length*2];
			System.arraycopy(items, 0, items2, 0, items.length);
			items=items2;
			items[size] = item;
			size++;
			return true;
		}
		
	}

	@Override
	public int getSize() {
		
		return size;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		if (index < size) {
			return (T) items[index];
		}else {
		return null;
	}
	}
	
}
