package org.launchcode.java.studio3.countingcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;


public class CountingCharacters {
    public static void main(String[] args){

        HashMap<Character, Integer> charCount = new HashMap<>();

        String excerpt = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter content: ");
//        String userInput = (input.nextLine()).toLowerCase();

        try {
            File newFile = new File("studio3.txt");
            Scanner myReader = new Scanner(newFile);
            while (myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
                char[] charExcerpt = data.toCharArray();
                for (Character c : charExcerpt){
                    if (Character.isLetter(c)){
                        if (!charCount.containsKey(c)){
                            charCount.put(c, 1);
                        } else if (charCount.containsKey(c)){
                            charCount.put(c, charCount.get(c)+1);
                        }
                    }
                }
//        System.out.println(charCount);
                for (Map.Entry<Character, Integer> c : charCount.entrySet()) {
                    System.out.println(c.getKey() + " appears " + c.getValue() + " times.");
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


//        char[] charExcerpt = userInput.toCharArray();
//        for (Character c : charExcerpt){
//            if (Character.isLetter(c)){
//                if (!charCount.containsKey(c)){
//                    charCount.put(c, 1);
//                } else if (charCount.containsKey(c)){
//                    charCount.put(c, charCount.get(c)+1);
//                }
//            }
//        }
////        System.out.println(charCount);
//        for (Map.Entry<Character, Integer> c : charCount.entrySet()) {
//            System.out.println(c.getKey() + " appears " + c.getValue() + " times.");
//        }
    }
}
