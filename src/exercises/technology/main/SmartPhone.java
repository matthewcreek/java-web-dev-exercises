package exercises.technology.main;

public class SmartPhone extends Computer {

    //Fields
    private String processor = "Apple A16 Bionic";
    private int iOSVersion;

    //Constructor
    public SmartPhone(int aIOSVersion, boolean aHasFans, boolean aIsPowered) {
        super(aHasFans,aIsPowered);
        iOSVersion = aIOSVersion;
    }

    //Getters and Setters
    @Override
    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getiOSVersion() {
        return iOSVersion;
    }

    //Instance Methods
    public int updateIOS() {
        return this.iOSVersion += 1;
    }
}
