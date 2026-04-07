package com.mjc813.cafe_kios.models.product;

import com.mjc813.cafe_kios.models.category.CategoryEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {
	private final ProductRepository repository;

	public ProductDto insert(ProductDto newDto) {
		ProductEntity newEntity = new ProductEntity();
		CategoryEntity category = CategoryEntity.builder().id(newDto.getCategoryId()).build();
		newEntity.copyMembers(newDto);
		newEntity.setId(null);
		newEntity.setCategoryObj(category);
		this.repository.save(newEntity);
		ProductDto result = new ProductDto();
		result.copyMembers(newEntity);
		return result;
	}
}
