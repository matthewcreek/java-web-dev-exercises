package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class ToppingsComparator implements Comparator<Toppings> {
    @Override
    public int compare(Toppings o1, Toppings o2) {
        if (o1.getCost() - o2.getCost() < 0) {
            return 1;
        } else if (o1.getCost() - o2.getCost() > 0) {
            return -1;
        } else return 0;
    }
}
