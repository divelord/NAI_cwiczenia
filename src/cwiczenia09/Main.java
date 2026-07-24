package cwiczenia09;

import java.util.Arrays;

public class Main {
    private static int[] convertIntToBin(int number) {
        String binString = Integer.toBinaryString(number);
        int[] binArr = new int[binString.length()];

        for (int i = 0; i < binString.length(); i++) {
            binArr[i] = Integer.parseInt(String.valueOf(binString.charAt(i)));
        }

        return binArr;
    }

    public static void main(String[] args) {
        int number = 10;
        int[] binaryArr = convertIntToBin(number);

        System.out.println(Arrays.toString(binaryArr));
    }
}