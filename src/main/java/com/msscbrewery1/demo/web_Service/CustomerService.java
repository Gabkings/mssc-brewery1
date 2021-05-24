package com.msscbrewery1.demo.web_Service;

import com.msscbrewery1.demo.web_model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}
