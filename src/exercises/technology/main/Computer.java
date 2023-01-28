package exercises.technology.main;

public class Computer {

    //Fields
    private String processor = "Intel i9-13900KS";
    private boolean hasFans;
    private boolean isPowered = false;

    //Constructor
    public Computer (boolean aHasFans, boolean aIsPowered) {
        hasFans = aHasFans;
        isPowered = aIsPowered;
    }

    //Getters and Setters
    public String getProcessor() {
        return processor;
    }

    public boolean isHasFans() {
        return hasFans;
    }

    public void setHasFans(boolean hasFans) {
        this.hasFans = hasFans;
    }

    public boolean isPowered() {
        return isPowered;
    }

    public void setPowered(boolean powered) {
        isPowered = powered;
    }

    //Instance Methods
    public void pressPowerButton() {
        isPowered = !isPowered;
    }
    public String checkIfOn() {
        if (isPowered) {
            System.out.println("Device is turned on.");
            return "Device is turned on.";
        } else {
            System.out.println("Device is not turned on.");
            return "Device is not turned on.";
        }
    }
}
