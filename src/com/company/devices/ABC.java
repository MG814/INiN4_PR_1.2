package com.company.devices;

import java.util.Comparator;

public class ABC implements Comparator<Application> {

    @Override
    public int compare(Application o1, Application o2) {
        return o1.getAppName().compareToIgnoreCase(o2.getAppName());
    }
}
