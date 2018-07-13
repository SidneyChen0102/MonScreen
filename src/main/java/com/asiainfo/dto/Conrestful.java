package com.asiainfo.dto;

public class Conrestful {
    public  String ipname;
    public  float    connection;
    private  float   upper_limit;
    public Conrestful(String ipname, float connection, float upper_limit) {
        this.ipname = ipname;
        this.connection = connection;
        this.upper_limit = upper_limit;
    }

    public String getIpname() {
        return ipname;
    }

    public void setIpname(String ipname) {
        this.ipname = ipname;
    }

    public float getConnection() {
        return connection;
    }

    public void setConnection(float connection) {
        this.connection = connection;
    }

    public float getUpper_limit() {
        return upper_limit;
    }

    public void setUpper_limit(float upper_limit) {
        this.upper_limit = upper_limit;
    }


    @Override
    public String toString() {
        return "Conrestful{" +
                "ipname='" + ipname + '\'' +
                ", connection=" + connection +
                ", upper_limit=" + upper_limit +
                '}';
    }
}
