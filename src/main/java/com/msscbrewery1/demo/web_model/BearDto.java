package com.msscbrewery1.demo.web_model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class BearDto {
    private UUID id;
    private String beerName;
    private String beerStyle;
    private Long upc;
}
