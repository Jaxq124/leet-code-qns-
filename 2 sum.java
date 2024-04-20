import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); // Key: Number, Value: Index
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                result[0] = map.get(complement);
                result[1] = i;
                return result;
            }
            map.put(nums[i], i);
        }

        return result; // In case no solution is found
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] indices = solution.twoSum(nums, target);

        if (indices[0] != 0 && indices[1] != 0) {
            System.out.println("Indices: " + indices[0] + " " + indices[1]);
            System.out.println("Numbers: " + nums[indices[0]] + " " + nums[indices[1]]);
        } else {
            System.out.println("No solution found.");
        }
    }
}
