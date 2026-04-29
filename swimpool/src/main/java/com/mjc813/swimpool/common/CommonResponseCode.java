package com.mjc813.swimpool.common;

public enum CommonResponseCode {
	OK("success"),
	FAILED("request failed"),
	SERVER_ERROR("server process error");

	private final String message;

	CommonResponseCode(String msg) {
		this.message = msg;
	}

	public String getMessage() {
		return this.message;
	}
}
