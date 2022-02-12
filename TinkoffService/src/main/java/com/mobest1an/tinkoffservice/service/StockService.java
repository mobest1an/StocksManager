package com.mobest1an.tinkoffservice.service;

import com.mobest1an.tinkoffservice.dto.FigiesDto;
import com.mobest1an.tinkoffservice.dto.StocksDto;
import com.mobest1an.tinkoffservice.dto.StocksPricesDto;
import com.mobest1an.tinkoffservice.dto.TickersDto;
import com.mobest1an.tinkoffservice.model.Stock;

public interface StockService {

    Stock getStockByTicker(String ticker);
    StocksDto getStocksByTickers(TickersDto tickers);

    StocksPricesDto getPrices(FigiesDto figiesDto);
}
