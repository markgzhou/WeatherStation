package com.gTerminal.Entity;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class PriorityCity {
    StringBuilder sb = new StringBuilder();

    @Id
    private String id;

    private String zipCode;
    private String zipCodeType;
    private String cityName;
    private String state;
    private String latidude;
    private String longitude;
    private Date expireTime;

    public PriorityCity(){}

    public PriorityCity(String zipCode, String zipCodeType, String cityName, String state, String latidude, String longitude) {
        this.zipCode = zipCode;
        this.zipCodeType = zipCodeType;
        this.cityName = cityName;
        this.state = state;
        this.latidude = latidude;
        this.longitude = longitude;
        this.expireTime = new Date();
    }

    @Override
    public String toString() {
        sb.setLength(0);
        sb.append("PriorityCity[");
        sb.append("id:").append(id);
        sb.append("zipCode:").append(zipCode);
        sb.append("zipCodeType:").append(zipCodeType);
        sb.append("cityName:").append(cityName);
        sb.append("state:").append(state);
        sb.append("latidude:").append(latidude);
        sb.append("longitude:").append(longitude);
        sb.append("expireTime:").append(expireTime);
        return sb.toString();
    }
}
