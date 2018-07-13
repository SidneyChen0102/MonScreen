package com.asiainfo.dto;

public class SucRestful {
    public  String name;
    public  float  sucess;

    public SucRestful(String name, float sucess) {
        this.name = name;
        this.sucess = sucess;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSucess() {
        return sucess;
    }

    public void setSucess(float sucess) {
        this.sucess = sucess;
    }

    @Override
    public String toString() {
        return "SucRestful{" +
                "name='" + name + '\'' +
                ", sucess=" + sucess +
                '}';
    }
}
