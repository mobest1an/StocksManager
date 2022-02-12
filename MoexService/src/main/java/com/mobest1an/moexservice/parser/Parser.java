package com.mobest1an.moexservice.parser;

import com.mobest1an.moexservice.dto.BondDto;

import java.util.List;

public interface Parser {
    List<BondDto> parse(String ratesAsString);
}
