package cwiczenia08;

import java.util.Arrays;

public class Main {
    private static double[] nearestCentroid(double[] point, double[][] centroidList) {
        double[] nearestCentroid = null;
        double nearestDistance = Double.MAX_VALUE;

        for (double[] centroid : centroidList) {
            double distance = 0;

            for (int j = 0; j < point.length; j++) {
                distance += Math.pow(point[j] - centroid[j], 2);
            }

            if (distance < nearestDistance) {
                nearestDistance = distance;
                nearestCentroid = centroid;
            }
        }

        return nearestCentroid;
    }

    public static void main(String[] args) {
        double[] point = {2, 5};
        double[][] centroids = {
                {2, 10},
                {5, 8},
                {1, 2}
        };

        System.out.println(Arrays.toString(nearestCentroid(point, centroids)));
    }
}

