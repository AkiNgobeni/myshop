package com.myshop.myshop.repository;

import com.myshop.myshop.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Nyiko Ngobeni
 * @since 03-2022
 */

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
