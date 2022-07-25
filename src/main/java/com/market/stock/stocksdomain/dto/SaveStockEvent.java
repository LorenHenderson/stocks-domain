package com.market.stock.stocksdomain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SaveStockEvent {

    private String id;
    private String companyCode;
    private String command;
    private EventStock stock;
    private LocalDateTime eventTimestamp;
}
