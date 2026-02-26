package com.mjc813.generic;

import com.mjc813.packaging.Human;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class UsePocket {
	public void doSomething() {
		Pocket<Double> lshPocket = new Pocket<Double>("이승협", Currency.EURO, 0.0);
		Pocket<Integer> lcsPocket = new Pocket<>("이충섭", Currency.WON, 1000);
		Pocket<BigDecimal> cwcPocket = new Pocket<>("최원철", Currency.DOLLAR, new BigDecimal(0));
	}
	public void doRental() {
		GameRentCompany<NintendoV1> gameRentCompanyNintendo = new GameRentCompany<>();
		RentGameMachine<NintendoV1> v1 = gameRentCompanyNintendo.rent2(new NintendoV1());
		System.out.println("v1 = " + v1);

		RentGameMachine<NintendoV2> rentGameMachine2 = gameRentCompanyNintendo.rent2(new NintendoV2());
		System.out.println("v2 = " + rentGameMachine2);

		// List<E> list = new ArrayList<>(); 실행하는 곳에서는 제네릭을 선언하는게 아니다.
	}
}
