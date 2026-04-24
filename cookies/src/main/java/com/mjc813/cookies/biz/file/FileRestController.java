package com.mjc813.cookies.biz.file;

import com.mjc813.cookies.models.common.ApiResponse;
import com.mjc813.cookies.models.common.ResponseCode;
import com.mjc813.cookies.models.cookie.CookieDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/v1/file")
public class FileRestController {

	@PostMapping("/upload")
	public ResponseEntity<ApiResponse<String>> upload(@RequestPart CookieDto cookieDto
		, @RequestPart List<MultipartFile> files) {
		log.info("upload cookie dto {}", cookieDto);
		files.forEach(file-> {log.info("upload cookie files {}", file);});
		return ResponseEntity.status(201).body(
				ApiResponse.make(ResponseCode.insert_ok, "ok", "success")
		);
	}
}
