package validating;

public class Calculator {

    public int factorial(int num) {
        int answer = 1;
        if (num >= 0){
            for (int i = 1; i <= num; i++) {
                answer *= i;
            }
        } else {
            throw new IllegalArgumentException();
        }

        return answer;
    }

    public int binomialCoefficent(int setSize, int subsetSize) {
        if (setSize < 0 || subsetSize < 0 || subsetSize > setSize){
            throw new IllegalArgumentException("subet must be smaller than the set.");
        }

        int numerator = factorial(setSize);
        int denominator = factorial(subsetSize) * factorial(setSize - subsetSize);

        return numerator / denominator;
    }
}
