package com.company;

import java.util.Scanner;
import java.util.SortedMap;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a sentence:");
        String sentence = scanner.nextLine();

        Main spinWords = new Main();

        System.out.printf(spinWords.spinWords(sentence));

    }

    public String spinWords(String sentence){

       String[] tempArray = sentence.split(" ");
       String result = "";

       for (int i = 0 ; i < tempArray.length; i++ ) {
           String tmpString = tempArray[i];
           String potentiallyReversedTmpString = reverseIfNeeded(tmpString);
      // for (String tmpString: tempArray) { //  for each loop
           result += potentiallyReversedTmpString;
           if (i < tempArray.length - 1) {
               result += " ";
           }
       }

        return result;
    }

    public String reverseIfNeeded(String word) {

        if (word.length() < 5) {
            return word;
        }
        char[] wordChar = word.toCharArray();
        String tmpString = "";
        for (int i = wordChar.length - 1 ; i > 0 ; i--) {
            tmpString += wordChar[i];

        }
       //  StringBuilder maciek = new StringBuilder(word); /// TODO: 26/01/2022 get rid of StringBuilder and use a loop
       // return maciek.reverse().toString();
        return tmpString;
    }

}