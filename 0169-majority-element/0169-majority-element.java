import java.util.HashMap;
import java.util.Map;

class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int num : nums) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }
        int n = nums.length;
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            if (entry.getValue() > n / 2) {
                return entry.getKey();
            }
        }
        return -1;
    }
}