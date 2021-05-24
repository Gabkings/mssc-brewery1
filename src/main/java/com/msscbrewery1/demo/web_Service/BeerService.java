package com.msscbrewery1.demo.web_Service;

import com.msscbrewery1.demo.web_model.BearDto;

import java.util.UUID;

public interface BeerService {

    BearDto getBeerById(UUID beerId);
}
