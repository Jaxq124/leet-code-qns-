import java.util.Scanner;

class Solution {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }

        int left = 1;
        int right = x;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (mid <= x / mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return right;
    }

    public static void main(String[] args) {
        int a;
        int re;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input:\n");
        a = scanner.nextInt();
        Solution obj = new Solution();
        re = obj.mySqrt(a);
        System.out.println("Output: " + re);
    }
}
