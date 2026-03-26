import java.util.*;

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            boolean div3 = isDivisible(i, 3);
            boolean div5 = isDivisible(i, 5);

            if (div3 && div5) {
                result.add("FizzBuzz");
            } else if (div3) {
                result.add("Fizz");
            } else if (div5) {
                result.add("Buzz");
            } else {
                result.add(String.valueOf(i));
            }
        }

        return result;
    }
    private boolean isDivisible(int num, int d) {
        while (num > 0) {
            num -= d;
        }
        return num == 0;
    }
}