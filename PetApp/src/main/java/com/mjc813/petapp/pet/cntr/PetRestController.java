package com.mjc813.petapp.pet.cntr;

import com.mjc813.petapp.pet.PetResponseDto;
import com.mjc813.petapp.pet.dto.PetDto;
import com.mjc813.petapp.pet.dto.PetEntity;
import com.mjc813.petapp.pet.svc.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pet")
public class PetRestController {
	@Autowired
	public PetService petService;


	/**
	 * Insert 요청 처리
	 *
	 * POST /api/pet HTTP/1.1
	 * Host: localhost:8084
	 * Content-Type: application/json
	 * Content-Length: 140
	 *
	 * {
	 * 	"id": null
	 * 	, "name": "멍멍이9"
	 * 	, "species": "강아지9"
	 * 	, "breedy": "말티즈"
	 * 	, "gender": "수"
	 * 	, "birth": "2026-01-01"
	 * 	, "imgFile": ""
	 * }
	 *
	 * curl --location 'http://localhost:8084/api/pet' \
	 * --header 'Content-Type: application/json' \
	 * --data '{
	 * 	"id": null
	 * 	, "name": "멍멍이9"
	 * 	, "species": "강아지9"
	 * 	, "breedy": "말티즈"
	 * 	, "gender": "수"
	 * 	, "birth": "2026-01-01"
	 * 	, "imgFile": ""
	 * }'
	 *
	 * @param petDto
	 * @return
	 */
	@PostMapping
	public ResponseEntity<PetResponseDto> insertPet(@RequestBody PetDto petDto) {
		try {
			PetDto result = this.petService.insert(petDto);
			return ResponseEntity.ok().body(new PetResponseDto(0, "SUCCESS", result));
		} catch (Exception ex) {
			return ResponseEntity.status(500).body(new PetResponseDto(-999, "ERROR", null));
		}
	}

	@PatchMapping
	public ResponseEntity<PetResponseDto> updatePet(@RequestBody PetDto petDto) {
		try {
			PetDto result = this.petService.update(petDto);
			return ResponseEntity.ok().body(new PetResponseDto(0, "SUCCESS", result));
		} catch (Exception e) {
			return ResponseEntity.status(500).body(new PetResponseDto(-999, "ERROR", null));
		}
	}

	@DeleteMapping
	public ResponseEntity<PetResponseDto> deletePet(@RequestParam Integer id) {
		try {
			PetDto result = this.petService.deleteById(id);
			return ResponseEntity.ok().body(new PetResponseDto(0, "SUCCESS", result));
		} catch (Exception e) {
			return ResponseEntity.status(500).body(new PetResponseDto(-999, "ERROR", null));
		}
	}
}
