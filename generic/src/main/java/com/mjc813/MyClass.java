package com.mjc813;

import lombok.Getter;

import java.util.ArrayList;

@Getter
public class MyClass<TTT> {   // 멤버변수가 TTT 라는 데이터형을 사용한다 라고 정의한다. Generic 은 대문자 단어 면 모두 가능
	private ArrayList<TTT> students;  // 멤버변수가 TTT 라는 데이터형을 가질 수 있다.

	public MyClass() {
		this.students = new ArrayList<>();
	}

	public void add(TTT item) { // TTT 데이터형을 추가할 수 있다.
		this.students.add(item);
	}

	public TTT get(int index) { // TTT 데이터형을 가져올 수 있다.
		if ( index < this.students.size() ) {
			return this.students.get(index);
		}
		throw new ArrayIndexOutOfBoundsException(String.format("%d 값은 배열 원소로 접근 불가", index));
	}

	public void printAll() {
		for ( TTT item : this.students ) {  // TTT 데이터형 원소들을 출력한다.
			System.out.printf("%s\n", item);
		}
		System.out.println();
	}
}
