package com.itheima.springboot_web_req_resp.pojo;

public class Adress {
    private String province;
    private String city;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "province='" + province + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}