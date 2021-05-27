package com.msscbrewery1.demo.web_Service;

import com.msscbrewery1.demo.web_model.BearDto;
import com.msscbrewery1.demo.web_model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);

    CustomerDto createNewCustomer(CustomerDto customerDto);

    CustomerDto updateCustomerDetails(CustomerDto customerDto, CustomerDto customerDto1);

    void deleteCustomer(UUID customerId);
}
