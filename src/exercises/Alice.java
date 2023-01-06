package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String excerpt = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        String lowercaseExcerpt = excerpt.toLowerCase();
        System.out.println("What term would you like to search? ");
        String search = (input.nextLine()).toLowerCase();
        int index = lowercaseExcerpt.indexOf(search);
        int length = search.length();
        if (lowercaseExcerpt.contains(search)) {
            System.out.println("The excerpt contains the search term. The first instance is at index " + index + ". The search term is " + length + " characters long.");
            if (search.equals("alice")) {
                String modifiedExcerpt = excerpt.replace("Alice", "");
                System.out.println(modifiedExcerpt);
            } else {
                String modifiedExcerpt = excerpt.replace(search, "");
                System.out.println(modifiedExcerpt);
            }
        } else {
            System.out.println("The search term was not found within the excerpt.");
        }
    }
}
