package com.asiainfo.dto;

public class TimeRestful {
    private  int  CRM_TIME;
    private  int  NEA_TIME;
    private  int  OLC_TIME;

    public TimeRestful( ) {
    }

    public TimeRestful(int CRM_TIME, int NEA_TIME, int OLC_TIME) {
        this.CRM_TIME = CRM_TIME;
        this.NEA_TIME = NEA_TIME;
        this.OLC_TIME = OLC_TIME;
    }


    public int getCRM_TIME() {
        return CRM_TIME;
    }

    public void setCRM_TIME(int CRM_TIME) {
        this.CRM_TIME = CRM_TIME;
    }

    public int getNEA_TIME() {
        return NEA_TIME;
    }

    public void setNEA_TIME(int NEA_TIME) {
        this.NEA_TIME = NEA_TIME;
    }

    public int getOLC_TIME() {
        return OLC_TIME;
    }

    public void setOLC_TIME(int OLC_TIME) {
        this.OLC_TIME = OLC_TIME;
    }

    @Override
    public String toString() {
        return "TimeRestful{" +
                "CRM_TIME=" + CRM_TIME +
                ", NEA_TIME=" + NEA_TIME +
                ", OLC_TIME=" + OLC_TIME +
                '}';
    }
}
