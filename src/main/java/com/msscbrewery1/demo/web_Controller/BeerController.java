package com.msscbrewery1.demo.web_Controller;

import com.msscbrewery1.demo.web_Service.BeerService;
import com.msscbrewery1.demo.web_model.BearDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer/")
public class BeerController {

    private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping("{beerId}")
    ResponseEntity<BearDto> getBeerById(@PathVariable("beerId") UUID beerId) {
        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }


    @PostMapping
    ResponseEntity handlePost(@RequestBody BearDto bearDto) {
        BearDto savedDto = beerService.createNewBeer(bearDto);
        HttpHeaders headers = new HttpHeaders();

        headers.add("Location", "/api/vi/beer/" + savedDto.getId());

        return new ResponseEntity(headers, HttpStatus.CREATED);
    }

    @PutMapping("{beerId}")
    ResponseEntity handlePut(@PathVariable("beerId") UUID beerId, @RequestBody BearDto bearDto) {
        BearDto saveDto = beerService.updateBearDetails(beerId, bearDto);
        return new ResponseEntity( HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("{beerId}")
    ResponseEntity handleDelete(@PathVariable("beerId") UUID beerId){
        BearDto delete = beerService.deleteBeer(beerId);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
