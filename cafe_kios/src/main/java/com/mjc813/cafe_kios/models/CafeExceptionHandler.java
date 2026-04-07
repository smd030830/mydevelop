package com.mjc813.cafe_kios.models;

import com.mjc813.cafe_kios.ResponseCode;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CafeExceptionHandler {

	@ExceptionHandler(Throwable.class)
	public ResponseEntity<ApiResponse<String>> ThrowableHandler(Throwable ex) {
		ApiResponse<String> apiResponse = ApiResponse.<String>builder()
				.code(ResponseCode.ServerError)
				.message(ex.getMessage())
				.responseData(ex.toString())
				.build();
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(apiResponse);
	}
}
