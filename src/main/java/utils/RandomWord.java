package utils;

import java.util.Random;

public class RandomWord {

    private static int wordLenght = 2;

    public static String get_randomWord() {
        String s = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        StringBuffer randomWord = new StringBuffer();

        for (int i = 0; i < wordLenght; i++) {
            randomWord.append(s.charAt(new Random().nextInt(s.length())));
        }

        return randomWord.toString();
    }
}






