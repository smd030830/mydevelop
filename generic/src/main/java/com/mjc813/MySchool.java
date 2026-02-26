package com.mjc813;

import lombok.Getter;

@Getter
public class MySchool {
	private MyClass<MyElementStudent> elementClass;
	private MyClass<MyMiddleStudent> middleClass;
	private MyClass<String> stringClass;

	public MySchool() {
		this.elementClass = new MyClass<>();
		this.middleClass = new MyClass<>();
		this.stringClass = new MyClass<>();
	}
}
