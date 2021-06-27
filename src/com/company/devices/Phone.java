package com.company.devices;

import com.company.Human;
import com.company.Sellable;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Phone extends Device implements Sellable {

    static final String DEFAULT_SERVER_ADRESS = "apppage.com";
    static final String DEFAULT_APP_VERSION = "2.13/PB85";
    static final String DEFAULT_PROTOCOL = "https";

    public Phone(String producer, String model, int year){
        super(producer,model,year);
    }

    @Override
    public String toString() {
        return "model: " + model + " producer: " + producer + " year: " + year;
    }

    @Override
    public void turnOn() {
        System.out.println("Włącz telefon.");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(seller.myPhone != null && buyer.cash >= price){
            buyer.cash -= price;
            seller.cash += price;
            buyer.myPhone = seller.myPhone;
            seller.myPhone = null;
            System.out.println("Kupujący nabył "+buyer.myPhone +" za kwotę "+price+" zl.");
        }
        else
            System.out.println("Upewnij się czy sprzedający ma telefon lub czy kupujący ma wystarczająco pieniędzy.");
    }

    public void installAnnApp(String appName){}

    public void installAnnApp(String appName, String version){
        this.installAnnApp(appName);
    }

    public void installAnnApp(List<String> appNames){
        for(String appName : appNames)
            this.installAnnApp(appName);
    }

    public void installAnnApp(String appName, String version, String serverAdress){
        this.installAnnApp(appName,version);
    }

    public void installAnnApp(URL url){
        try{
            url = new URL(DEFAULT_PROTOCOL,DEFAULT_SERVER_ADRESS,443,DEFAULT_APP_VERSION);
        }catch (MalformedURLException e){
            e.printStackTrace();
        }
    }
}
