package com.company.devices;

public class Application {
    private String appName;
    private String version;
    private Double appPrice;

    public Application(String appName,String version, Double appPrice){
        this.appName = appName;
        this.version = version;
        this.appPrice = appPrice;
    }

    public Double getAppPrice() {
        return appPrice;
    }

    public String getAppName() {
        return appName;
    }

    @Override
    public String toString() {
        return "appName: " + appName + " version: " + version + " appPrice: " + appPrice;
    }
}
