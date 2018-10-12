package exercices.fibonacci;

public class Fibonacci {

    // Your code returning sum of terms
    public long evenFibonacci(long max) {

        if (max < 2)
            return 0;

        long tmpA = 0;
        long tmpB = 2;
        long solution = tmpA + tmpB;

        while (tmpB <= max) {
            long tmpC = 4 * tmpB + tmpA;

            if (tmpC > max)
                break;

            tmpA = tmpB;
            tmpB = tmpC;
            solution += tmpB;
        }

        return solution;
    }
}
