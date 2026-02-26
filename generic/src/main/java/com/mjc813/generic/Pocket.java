package com.mjc813.generic;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Pocket<MT extends Number> {
	private String name;
	private Currency currency;
	private MT money;
}
