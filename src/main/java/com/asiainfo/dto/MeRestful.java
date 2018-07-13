package com.asiainfo.dto;

public class MeRestful {
    private  String  ip;
    private  float   memory;

    public MeRestful(String ip, float memory) {
        this.ip = ip;
        this.memory = memory;
    }

    public MeRestful() {
        this.ip = ip;
        this.memory = memory;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public float getMemory() {
        return memory;
    }

    public void setMemory(float memory) {
        this.memory = memory;
    }


    @Override
    public String toString() {
        return "MeRestful{" +
                "ip='" + ip + '\'' +
                ", memory=" + memory +
                '}';
    }
}
