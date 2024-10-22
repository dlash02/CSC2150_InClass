package Prep;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        // Given an array of integers nums and a target integer target,
        //  return the indices of the two numbers that add up to the target.
        //  Assume that there is exactly one solution,
        //   and you may not use the same element twice.
        // E.g., nums = [2, 7, 11, 15], target = 9
        //        Indices: [0, 1]
        // E.g., nums = [3, 2, 4], target = 6
        //        Indices: [1, 2]
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);
        System.out.printf("\n Indices1:%s Indices2:%s", result[0], result[1]);
    }
        public static int[] twoSum(int[] nums, int target) {
            // Create a HashMap to store the value and its index
            HashMap<Integer, Integer> map = new HashMap<>();

            // Loop through the array
            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];

                // Check if the complement exists in the map
                if (map.containsKey(complement)) {
                    // Return the indices of the complement and the current number
                    return new int[] { map.get(complement), i };
                }
                // Store the current number and its index in the map
                map.put(nums[i], i);
            }

            // If no solution is found (though the problem guarantees one), return null
            throw new IllegalArgumentException("No two sum solution");
        }
    }
