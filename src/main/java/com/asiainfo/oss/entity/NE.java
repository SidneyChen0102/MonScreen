package com.asiainfo.oss.entity;

public class NE {
private  String name;
private  long   threshold_value;
private  long   upper_limit;

    public NE(String name, long threshold_value, long upper_limit) {
        this.name = name;
        this.threshold_value = threshold_value;
        this.upper_limit = upper_limit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getThreshold_value() {
        return threshold_value;
    }

    public void setThreshold_value(long threshold_value) {
        this.threshold_value = threshold_value;
    }

    public long getUpper_limit() {
        return upper_limit;
    }

    public void setUpper_limit(long upper_limit) {
        this.upper_limit = upper_limit;
    }

    @Override
    public String toString() {
        return "NE{" +
                "name='" + name + '\'' +
                ", threshold_value=" + threshold_value +
                ", upper_limit=" + upper_limit +
                '}';
    }
}
