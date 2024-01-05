package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Arvind Handa
 *
 * Problem Description:
 *
 * Given an integer array nums and an integer k, return the k most frequent elements.
 * You may return the answer in any order.
 *
 * Example 1:
 *
 * Input: nums = [1,1,1,2,2,3], k = 2
 * Output: [1,2]
 * Example 2:
 *
 * Input: nums = [1], k = 1
 * Output: [1]
 *
 *
 * Constraints:
 *
 *  1 <= nums.length <= 105
 *  -104 <= nums[i] <= 104
 *  k is in the range [1, the number of unique elements in the array].
 *  It is guaranteed that the answer is unique.
 */

public class TopFrequentElement {

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums)
            map.merge(i, 1, Integer::sum);//For Getting Frequency
        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((a, b) -> map.get(b) - map.get(a)); //Sort by Frequency in descending order
        int res[] = new int[k];
        for (int i = 0; i < k; ++i)
            res[i] = list.get(i);
        return res;
    }

    public static void main(String[] args) {
        final int[] nums = {1,1,1,2,2,3};
        final int k = 2;
        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }
}
