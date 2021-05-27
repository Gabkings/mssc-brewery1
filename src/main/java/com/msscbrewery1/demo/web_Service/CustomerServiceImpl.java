package com.msscbrewery1.demo.web_Service;

import com.msscbrewery1.demo.web_model.BearDto;
import com.msscbrewery1.demo.web_model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Gabriel Gitonga")
                .build();
    }

    @Override
    public CustomerDto createNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public CustomerDto updateCustomerDetails(CustomerDto customerDto, CustomerDto customerDto1) {
        return CustomerDto.builder().build();
    }

    @Override
    public void deleteCustomer(UUID customerId) {
    }
}
