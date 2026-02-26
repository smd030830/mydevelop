package com.mjc813.generic;

public class GameRentCompany<TT extends GameMachine> implements Rentable<TT> {
	private TT gameMachine;

	@Override
	public TT rent(GameMachineType type) {
		return null;
	}

	public <GM> RentGameMachine<GM> rent2(GM type) {
		// 제네릭 메소드, 리턴데이터형이 제네릭클래스/제네릭인터페이스 이다.
		return new RentGameMachine<GM>(type);
	}
}
