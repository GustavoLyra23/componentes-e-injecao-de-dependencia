package com.devsuperior.aula.entities;

public class Order {

    private int code;
    private Double basicValue;
    private Double discount;


    public Order() {
    }


    public Order(int code, Double basicValue, Double discount) {
        this.code = code;
        this.basicValue = basicValue;
        this.discount = discount;
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Double getBasicValue() {
        return basicValue;
    }

    public void setBasicValue(Double basicValue) {
        this.basicValue = basicValue;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }
}
