package com.mobest1an.tinkoffservice.model;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class Stock {

    String ticker;
    String figi;
    String name;
    String type;
    Currency currency;
    String source;
}
