package com.mjc813.generic;

public interface Rentable<T> {
	T rent(GameMachineType type);
}
