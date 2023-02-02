package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Toppings> toppings = menu.getToppings();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.
        System.out.println("\nBefore:");
        for (int i = 0; i < flavors.size(); i++) {
            System.out.println(flavors.get(i).getName());
        }
        flavors.sort(new FlavorComparator());
        System.out.println("\nAfter:");
        for (int i = 0; i < flavors.size(); i++) {
            System.out.println(flavors.get(i).getName());
        }

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.
        System.out.println("\nBefore: ");
        for (int i = 0; i < cones.size(); i++) {
            System.out.println(cones.get(i).getName() + ": " + cones.get(i).getCost());
        }
        cones.sort(new ConeComparator());
        System.out.println("\nAfter: ");
        for (int i = 0; i < cones.size(); i++) {
            System.out.println(cones.get(i).getName() + ": " + cones.get(i).getCost());
        }

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        System.out.println("\nBefore: ");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println(toppings.get(i).getName() + ": " + toppings.get(i).getCost());
        }
        toppings.sort(new ToppingsComparator());
        System.out.println("\nAfter: ");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println(toppings.get(i).getName() + ": " + toppings.get(i).getCost());
        }
    }
}
