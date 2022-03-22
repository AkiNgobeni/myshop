package com.myshop.myshop.service.impl;

import com.myshop.myshop.model.Customer;
import com.myshop.myshop.model.Role;
import com.myshop.myshop.repository.CustomerRepository;
import com.myshop.myshop.service.CustomerService;
import com.myshop.myshop.web.dto.CustomerRegistrationDto;
import org.springframework.stereotype.Service;

import java.util.Arrays;
/**
 * @author Nyiko Ngobeni
 * @since 03-2022
 */

@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        super();
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer save(CustomerRegistrationDto registrationDto) {
        Customer customer =  new Customer(registrationDto.getFirstName(),
                registrationDto.getFirstName(),registrationDto.getEmail(),
                registrationDto.getPassword(), Arrays.asList(new Role("ROLE_CUSTOMER")));

        return customerRepository.save(customer);
    }
}
