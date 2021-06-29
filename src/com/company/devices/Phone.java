package com.company.devices;

import com.company.Human;
import com.company.Sellable;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Phone extends Device implements Sellable{

    static final String DEFAULT_SERVER_ADRESS = "apppage.com";
    static final String DEFAULT_APP_VERSION = "2.13/PB85";
    static final String DEFAULT_PROTOCOL = "https";
    List<Application> applications = new ArrayList<>();

    public Phone(String producer, String model, int year, Double value) {
        super(producer, model, year, value);
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
        if (seller.getMyPhone() != null && buyer.getCash() >= price) {
            buyer.setCash(buyer.getCash() - price);
            seller.setCash(seller.getCash() + price);
            buyer.setMyPhone(seller.getMyPhone());
            seller.removePhone();
            System.out.println("Kupujący nabył " + buyer.getMyPhone() + " za kwotę " + price + " zl.");
        } else
            System.out.println("Upewnij się czy sprzedający ma telefon lub czy kupujący ma wystarczająco pieniędzy.");
    }

    public void installAnnApp(String appName) {
    }

    public void installAnnApp(String appName, String version) {
        this.installAnnApp(appName);
    }

    public void installAnnApp(List<String> appNames) {
        for (String appName : appNames)
            this.installAnnApp(appName);
    }

    public void installAnnApp(String appName, String version, String serverAdress) {
        this.installAnnApp(appName, version);
    }

    public void installAnnApp(URL url) {
        try {
            url = new URL(DEFAULT_PROTOCOL, DEFAULT_SERVER_ADRESS, 443, DEFAULT_APP_VERSION);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public void installNewApp(Human ownerPhone, Application app) {
        if (ownerPhone.getCash() >= app.getAppPrice()) {
            applications.add(app);
            ownerPhone.setCash(ownerPhone.getCash() - app.getAppPrice());
            System.out.println("Zakupiłeś " + app.getAppName() + " za " + app.getAppPrice() + " zl.");
        }
        else
            System.out.println("Za mało pieniędzy.");
    }

    public void isInstall(Application app){
        int count = 0;
        for (Application application:applications) {
            if(application.equals(app))
                count++;
        }
        if(count>0)
            System.out.println("Aplikacja jest zainstalowana.");
        else
            System.out.println("Aplikacja nie jest zainstalowana.");
    }

    public void isInstall(String name){
        int count = 0;
        for (Application application:applications) {
            if(application.getAppName() == name)
                count++;
        }
        if(count>0)
            System.out.println("Aplikacja jest zainstalowana.");
        else
            System.out.println("Aplikacja nie jest zainstalowana.");
    }

    public void freeApp(){
        System.out.println("Darmowe aplikacje: ");
        for (Application application:applications) {
            if(application.getAppPrice() == 0.0)
                System.out.println(application);
        }
    }

    public void volumeApp(){
        Double sum = 0.0;
        for (Application application:applications) {
            sum += application.getAppPrice();
        }
        System.out.println("Wartośc wszystkich zainstalowanych aplikacji wynosi "+ sum+" zl.");
    }

    public void alphabetSort(){
        System.out.println("Aplikacje posortowane alfabetycznie:");
        Collections.sort(applications,new ABC());
        System.out.println(applications);
    }

    public void priceSort(){
        System.out.println("Ceny aplikacji posortowane rosnąco:");
        Collections.sort(applications,new PhonePriceComparator());
        System.out.println(applications);
    }

}
