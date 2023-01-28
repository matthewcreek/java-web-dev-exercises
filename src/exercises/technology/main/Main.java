package exercises.technology.main;

public class Main {
    public static void main(String[] args) {
        Computer dell = new Computer(true,false);
//        dell.checkIfOn();
//        dell.pressPowerButton();
//        dell.checkIfOn();
//        dell.pressPowerButton();
//        dell.checkIfOn();
//        System.out.println(dell.getProcessor());

        Laptop lenovo = new Laptop(14,true,false);
//        lenovo.checkIfOn();
//        lenovo.pressPowerButton();
//        lenovo.checkIfOn();
//        System.out.println(lenovo.getProcessor());
//        lenovo.batteryHealth();
//        System.out.println(lenovo.isPortable());

        SmartPhone apple12 = new SmartPhone(12,false,false);
//        apple12.checkIfOn();
//        apple12.pressPowerButton();
//        apple12.checkIfOn();
//        System.out.println(apple12.getProcessor());
        System.out.println(apple12.getiOSVersion());
        apple12.updateIOS();
        System.out.println(apple12.isHasFans());

    }
}
