package com.mjc813.crud;

import java.util.LinkedList;
import java.util.List;

public class CrudClass<A> implements CRUD<A>{
	private List<A> list = new LinkedList<>();

	@Override
	public void add(A item) {
		this.list.add(item);
	}

	@Override
	public int size() {
		return this.list.size();
	}

	@Override
	public A set(int index, A item) {
		return this.list.set(index, item);
	}

	@Override
	public A remove(int index) {
		return null;
	}

	@Override
	public A get(int index) {
		return this.list.get(index);
	}

	@Override
	public String getJson(int index) {
		return "";
	}

	@Override
	public String getJsonAllItems() {
		return "";
	}

	public void testA( CRUD<? extends NintendoGame> crudObj ) {

	}

	public void testMain() {
		this.testA(new CrudClass<Nintendo2Game>());
	}
}
