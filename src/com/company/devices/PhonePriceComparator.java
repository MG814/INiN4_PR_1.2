package com.company.devices;

import java.util.Comparator;

public class PhonePriceComparator implements Comparator<Application> {

    @Override
    public int compare(Application o1, Application o2) {
        if(o1 == null && o2 == null)
            return 0;
        else if(o1 == null)
            return -1;
        else if(o2 == null)
            return 1;
        if(o1.getAppPrice() > o2.getAppPrice())
            return 1;
        else if(o1.getAppPrice() < o2.getAppPrice())
            return -1;
        else
            return 0;
    }
}
