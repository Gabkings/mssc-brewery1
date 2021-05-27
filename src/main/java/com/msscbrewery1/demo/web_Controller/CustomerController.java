package com.msscbrewery1.demo.web_Controller;

import com.msscbrewery1.demo.web_Service.CustomerService;
import com.msscbrewery1.demo.web_model.BearDto;
import com.msscbrewery1.demo.web_model.CustomerDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/customer/")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    ResponseEntity handlePost(@RequestBody CustomerDto customerDto) {
        CustomerDto savedDto = customerService.createNewCustomer(customerDto);
        HttpHeaders headers = new HttpHeaders();

        headers.add("Location", "/api/vi/beer/" + savedDto.getId());

        return new ResponseEntity(headers, HttpStatus.CREATED);
    }

    @PutMapping("{customerId}")
    ResponseEntity handlePut(@PathVariable("customerId") UUID customerId, @RequestBody CustomerDto customerDto) {

        CustomerDto saveDto = customerService.updateCustomerDetails(customerDto, customerDto);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @GetMapping("{customerId}")
    ResponseEntity<CustomerDto> getCustomerById(@PathVariable("customerId") UUID customerId) {
        return new ResponseEntity<>(customerService.getCustomerById(customerId), HttpStatus.OK);
    }

    @DeleteMapping("{customerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCustomer(@PathVariable("customerId") UUID customerId){
        customerService.deleteCustomer(customerId);
    }


}
