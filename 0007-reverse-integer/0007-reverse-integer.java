public class Solution {
    public int reverse(int x) {
        // Define the range for a 32-bit signed integer
        int INT32_MIN = Integer.MIN_VALUE;
        int INT32_MAX = Integer.MAX_VALUE;

        // Initialize result to 0
        int result = 0;

        // Handle the sign of the input using if-else
        int sign;
        if (x >= 0) {
            sign = 1;
        } else {
            sign = -1;
        }

        x = Math.abs(x);

        // Reverse the digits
        while (x != 0) {
            int digit = x % 10;
            x /= 10;

            // Check for overflow
            if (result > (INT32_MAX - digit) / 10) {
                return 0;
            }

            result = result * 10 + digit;
        }

        // Restore the sign
        result *= sign;

        // Check for overflow after restoring the sign
        if (result < INT32_MIN || result > INT32_MAX) {
            return 0;
        }

        return result;
    }

    public static void main(String[] args) {
        // Example usage:
        int x = 123;
        Solution solution = new Solution();
        int result = solution.reverse(x);
        System.out.println(result);
    }
}
