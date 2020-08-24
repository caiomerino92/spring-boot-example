package com.springboot.example.entity;

import org.dom4j.tree.AbstractEntity;

import javax.persistence.*;

@Entity
@Table(name = "T_REAL_STATE_FUND")
public class RealStateFund extends AbstractEntity {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;

    @Column(name = "TICKET_NAME")
    private String ticketName;

    @Column(name = "TARGET_AUDIENCE")
    private String targetAudience;

    @Column(name = "TICKET_TYPE")
    private String ticketType;

    @Column(name = "ADMINISTRATOR")
    private String administrator;

    @Column(name = "PRICE")
    private Double price;

    @Column(name = "LAST_DIVIDEND_YIELD")
    private Double lastDividendYield;

    @Column(name = "AVERAGE_DIVIDEND_YIELD")
    private Double averageDividendYield;

    @Column(name = "DAILY_LIQUIDITY")
    private Double dailyLiquidity;

    @Column(name = "PRICE_BY_EQUITY_VALUE")
    private Double priceByEquityValue;

    @Column(name = "SHAREHOLDERS")
    private Integer shareholders;

}
