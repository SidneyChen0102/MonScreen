package com.asiainfo.oss.entity;

public class NE_STATE {
private String  NAME;
private String  TIME;
private  float   RATE;
private  float   SUCESS;
private  float   CONNECTIONS;
private  long    THRESHOLD_VALUE;
private  float   UPPER_LIMIT;

    public NE_STATE() {

    }

    public NE_STATE(String NAME, String TIME, float RATE, float SUCESS, float CONNECTIONS, long THRESHOLD_VALUE, float UPPER_LIMIT) {
        this.NAME = NAME;
        this.TIME = TIME;
        this.RATE = RATE;
        this.SUCESS = SUCESS;
        this.CONNECTIONS = CONNECTIONS;
        this.THRESHOLD_VALUE = THRESHOLD_VALUE;
        this.UPPER_LIMIT = UPPER_LIMIT;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getTIME() {
        return TIME;
    }

    public void setTIME(String TIME) {
        this.TIME = TIME;
    }

    public float getRATE() {
        return RATE;
    }

    public void setRATE(float RATE) {
        this.RATE = RATE;
    }

    public float getSUCESS() {
        return SUCESS;
    }

    public void setSUCESS(float SUCESS) {
        this.SUCESS = SUCESS;
    }

    public float getCONNECTIONS() {
        return CONNECTIONS;
    }

    public void setCONNECTIONS(float CONNECTIONS) {
        this.CONNECTIONS = CONNECTIONS;
    }

    public long getTHRESHOLD_VALUE() {
        return THRESHOLD_VALUE;
    }

    public void setTHRESHOLD_VALUE(long THRESHOLD_VALUE) {
        this.THRESHOLD_VALUE = THRESHOLD_VALUE;
    }

    public float getUPPER_LIMIT() {
        return UPPER_LIMIT;
    }

    public void setUPPER_LIMIT(float UPPER_LIMIT) {
        this.UPPER_LIMIT = UPPER_LIMIT;
    }

    @Override
    public String toString() {
        return "NE_STATE{" +
                "NAME='" + NAME + '\'' +
                ", TIME='" + TIME + '\'' +
                ", RATE=" + RATE +
                ", SUCESS=" + SUCESS +
                ", CONNECTIONS=" + CONNECTIONS +
                ", THRESHOLD_VALUE=" + THRESHOLD_VALUE +
                ", UPPER_LIMIT=" + UPPER_LIMIT +
                '}';
    }
}
