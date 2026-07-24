package cwiczenia07;

public class Main {
    private static double log2(double val) {
        return Math.log(val) / Math.log(2);
    }

    private static double entropy(double[] arr) {
        double sum = 0.0;

        for (double el : arr) {
            sum += el;
        }

        double ent = 0.0;

        for (double el : arr) {
            if (el > 0) {
                double val = el / sum;
                ent += val * log2(val);
            }
        }

        return -ent;
    }

    public static void main(String[] args) {
        double[] arr = {2, 4, 3};
        double ent = entropy(arr);

        System.out.println(ent);
    }
}
