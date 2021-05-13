package calculator;

public class NewCalculator {
    private int power(int a, int b) {
        int res = 1;
        for (int i = 0; i < b; i++) {
            res *= a;
        }
        return res;
    }

    private int divide(int a, int b) {
        return a / b;
    }

    public int calculate(int op1, int op2, char opt) {
        if (opt == '/') {
            return divide(op1, op2);
        } else if (opt == '^') {
            return power(op1, op2);
        }
        return 0;
    }
}