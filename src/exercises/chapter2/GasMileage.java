package exercises.chapter2;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven: ");
        double miles = input.nextDouble();
        System.out.println("How many gallons of gas have you consumed: ");
        double gas = input.nextDouble();
        System.out.println("Your miles per gallon usage is " + (miles/gas) + ".");
    }
}
