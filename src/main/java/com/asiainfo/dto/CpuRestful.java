package com.asiainfo.dto;

public class CpuRestful {
    public String ip;
    public float  cpu_usage;

    public CpuRestful(String ip, float cpu_usage) {
        this.ip = ip;
        this.cpu_usage = cpu_usage;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public float getCpu_usage() {
        return cpu_usage;
    }

    public void setCpu_usage(float cpu_usage) {
        this.cpu_usage = cpu_usage;
    }

    @Override
    public String toString() {
        return "CpuRestful{" +
                "ip='" + ip + '\'' +
                ", cpu_usage=" + cpu_usage +
                '}';
    }
}
