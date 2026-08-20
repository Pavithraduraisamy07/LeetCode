import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int prevIndex = map.get(nums[i]);
                if (i - prevIndex <= k) {
                    return true; // Duplicate within distance k found
                }
            }
            map.put(nums[i], i); // Update the latest index
        }
        
        return false; // No duplicate found within distance k
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[] nums1 = {1, 2, 3, 1};
        System.out.println(sol.containsNearbyDuplicate(nums1, 3)); // Output: true
        
        int[] nums2 = {1, 0, 1, 1};
        System.out.println(sol.containsNearbyDuplicate(nums2, 1)); // Output: true
        
        int[] nums3 = {1, 2, 3, 4, 5};
        System.out.println(sol.containsNearbyDuplicate(nums3, 2)); // Output: false
    }
}