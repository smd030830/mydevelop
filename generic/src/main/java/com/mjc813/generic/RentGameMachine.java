package com.mjc813.generic;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class RentGameMachine<T> {
	private T gameMachine;
}
