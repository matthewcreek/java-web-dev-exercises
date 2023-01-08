package exercises.chapter3;

import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListPractice {
    public static void main(String[] args){
        ArrayList<Integer> someIntegers = new ArrayList<>();
        someIntegers.add(1);
        someIntegers.add(2);
        someIntegers.add(3);
        someIntegers.add(4);
        someIntegers.add(5);
        someIntegers.add(6);
        someIntegers.add(7);
        someIntegers.add(8);
        someIntegers.add(9);
        someIntegers.add(10);
        System.out.println(addEvens(someIntegers));
        String excerpt = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] strSplit = excerpt.split(" ");
        ArrayList<String> someWords = new ArrayList<>(java.util.Arrays.asList(strSplit));
        print5LetterWords(someWords);
    }
    public static int addEvens(ArrayList<Integer> arr) {
        int sumNums = 0;
        for (Integer i: arr){
            if (i%2 == 0){
                sumNums += i;
            }
        }
        return sumNums;
    }
    public static void print5LetterWords(ArrayList<String> arr){
        Scanner input = new Scanner(System.in);
        System.out.println("How many letters would you like the printed words to have? : ");
        int search = input.nextInt();
        for (String str : arr){
            if (str.length() == search){
                System.out.println(str);
            }
        }
    }
}
