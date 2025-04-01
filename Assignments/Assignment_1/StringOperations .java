/*Problem 2: 
Write a program that performs the following operations on strings: 
1. Check whether two given strings are anagrams of each other. 
2. Identify the longest word in a given sentence. 
3. Count the number of vowels and consonants in the same sentence. 
Input: 
String 1: listen   
String 2: silent   
Sentence: Practice makes a man perfect*/

import java.util.Arrays;
 class StringOperations {
 public static boolean areAnagrams(String str1, String str2) {
        char[] arr1 = str1.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] arr2 = str2.replaceAll("\\s", "").toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public static String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }

    public static int[] countOperation(String sentence) {
        int vowels = 0, consonants = 0;
        String vowelsList = "aeiouAEIOU";
        for (char c : sentence.replaceAll("[^a-zA-Z]", "").toCharArray()) {
            if (vowelsList.indexOf(c) != -1) {
                vowels++;
            } else {
                consonants++;
            }
        }
        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        String sentence = "Practice makes a man perfect";

        System.out.println("Are '" + str1 + "' and '" + str2 + "' anagrams? " + areAnagrams(str1, str2));
        System.out.println("Longest word: " + findLongestWord(sentence));
        
        int[] counts = countOperation(sentence);
        System.out.println("Vowels: " + counts[0] + ", Consonants: " + counts[1]);
    }
}