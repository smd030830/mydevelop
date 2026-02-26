package com.mjc813.crud;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@AllArgsConstructor
//@ToString
public class NintendoGame {
	private String name;
	private Grade grade;
	private Integer price;

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object ng) {
		return super.equals(ng);
	}

	@Override
	public String toString() {
		return String.format("%s(name=%s, grade=%s, price=%d, address=%x)"
				, this.getClass().getSimpleName()
				, this.getName(), this.getGrade(), this.getPrice(), super.hashCode());
	}
}
