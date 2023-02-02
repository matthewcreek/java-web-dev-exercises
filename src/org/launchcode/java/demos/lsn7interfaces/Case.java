package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Arrays;

public class Case {
    private ArrayList<Flavor> flavors = new ArrayList<>();
    private ArrayList<Cone> cones = new ArrayList<>();
    private ArrayList<Toppings> toppings = new ArrayList<>();

    public Case(){
        Cone cone1 = new Cone("Waffle", 1.25, new ArrayList<>(Arrays.asList( "gluten")));
        Cone cone2 = new Cone("Sugar", 0.75, new ArrayList<>(Arrays.asList( "gluten")));
        Cone cone3 = new Cone("Wafer", 0.50, new ArrayList<>(Arrays.asList( "gluten")));
        Cone cone4 = new Cone("Bowl", 0.05, new ArrayList<>(Arrays.asList( "none")));
        cones.add(cone1);
        cones.add(cone2);
        cones.add(cone3);
        cones.add(cone4);

        Flavor flavor1 = new Flavor("Vanilla", 0.75, new ArrayList<>(Arrays.asList( "dairy")));
        Flavor flavor2 = new Flavor("Chocolate", 0.75, new ArrayList<>(Arrays.asList( "dairy")));
        Flavor flavor3 = new Flavor("Red Velvet", 0.85, new ArrayList<>(Arrays.asList( "dairy", "red #5")));
        Flavor flavor4 = new Flavor("Rocky Road", 0.85, new ArrayList<>(Arrays.asList( "dairy", "nuts", "gelatin")));
        Flavor flavor5 = new Flavor("Strawberry Sorbet", 0.50, new ArrayList<>(Arrays.asList( "strawberry")));
        flavors.add(flavor1);
        flavors.add(flavor2);
        flavors.add(flavor3);
        flavors.add(flavor4);
        flavors.add(flavor5);

        Toppings toppings1 = new Toppings("Peanuts",0.50, new ArrayList<>(Arrays.asList("nuts")));
        Toppings toppings2 = new Toppings("Gummy Bears", 0.75, new ArrayList<>(Arrays.asList("gelatin","red #5")));
        Toppings toppings3 = new Toppings("Oreo Crumbles", 1.25, new ArrayList<>(Arrays.asList("none")));
        Toppings toppings4 = new Toppings("M&Ms",1.00, new ArrayList<>(Arrays.asList("nuts")));
        Toppings toppings5 = new Toppings("Gold Flake",60.50, new ArrayList<>(Arrays.asList("poverty")));
        toppings.add(toppings1);
        toppings.add(toppings2);
        toppings.add(toppings3);
        toppings.add(toppings4);
        toppings.add(toppings5);
    }

    public ArrayList<Flavor> getFlavors() {
        return flavors;
    }

    public ArrayList<Cone> getCones() {
        return cones;
    }

    public ArrayList<Toppings> getToppings() {
        return toppings;
    }

    public void setFlavors(ArrayList<Flavor> flavors) {
        this.flavors = flavors;
    }

    public void setCones(ArrayList<Cone> cones) {
        this.cones = cones;
    }

    public void setToppings(ArrayList<Toppings> toppings) {
        this.toppings = toppings;
    }
}
