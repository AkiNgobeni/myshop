package com.myshop.myshop.service;

import com.myshop.myshop.model.Product;
import com.myshop.myshop.web.dto.ProductDto;

import java.util.List;
import java.util.Optional;

/**
 * @author Nyiko Ngobeni
 * @since 03-2022
 */

public interface ProductService {
    Product save(ProductDto productDto);

    Optional<Product> findById(Long id) throws Exception;

    List<Product> findAll() throws Exception;

}
