package com.mjc813.packaging;

import java.util.ArrayList;

public class GenericPackaging<ITEM> {
	private final ITEM[] list = (ITEM[]) new Object[10];
//	private ArrayList<ITEM> list = new ArrayList<>();
	private int index = -1;

	public void add(ITEM obj) {
		if ( index >= this.list.length - 1 ) {
			return;
		}
		this.list[++index] = obj;
	}

	public ITEM remove() {
		if ( index < 0 ) {
			return null;
		}
		return this.list[index--];
	}
}
