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
}
