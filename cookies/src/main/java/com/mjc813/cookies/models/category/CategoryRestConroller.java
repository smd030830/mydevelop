package com.mjc813.cookies.models.category;

import com.mjc813.cookies.models.common.ApiResponse;
import com.mjc813.cookies.models.common.ResponseCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/category")
public class CategoryRestConroller {
	@Autowired
	private CategoryService categoryService;

	@PostMapping
	public ResponseEntity<ApiResponse<CategoryDto>> insert(@RequestBody CategoryDto insertDto) {
		CategoryDto result = this.categoryService.insert(insertDto);
		return ResponseEntity.status(201).body(
//				ApiResponse.<CategoryDto>builder()
//						.responseCode(ResponseCode.insert_ok)
//						.message("ok")
//						.responseData(result)
//						.build()
				ApiResponse.make(ResponseCode.insert_ok, "ok", result)
		);
	}

	@PatchMapping
	public ResponseEntity<ApiResponse<CategoryDto>> update(@RequestBody CategoryDto insertDto) {
		CategoryDto result = this.categoryService.update(insertDto);
		return ResponseEntity.status(200).body(
				ApiResponse.make(ResponseCode.update_ok, "ok", result)
		);
	}

	@GetMapping("/{id}")
	public ResponseEntity<ApiResponse<CategoryDto>> findById(@PathVariable Long id) {
		CategoryDto result = this.categoryService.findById(id);
		return ResponseEntity.status(200).body(
				ApiResponse.make(ResponseCode.select_ok, "ok", result)
		);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<ApiResponse<CategoryDto>> deleteById(@PathVariable Long id) {
		CategoryDto result = this.categoryService.deleteById(id);
		return ResponseEntity.status(200).body(
				ApiResponse.make(ResponseCode.delete_ok, "ok", result)
		);
	}

	@GetMapping("/searchname")
	public ResponseEntity<ApiResponse<Slice<CategoryDto>>> searchByName(@RequestParam String name
			, @PageableDefault(size=10, page=0, sort="id", direction= Sort.Direction.DESC) Pageable pageable) {
		Slice<CategoryDto> result = this.categoryService.findByNameContains(name, pageable);
		return ResponseEntity.status(200).body(
				ApiResponse.make(ResponseCode.select_ok, "ok", result)
		);
	}
}
