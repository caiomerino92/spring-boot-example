package com.springboot.example.model.request;

public class RealStateFundRequest {

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

    public RealStateFundRequest setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTicketName() {
        return ticketName;
    }

    public RealStateFundRequest setTicketName(String ticketName) {
        this.ticketName = ticketName;
        return this;
    }

    public String getTargetAudience() {
        return targetAudience;
    }

    public RealStateFundRequest setTargetAudience(String targetAudience) {
        this.targetAudience = targetAudience;
        return this;
    }

    public String getTicketType() {
        return ticketType;
    }

    public RealStateFundRequest setTicketType(String ticketType) {
        this.ticketType = ticketType;
        return this;
    }

    public String getAdministrator() {
        return administrator;
    }

    public RealStateFundRequest setAdministrator(String administrator) {
        this.administrator = administrator;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public RealStateFundRequest setPrice(Double price) {
        this.price = price;
        return this;
    }

    public Double getLastDividendYield() {
        return lastDividendYield;
    }

    public RealStateFundRequest setLastDividendYield(Double lastDividendYield) {
        this.lastDividendYield = lastDividendYield;
        return this;
    }

    public Double getAverageDividendYield() {
        return averageDividendYield;
    }

    public RealStateFundRequest setAverageDividendYield(Double averageDividendYield) {
        this.averageDividendYield = averageDividendYield;
        return this;
    }

    public Double getDailyLiquidity() {
        return dailyLiquidity;
    }

    public RealStateFundRequest setDailyLiquidity(Double dailyLiquidity) {
        this.dailyLiquidity = dailyLiquidity;
        return this;
    }

    public Double getPriceByEquityValue() {
        return priceByEquityValue;
    }

    public RealStateFundRequest setPriceByEquityValue(Double priceByEquityValue) {
        this.priceByEquityValue = priceByEquityValue;
        return this;
    }

    public Integer getShareholders() {
        return shareholders;
    }

    public RealStateFundRequest setShareholders(Integer shareholders) {
        this.shareholders = shareholders;
        return this;
    }
}
