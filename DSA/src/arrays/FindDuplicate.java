package arrays;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Arvind Handa
 *
 * Problem Description:
 *
 * Given an integer array nums, return true if any value appears at least twice in the array,
 * and return false if every element is distinct.
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,1]
 * Output: true
 *
 * Example 2:
 *
 * Input: nums = [1,2,3,4]
 * Output: false
 */
public class FindDuplicate {

    private static boolean containsDuplicate(int[] nums){
        final Set<Integer> uniqueNumberSet = new HashSet<>();

        for (int i = 0 ; i < nums.length ; i++) {
            if (uniqueNumberSet.contains(nums[i])) {
                return true;
            }
            uniqueNumberSet.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        final boolean result = containsDuplicate(new int[] {1,2,3,1});
        if (result) {
            System.out.println("Duplicate element present in array.");
        } else {
            System.out.println("No duplicate element found in array.");
        }
    }
}
