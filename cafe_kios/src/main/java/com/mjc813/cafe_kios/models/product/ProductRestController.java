package com.mjc813.cafe_kios.models.product;

import com.mjc813.cafe_kios.ResponseCode;
import com.mjc813.cafe_kios.models.ApiResponse;
import com.mjc813.cafe_kios.models.category.CategoryDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/V1/product")
public class ProductRestController {

	private final ProductService productService;

	@PostMapping
	public ResponseEntity<ApiResponse<ProductDto>> update(@RequestBody ProductDto newDto) {
		ProductDto result = this.productService.insert(newDto);
		ApiResponse<ProductDto> apiResponse = ApiResponse.<ProductDto>builder()
				.code(ResponseCode.Success)
				.message("OK")
				.responseData(result).build();
		return ResponseEntity.status(201).body(apiResponse);
	}
}
