package com.asiainfo.dto;

public class RateRestful {
public String  name;
public float   rate;

    public RateRestful(String name, float rate) {
        this.name = name;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "RateRestful{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                '}';
    }
}
