package com.mobest1an.tinkoffservice.dto;

import lombok.AllArgsConstructor;
import lombok.Value;

import java.util.List;

@AllArgsConstructor
@Value
public class StocksPricesDto {
    List<StockPrice> prices;
}
