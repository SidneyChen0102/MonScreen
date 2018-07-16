package com.asiainfo.dto;

public class CrmRestful {
    private  int  CRM_AMOUNT;
    private  int  CRM_COMPLETE;
    private  int  CRM_EXCEPTION;

    public CrmRestful( ) {
    }

    public CrmRestful(int CRM_AMOUNT, int CRM_COMPLETE, int CRM_EXCEPTION) {
        this.CRM_AMOUNT = CRM_AMOUNT;
        this.CRM_COMPLETE = CRM_COMPLETE;
        this.CRM_EXCEPTION = CRM_EXCEPTION;
    }

    public int getCRM_AMOUNT() {
        return CRM_AMOUNT;
    }

    public void setCRM_AMOUNT(int CRM_AMOUNT) {
        this.CRM_AMOUNT = CRM_AMOUNT;
    }

    public int getCRM_COMPLETE() {
        return CRM_COMPLETE;
    }

    public void setCRM_COMPLETE(int CRM_COMPLETE) {
        this.CRM_COMPLETE = CRM_COMPLETE;
    }

    public int getCRM_EXCEPTION() {
        return CRM_EXCEPTION;
    }

    public void setCRM_EXCEPTION(int CRM_EXCEPTION) {
        this.CRM_EXCEPTION = CRM_EXCEPTION;
    }


    @Override
    public String toString() {
        return "CrmRestful{" +
                "CRM_AMOUNT=" + CRM_AMOUNT +
                ", CRM_COMPLETE=" + CRM_COMPLETE +
                ", CRM_EXCEPTION=" + CRM_EXCEPTION +
                '}';
    }
}
