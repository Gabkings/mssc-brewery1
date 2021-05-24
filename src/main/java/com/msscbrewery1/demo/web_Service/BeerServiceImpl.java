package com.msscbrewery1.demo.web_Service;

import com.msscbrewery1.demo.web_model.BearDto;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class BeerServiceImpl implements BeerService{
    @Override
    public BearDto getBeerById(UUID beerId) {
        return BearDto.builder()
                .id(UUID.randomUUID())
                .beerName("Tasker")
                .beerStyle("Refreshing Mind")
                .upc(123L)
                .build();
    }

    @Override
    public BearDto createNewBeer(BearDto bearDto) {
        return BearDto
                .builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public BearDto updateBearDetails(UUID beerId, BearDto bearDto) {
        return BearDto.builder().build();
    }
}
