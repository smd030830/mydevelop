package com.mjc813;

import com.mjc813.crud.CrudClass;
import com.mjc813.crud.Grade;
import com.mjc813.crud.NintendoGame;
import com.mjc813.generic.UsePocket;
import com.mjc813.packaging.Human;
import com.mjc813.packaging.MainPackaging;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
	public static void main(String[] args) {
		MySchool mjc813 = new MySchool();

		mjc813.getElementClass().add( new MyElementStudent("병아리1", 8, "김병아리"));
		mjc813.getElementClass().add( new MyElementStudent("병아리2", 9, "이병아리"));

		mjc813.getMiddleClass().add(new MyMiddleStudent("김사랑", 15, "국어1야간반"));
		mjc813.getMiddleClass().add(new MyMiddleStudent("이말자", 15, "수학1야간반"));

		mjc813.getStringClass().add("홍길동");
		mjc813.getStringClass().add("이순신");

		mjc813.getElementClass().printAll();
		mjc813.getMiddleClass().printAll();
		mjc813.getStringClass().printAll();

		MainPackaging mp = new MainPackaging();
		mp.doSome();

		NintendoGame ng = new NintendoGame("포켓몬스터", Grade.ALL, 60000);
		System.out.println(ng);

		UsePocket up = new UsePocket();
		up.doRental();

		// List<E> list = new ArrayList<>(); // 실행하는 곳에서는 제네릭을 선언하는게 아니므로 실제 데이터형을 사용해야 한다.
	}

	public static void printList(List<?> list) { // 어떤 List든 수용 가능
		for (Object item : list) {
			System.out.println(item);
		}
	}
}