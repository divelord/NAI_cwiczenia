package cwiczenia02;

public class Main {
    private static double calculateDistance(double[] arr1, double[] arr2) {
        double distance = 0.0;

        for (int i = 0; i < arr1.length; i++) {
            distance += Math.pow(arr1[i] - arr2[i], 2);
        }

        return Math.sqrt(distance);
    }

    public static void main(String[] args) {
        double[] p1 = {1, -1, -6, 10};
        double[] p2 = {1, 2, 3, 4};
        double d = calculateDistance(p1, p2);

        System.out.println("Odległość między punktami wynosi: " + d);
    }
}