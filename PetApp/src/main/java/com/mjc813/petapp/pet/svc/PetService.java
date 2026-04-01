package com.mjc813.petapp.pet.svc;

import com.mjc813.petapp.pet.dto.PetDto;
import com.mjc813.petapp.pet.dto.PetEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PetService {
	@Autowired
	private PetRepository petRepository;

	public PetDto insert(PetDto petDto) {
		PetEntity petEntity = new PetEntity();
		petEntity.setId(null);
		petEntity.setName(petDto.getName());
		petEntity.setBirth(petDto.getBirth());
		petEntity.setBreed(petDto.getBreed());
		petEntity.setGender(petDto.getGender());
		petEntity.setImgFile(petDto.getImgFile());
		petEntity.setSpecies(petDto.getSpecies());

		this.petRepository.save(petEntity);

		petDto.setId(petEntity.getId());
		return petDto;
	}

	public PetDto update(PetDto petDto) {
//		PetEntity petEntity = new PetEntity();
		PetEntity petEntity = this.petRepository.findById(petDto.getId()).orElseThrow();
//		1. findById(id) jpa 메소드로 id 의 행 객체를 가져온다.
//		petEntity.setId(petDto.getId());
		if(petDto.getName() != null) {
			petEntity.setName(petDto.getName());
		}
		if(petDto.getBirth() != null) {
			petEntity.setBirth(petDto.getBirth());
		}
		if(petDto.getBreed() != null) {
			petEntity.setBreed(petDto.getBreed());
		}
		if(petDto.getGender() != null) {
			petEntity.setGender(petDto.getGender());
		}
		if(petDto.getImgFile() != null) {
			petEntity.setImgFile(petDto.getImgFile());
		}
		if(petDto.getSpecies() != null) {
			petEntity.setSpecies(petDto.getSpecies());
		}
		// 2. 가져온 객체에서 원하는 컬럼의 값을 수정한다. 다만 id를 수정하면 절대 안된다.

		this.petRepository.save(petEntity);
		// 3. save 를 한다.

		PetDto result = new PetDto();
		result.setId(petEntity.getId());
		result.setName(petEntity.getName());
		result.setBirth(petEntity.getBirth());
		result.setBreed(petEntity.getBreed());
		result.setGender(petEntity.getGender());
		result.setImgFile(petEntity.getImgFile());
		result.setSpecies(petEntity.getSpecies());
		return result;
	}
}
