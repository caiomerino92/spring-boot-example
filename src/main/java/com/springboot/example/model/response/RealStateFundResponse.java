package com.springboot.example.model.response;

public class RealStateFundResponse {

    private Long id;
    private String ticketName;
    private String targetAudience;
    private String ticketType;
    private String administrator;
    private Double price;
    private Double lastDividendYield;
    private Double averageDividendYield;
    private Double dailyLiquidity;
    private Double priceByEquityValue;
    private Integer shareholders;

    public Long getId() {
        return id;
    }

    public RealStateFundResponse setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTicketName() {
        return ticketName;
    }

    public RealStateFundResponse setTicketName(String ticketName) {
        this.ticketName = ticketName;
        return this;
    }

    public String getTargetAudience() {
        return targetAudience;
    }

    public RealStateFundResponse setTargetAudience(String targetAudience) {
        this.targetAudience = targetAudience;
        return this;
    }

    public String getTicketType() {
        return ticketType;
    }

    public RealStateFundResponse setTicketType(String ticketType) {
        this.ticketType = ticketType;
        return this;
    }

    public String getAdministrator() {
        return administrator;
    }

    public RealStateFundResponse setAdministrator(String administrator) {
        this.administrator = administrator;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public RealStateFundResponse setPrice(Double price) {
        this.price = price;
        return this;
    }

    public Double getLastDividendYield() {
        return lastDividendYield;
    }

    public RealStateFundResponse setLastDividendYield(Double lastDividendYield) {
        this.lastDividendYield = lastDividendYield;
        return this;
    }

    public Double getAverageDividendYield() {
        return averageDividendYield;
    }

    public RealStateFundResponse setAverageDividendYield(Double averageDividendYield) {
        this.averageDividendYield = averageDividendYield;
        return this;
    }

    public Double getDailyLiquidity() {
        return dailyLiquidity;
    }

    public RealStateFundResponse setDailyLiquidity(Double dailyLiquidity) {
        this.dailyLiquidity = dailyLiquidity;
        return this;
    }

    public Double getPriceByEquityValue() {
        return priceByEquityValue;
    }

    public RealStateFundResponse setPriceByEquityValue(Double priceByEquityValue) {
        this.priceByEquityValue = priceByEquityValue;
        return this;
    }

    public Integer getShareholders() {
        return shareholders;
    }

    public RealStateFundResponse setShareholders(Integer shareholders) {
        this.shareholders = shareholders;
        return this;
    }
}
