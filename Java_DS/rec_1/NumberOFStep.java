package rec_1;

public class NumberOFStep {

    public static void main(String[] args) {
        int num = 41;

        System.out.println(numberOFStep(num));
    }

    static int numberOFStep(int num) {
        return helper(num, 0);

    }

    /*
     * We use helper function whenever we have to use in function call
     * And we use only if in function call when it pass as argument
     */
    static int helper(int num, int steps) {
        if (num == 0) {
            return steps;
        }

        if (num % 2 == 0) {
            return helper(num / 2, steps + 1);
        }

        return helper(num - 1, steps + 1);
    }
}