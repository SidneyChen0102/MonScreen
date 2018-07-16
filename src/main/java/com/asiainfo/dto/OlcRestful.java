package com.asiainfo.dto;

public class OlcRestful {
    private  int  OLC_AMOUNT;
    private  int  OLC_COMPLETE;
    private  int  OLC_EXCEPTION;

    public OlcRestful() {

    }


    public OlcRestful(int OLC_AMOUNT, int OLC_COMPLETE, int OLC_EXCEPTION) {
        this.OLC_AMOUNT = OLC_AMOUNT;
        this.OLC_COMPLETE = OLC_COMPLETE;
        this.OLC_EXCEPTION = OLC_EXCEPTION;
    }


    public int getOLC_AMOUNT() {
        return OLC_AMOUNT;
    }

    public void setOLC_AMOUNT(int OLC_AMOUNT) {
        this.OLC_AMOUNT = OLC_AMOUNT;
    }

    public int getOLC_COMPLETE() {
        return OLC_COMPLETE;
    }

    public void setOLC_COMPLETE(int OLC_COMPLETE) {
        this.OLC_COMPLETE = OLC_COMPLETE;
    }

    public int getOLC_EXCEPTION() {
        return OLC_EXCEPTION;
    }

    public void setOLC_EXCEPTION(int OLC_EXCEPTION) {
        this.OLC_EXCEPTION = OLC_EXCEPTION;
    }


    @Override
    public String toString() {
        return "OlcRestful{" +
                "OLC_AMOUNT=" + OLC_AMOUNT +
                ", OLC_COMPLETE=" + OLC_COMPLETE +
                ", OLC_EXCEPTION=" + OLC_EXCEPTION +
                '}';
    }
}
