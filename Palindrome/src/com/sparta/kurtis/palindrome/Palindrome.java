package com.sparta.kurtis.palindrome;

import com.sparta.kurtis.Printer;

import java.util.Locale;

public class Palindrome {
    public static boolean isPalindrome(String message) {
        if (message == null || message.length() == 0) {
            Printer.printErrorMessage("trying to slip in a cheeky invalid input? not so fast wise guy");
            return false;
        }

        int messageMiddle = message.length() / 2;
        boolean isPalindrome = true;
        boolean doCharactersMatch;
        boolean areCharactersLetters;

        for (int i = 0; i < messageMiddle; i++) {
            doCharactersMatch = message.toLowerCase().charAt(i) == message.toLowerCase().charAt(message.length() - 1 - i);
            areCharactersLetters = Character.isLetter(message.charAt(i)) || Character.isLetter(message.charAt(message.length() - 1 - i));

            if (!doCharactersMatch || !areCharactersLetters) {
                isPalindrome = false;
                break;
            }
        }

        return isPalindrome;
    }

    public static String longestPalindrome(String sentence) {
        if (sentence == null || sentence.length() == 0) {
            Printer.printErrorMessage("go look elsewhere if you're trying to break something. I hear capitol hill could do with a raid");
            return null;
        }

        String[] sentenceArray = sentence.split("[^a-zA-z'-]+");
        int longestPalindromeIndex = 0;

        for (int i = 0; i < sentenceArray.length; i++) {
            if (isPalindrome(sentenceArray[i])) {
                if (sentenceArray[i].length() > sentenceArray[longestPalindromeIndex].length()) {
                    longestPalindromeIndex = i;
                }
            }
        }

        return sentenceArray[longestPalindromeIndex];
    }
}
