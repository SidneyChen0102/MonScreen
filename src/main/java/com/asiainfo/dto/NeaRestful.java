package com.asiainfo.dto;

public class NeaRestful {
    private  int  NEA_AMOUNT;
    private  int  NEA_COMPLETE;
    private  int  NEA_EXCEPTION;

    public NeaRestful( ) {

    }


    public NeaRestful(int NEA_AMOUNT, int NEA_COMPLETE, int NEA_EXCEPTION) {
        this.NEA_AMOUNT = NEA_AMOUNT;
        this.NEA_COMPLETE = NEA_COMPLETE;
        this.NEA_EXCEPTION = NEA_EXCEPTION;
    }

    public int getNEA_AMOUNT() {
        return NEA_AMOUNT;
    }

    public void setNEA_AMOUNT(int NEA_AMOUNT) {
        this.NEA_AMOUNT = NEA_AMOUNT;
    }

    public int getNEA_COMPLETE() {
        return NEA_COMPLETE;
    }

    public void setNEA_COMPLETE(int NEA_COMPLETE) {
        this.NEA_COMPLETE = NEA_COMPLETE;
    }

    public int getNEA_EXCEPTION() {
        return NEA_EXCEPTION;
    }

    public void setNEA_EXCEPTION(int NEA_EXCEPTION) {
        this.NEA_EXCEPTION = NEA_EXCEPTION;
    }


    @Override
    public String toString() {
        return "NeaRestful{" +
                "NEA_AMOUNT=" + NEA_AMOUNT +
                ", NEA_COMPLETE=" + NEA_COMPLETE +
                ", NEA_EXCEPTION=" + NEA_EXCEPTION +
                '}';
    }
}
