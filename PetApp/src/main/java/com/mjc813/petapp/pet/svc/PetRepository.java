package com.mjc813.petapp.pet.svc;

import com.mjc813.petapp.pet.dto.PetEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends JpaRepository<PetEntity, Integer> {
}
