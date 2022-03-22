package com.myshop.myshop.web;

import com.myshop.myshop.service.CustomerService;
import com.myshop.myshop.web.dto.CustomerRegistrationDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Nyiko Ngobeni
 * @since 03-2022
 */

@Controller
@RequestMapping("/registration")
public class CustomerRegistrationContoller {

    private CustomerService customerService;

    public CustomerRegistrationContoller(CustomerService customerService) {
        super();
        this.customerService = customerService;
    }

    @ModelAttribute("customer")
    public CustomerRegistrationDto customerRegistrationDto(){
        return new CustomerRegistrationDto();
    }

    @GetMapping
    public String showRegistrationForm(){
        return "registration";
    }

    @PostMapping
    public String registerCustomerAccount(@ModelAttribute("customer") CustomerRegistrationDto customerRegistrationDto) {

        customerService.save(customerRegistrationDto);
        return "redirect:/registration?success";
    }
}
