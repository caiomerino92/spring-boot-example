package com.springboot.example.model.entity;

import org.dom4j.tree.AbstractEntity;

import javax.persistence.*;
import java.util.Objects;

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

    public Long getId() {
        return id;
    }

    public RealStateFund setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTicketName() {
        return ticketName;
    }

    public RealStateFund setTicketName(String ticketName) {
        this.ticketName = ticketName;
        return this;
    }

    public String getTargetAudience() {
        return targetAudience;
    }

    public RealStateFund setTargetAudience(String targetAudience) {
        this.targetAudience = targetAudience;
        return this;
    }

    public String getTicketType() {
        return ticketType;
    }

    public RealStateFund setTicketType(String ticketType) {
        this.ticketType = ticketType;
        return this;
    }

    public String getAdministrator() {
        return administrator;
    }

    public RealStateFund setAdministrator(String administrator) {
        this.administrator = administrator;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public RealStateFund setPrice(Double price) {
        this.price = price;
        return this;
    }

    public Double getLastDividendYield() {
        return lastDividendYield;
    }

    public RealStateFund setLastDividendYield(Double lastDividendYield) {
        this.lastDividendYield = lastDividendYield;
        return this;
    }

    public Double getAverageDividendYield() {
        return averageDividendYield;
    }

    public RealStateFund setAverageDividendYield(Double averageDividendYield) {
        this.averageDividendYield = averageDividendYield;
        return this;
    }

    public Double getDailyLiquidity() {
        return dailyLiquidity;
    }

    public RealStateFund setDailyLiquidity(Double dailyLiquidity) {
        this.dailyLiquidity = dailyLiquidity;
        return this;
    }

    public Double getPriceByEquityValue() {
        return priceByEquityValue;
    }

    public RealStateFund setPriceByEquityValue(Double priceByEquityValue) {
        this.priceByEquityValue = priceByEquityValue;
        return this;
    }

    public Integer getShareholders() {
        return shareholders;
    }

    public RealStateFund setShareholders(Integer shareholders) {
        this.shareholders = shareholders;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RealStateFund that = (RealStateFund) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(ticketName, that.ticketName) &&
                Objects.equals(targetAudience, that.targetAudience) &&
                Objects.equals(ticketType, that.ticketType) &&
                Objects.equals(administrator, that.administrator) &&
                Objects.equals(price, that.price) &&
                Objects.equals(lastDividendYield, that.lastDividendYield) &&
                Objects.equals(averageDividendYield, that.averageDividendYield) &&
                Objects.equals(dailyLiquidity, that.dailyLiquidity) &&
                Objects.equals(priceByEquityValue, that.priceByEquityValue) &&
                Objects.equals(shareholders, that.shareholders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ticketName, targetAudience, ticketType, administrator, price, lastDividendYield, averageDividendYield, dailyLiquidity, priceByEquityValue, shareholders);
    }

    @Override
    public String toString() {
        return "RealStateFund{" +
                "id=" + id +
                ", ticketName='" + ticketName + '\'' +
                ", targetAudience='" + targetAudience + '\'' +
                ", ticketType='" + ticketType + '\'' +
                ", administrator='" + administrator + '\'' +
                ", price=" + price +
                ", lastDividendYield=" + lastDividendYield +
                ", averageDividendYield=" + averageDividendYield +
                ", dailyLiquidity=" + dailyLiquidity +
                ", priceByEquityValue=" + priceByEquityValue +
                ", shareholders=" + shareholders +
                '}';
    }
}
