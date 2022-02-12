package com.mobest1an.tinkoffservice.dto;

import com.mobest1an.tinkoffservice.model.Stock;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StocksDto {

    private List<Stock> stocks;
}
