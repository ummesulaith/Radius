package com.example.radiusassessment.Model.children;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Trip_Cost {
    @SerializedName("value")
    @Expose
    private String value;

    @SerializedName("currency")
    @Expose
    private String currency;

    @Override
    public String toString() {
        return "Trip_Cost{" +
                "value='" + value + '\'' +
                ", currency='" + currency + '\'' +
                ", currency_symbol='" + currency_symbol + '\'' +
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

    public String getCurrency_symbol() {
        return currency_symbol;
    }

    public void setCurrency_symbol(String currency_symbol) {
        this.currency_symbol = currency_symbol;
    }

    public Trip_Cost(String value, String currency, String currency_symbol) {
        this.value = value;
        this.currency = currency;
        this.currency_symbol = currency_symbol;
    }

    @SerializedName("currency_symbol")
    @Expose
    private String currency_symbol;
}
