package com.example.ecommerce.dao;

import com.example.ecommerce.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product, Long> {

    Page<Product> findByCategoryId(@Param("id") Long id, Pageable pageable);

    //findby ile başladığı için bu bir sorgu yöntemidir ByCategoryId ile eşleştir
    // SELECT*FROM product where category_id ile aynı işi yapar

    Page<Product> findByNameContaining(@Param("name") String name, Pageable pageable);

}
