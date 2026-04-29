package com.mjc813.swimpool.common;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CommonExceptionHandler {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<CommonResponseDto<String>> exceptionHandler(Exception ex) {
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(
			new CommonResponseDto<String>(CommonResponseCode.SERVER_ERROR
					, CommonResponseCode.SERVER_ERROR.getMessage()
					, ex.getMessage())
		);
	}
}
