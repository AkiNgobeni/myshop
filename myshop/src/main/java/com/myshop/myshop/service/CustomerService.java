package com.myshop.myshop.service;

import com.myshop.myshop.model.Customer;
import com.myshop.myshop.web.dto.CustomerRegistrationDto;

/**
 * @author Nyiko Ngobeni
 * @since 03-2022
 */

public interface CustomerService {
    Customer save(CustomerRegistrationDto registrationDto);
}
