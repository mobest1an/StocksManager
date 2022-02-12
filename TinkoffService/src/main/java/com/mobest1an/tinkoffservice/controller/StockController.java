package com.mobest1an.tinkoffservice.controller;

import com.mobest1an.tinkoffservice.dto.FigiesDto;
import com.mobest1an.tinkoffservice.dto.StocksDto;
import com.mobest1an.tinkoffservice.dto.StocksPricesDto;
import com.mobest1an.tinkoffservice.dto.TickersDto;
import com.mobest1an.tinkoffservice.model.Stock;
import com.mobest1an.tinkoffservice.service.StockService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class StockController {

    private final StockService stockService;

    @GetMapping("/stocks/{ticker}")
    public Stock getStock(@PathVariable String ticker) {
        return stockService.getStockByTicker(ticker);
    }

    @PostMapping("/stocks/getStocksByTickers")
    public StocksDto getStocksByTickers(@RequestBody TickersDto tickersDto) {
        return stockService.getStocksByTickers(tickersDto);
    }

    @PostMapping("/prices")
    public StocksPricesDto getPrices(@RequestBody FigiesDto figiesDto) {
        return stockService.getPrices(figiesDto);
    }
}
