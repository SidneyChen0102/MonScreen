package com.asiainfo.oss.entity;

public class PC {
    private  String  PC_NAME;
    private  String   IP;
    private  String   USERNAME;
    private  String   PASSWORD;
    private  int      CPU_AMOUNT;
    private  int      MEMORY_AMOUNT;

    public PC() {

    }

    public PC(String PC_NAME, String IP, String USERNAME, String PASSWORD, int CPU_AMOUNT, int MEMORY_AMOUNT) {
        this.PC_NAME = PC_NAME;
        this.IP = IP;
        this.USERNAME = USERNAME;
        this.PASSWORD = PASSWORD;
        this.CPU_AMOUNT = CPU_AMOUNT;
        this.MEMORY_AMOUNT = MEMORY_AMOUNT;
    }

    public String getPC_NAME() {
        return PC_NAME;
    }

    public void setPC_NAME(String PC_NAME) {
        this.PC_NAME = PC_NAME;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public int getCPU_AMOUNT() {
        return CPU_AMOUNT;
    }

    public void setCPU_AMOUNT(int CPU_AMOUNT) {
        this.CPU_AMOUNT = CPU_AMOUNT;
    }

    public int getMEMORY_AMOUNT() {
        return MEMORY_AMOUNT;
    }

    public void setMEMORY_AMOUNT(int MEMORY_AMOUNT) {
        this.MEMORY_AMOUNT = MEMORY_AMOUNT;
    }


    @Override
    public String toString() {
        return "PC{" +
                "PC_NAME='" + PC_NAME + '\'' +
                ", IP='" + IP + '\'' +
                ", USERNAME='" + USERNAME + '\'' +
                ", PASSWORD='" + PASSWORD + '\'' +
                ", CPU_AMOUNT=" + CPU_AMOUNT +
                ", MEMORY_AMOUNT=" + MEMORY_AMOUNT +
                '}';
    }
}
