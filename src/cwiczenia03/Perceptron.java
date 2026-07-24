package cwiczenia03;

public class Perceptron {
    private double[] weights;
    private double threshold;

    public Perceptron(double[] weights, double threshold) {
        this.weights = weights;
        this.threshold = threshold;
    }

    public Perceptron deltaRule(double[] inputVector, int d, int y, double alpha) {
        double[] newWeights = new double[weights.length];
        int error = d - y;

        for (int i = 0; i < weights.length; i++) {
            newWeights[i] = weights[i] + error * alpha * inputVector[i];
        }

        double newThreshold = threshold - error * alpha;

        return new Perceptron(newWeights, newThreshold);
    }
}
