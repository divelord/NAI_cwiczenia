package cwiczenia05;

import java.util.Arrays;

public class Main {
    private static double[] processText(String text) {
        double[] letterArr = new double[26];
        int letterCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = Character.toLowerCase(text.charAt(i));

            if (ch >= 'a' && ch <= 'z') {
                int index = ch - 'a';
                letterArr[index]++;
                letterCount++;
            }
        }

        for (int i = 0; i < letterArr.length; i++) {
            if (letterCount > 0) {
                letterArr[i] /= letterCount;
            }
        }

        return letterArr;
    }

    public static void main(String[] args) {
        String text = "abcdefghijklmnopADADSfvgbrtghqrstuvwxyz ąęć";
        double[] letterArr = processText(text);

        System.out.println(Arrays.toString(letterArr));
    }
}
