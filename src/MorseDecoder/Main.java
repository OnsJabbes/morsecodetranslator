package MorseDecoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import org.junit.Test;

public class Main {
	private static Scanner sc;
	@Test
    public static void main(String[] args) throws IOException {
        int option = 0;

        sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome to MorseCode Program :) ");
        System.out.println("");

        do {
            System.out.println("Enter the Option Corresponding to the Task you want to Perform");
            System.out.println("1. Translate to Morse Code. \n2. Translate to English Language. \n3. Exit ");

            while (!sc.hasNextInt()) {
                System.out.println("ERROR!! Enter Digits Only. Try Again!! ");
                sc.next();
            }

            option = sc.nextInt();
            switch (option) {
                case 1:
                    translateToMorseCode();
                    break;
                case 2:
                    translateToEnglish();
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("Thank you For Using Morse Code Translator");
                    break;
                default:
                    System.out.println("ERROR!! Invalid Option Entered ");
                    break;
            }
        } while (option != 3);
    }

    public static void translateToMorseCode() throws IOException {
        System.out.println("");
        System.out.println("Enter the Sentence that you want to Translate to the Morse Code \n");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sentence = br.readLine().toLowerCase();

        String morseCodeResult = translateToMorseCodeLogic(sentence);

        System.out.println("The Morse Code Translation is: ");
        System.out.print("");
        System.out.println(morseCodeResult);
        System.out.println("");
    }

    public static void translateToEnglish() throws IOException {
        System.out.println("");
        System.out.println("Enter the Morse Code and After Every Letter add Space in Between ");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sentence = br.readLine();

        String englishResult = translateToEnglishLogic(sentence);

        System.out.println("The English Language Translation is:");
        System.out.print("");
        System.out.println(englishResult);
        System.out.println("");
    }

    public static String translateToMorseCodeLogic(String sentence) {
        char[] english = { 'a', 'b', 'c', 'd', 'e','f', 'g', 'h', 'i','j', 'k', 'l', 'm', 'n',
                           'o', 'p', 'q', 'r', 's', 't', 'u','v', 'w', 'x', 'y', 'z',
                           '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '.', ',', '?'};
        String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", 
                           ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
                           "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
                           "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
                           "-----", "--..--", ".-.-.-", "..--.." };

        StringBuilder morseCodeResult = new StringBuilder();
        char[] morsec = sentence.toCharArray();
        for (char c : morsec) {
            for (int j = 0; j < english.length; j++) {
                if (english[j] == c) {
                    morseCodeResult.append(morse[j]).append(" ");
                }
            }
        }
        return morseCodeResult.toString().trim();
    }

    public static String translateToEnglishLogic(String morseCode) {
        char[] english = { 'a', 'b', 'c', 'd', 'e','f', 'g', 'h', 'i','j', 'k', 'l', 'm', 'n',
                           'o', 'p', 'q', 'r', 's', 't', 'u','v', 'w', 'x', 'y', 'z',
                           '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '.', ',', '?'};
        String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", 
                           ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
                           "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
                           "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
                           "-----", "--..--", ".-.-.-", "..--.." };

        StringBuilder englishResult = new StringBuilder();
        String[] morsec = morseCode.split(" ");
        for (String code : morsec) {
            for (int j = 0; j < morse.length; j++) {
                if (morse[j].equals(code)) {
                    englishResult.append(english[j]);
                }
            }
        }
        return englishResult.toString();
    }
}
