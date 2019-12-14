package com.example.radiusassessment.Model.children;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Stats_Credits {

    @SerializedName("value")
    @Expose
    private String value;

    @SerializedName("currency")
    @Expose
    private String currency;

    @SerializedName("currency_symbol")
    @Expose
    private String symbol;

    @Override
    public String toString() {
        return "Stats_Credits{" +
                "value='" + value + '\'' +
                ", currency='" + currency + '\'' +
                ", symbol='" + symbol + '\'' +
                '}';
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Stats_Credits(String value, String currency, String symbol) {
        this.value = value;
        this.currency = currency;
        this.symbol = symbol;
    }
}
