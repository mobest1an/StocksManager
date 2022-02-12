package com.mobest1an.moexservice.dto;

import com.mobest1an.moexservice.model.Stock;
import lombok.*;

import java.util.List;

@Value
public class StocksDto {

    List<Stock> stocks;
}
