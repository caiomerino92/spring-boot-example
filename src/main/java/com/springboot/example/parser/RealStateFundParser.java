package com.springboot.example.parser;

import com.springboot.example.model.entity.RealStateFund;
import com.springboot.example.model.request.RealStateFundRequest;
import com.springboot.example.model.response.RealStateFundResponse;

public class RealStateFundParser {

    public static RealStateFund parse(RealStateFundRequest realStateFundRequest) {

        return new RealStateFund().setId(realStateFundRequest.getId())
                .setTicketName(realStateFundRequest.getTicketName())
                .setTargetAudience(realStateFundRequest.getTargetAudience())
                .setTicketType(realStateFundRequest.getTicketType())
                .setAdministrator(realStateFundRequest.getAdministrator())
                .setPrice(realStateFundRequest.getPrice())
                .setLastDividendYield(realStateFundRequest.getLastDividendYield())
                .setAverageDividendYield(realStateFundRequest.getAverageDividendYield())
                .setDailyLiquidity(realStateFundRequest.getDailyLiquidity())
                .setPriceByEquityValue(realStateFundRequest.getPriceByEquityValue())
                .setShareholders(realStateFundRequest.getShareholders());
    }

    public static RealStateFundResponse parse(RealStateFund realStateFund) {

        return new RealStateFundResponse().setId(realStateFund.getId())
                .setTicketName(realStateFund.getTicketName())
                .setTargetAudience(realStateFund.getTargetAudience())
                .setTicketType(realStateFund.getTicketType())
                .setAdministrator(realStateFund.getAdministrator())
                .setPrice(realStateFund.getPrice())
                .setLastDividendYield(realStateFund.getLastDividendYield())
                .setAverageDividendYield(realStateFund.getAverageDividendYield())
                .setDailyLiquidity(realStateFund.getDailyLiquidity())
                .setPriceByEquityValue(realStateFund.getPriceByEquityValue())
                .setShareholders(realStateFund.getShareholders());
    }
}
