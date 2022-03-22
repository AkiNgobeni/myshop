package com.myshop.myshop.service.impl;

import com.myshop.myshop.model.Product;
import com.myshop.myshop.repository.ProductRepository;
import com.myshop.myshop.service.ProductService;
import com.myshop.myshop.web.dto.ProductDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Nyiko Ngobeni
 * @since 03-2022
 */

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product save(ProductDto productDto) {
        Product product = new Product(productDto.getName(),
                productDto.getDescription(),
                productDto.getPrice());

        return productRepository.save(product);
    }

    @Override
    public Optional<Product> findById(Long id) throws Exception {
        return productRepository.findById(id);
    }



    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }
}
