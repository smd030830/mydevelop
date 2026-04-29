package com.mjc813.swimpool.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CommonResponseDto<T> {
	private CommonResponseCode code;
	private String message;
	private T result;
}
