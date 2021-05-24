package com.msscbrewery1.demo.web_Service;

import com.msscbrewery1.demo.web_model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class CustomerServiceImpl implements CustomerService{
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Gabriel Gitonga")
                .build();
    }
}
