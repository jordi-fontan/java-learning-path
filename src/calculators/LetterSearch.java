package calculators;

import java.util.Scanner;

public class LetterSearch {
    public static void main(String... args)
    {
        // Declare a condition
        boolean letterFound=false;

        //Enter some text
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter some text");
        String text = scanner.next();
        // Enter a letter
        System.out.println("Please enter a letter");
        char c = scanner.next().charAt(0);

        // Search if letter is at text
        for (int i=0;i<text.length();i++) {
            if(text.charAt(i)==c){
                letterFound=true;
                break;
            }
        }

        //If letter is found communicate it else say not found
        String message=letterFound?"I the Found letter":"On no. letter not found";

        System.out.println(message);
    }
}
