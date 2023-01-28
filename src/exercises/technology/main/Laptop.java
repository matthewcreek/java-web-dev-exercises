package exercises.technology.main;

public class Laptop extends Computer {

    //Fields
    private  String processor = "Intel i7-1165G7";
    private double batteryLifeInHours = 5;
    private boolean isPortable = true;
    private int age;

    //Constructor
    public Laptop(int aAge, boolean aHasFans, boolean aIsPowered) {
        super(aHasFans, aIsPowered);
        age = aAge;
    }

    //Getters and Setters
    @Override
    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }
    public boolean isPortable() {
        return isPortable;
    }

    public void setPortable(boolean portable) {
        isPortable = portable;
    }

    //Instance Methods
    public String batteryHealth() {
        double batteryDegradation = (this.batteryLifeInHours * age) * .08;
//        System.out.println(batteryDegradation);
        double newBatteryLife = this.batteryLifeInHours - batteryDegradation;
//        System.out.println(newBatteryLife);
        if (newBatteryLife <= 0){
            System.out.println("Your battery will not hold a charge.");
            this.isPortable = false;
            return "Your battery will not hold a charge.";
        } else if (newBatteryLife < (this.batteryLifeInHours/2)) {
            System.out.println("Your battery is over half it's life expectancy.");
            return "Your battery is over half it's life expectancy.";
        } else
            System.out.println("Battery Fine");
            return "Battery Fine";
    }
}
