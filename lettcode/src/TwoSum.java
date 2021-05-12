import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> tmp = new HashMap<>();
        for (int i=0; i< nums.length; i++) {
            tmp.put(nums[i], i);
        }
        for (int i= 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (tmp.containsKey(diff) && tmp.get(diff) != i) {
                return new int[] {i, tmp.get(diff)};
            }
        }
        return null;
    }

    public static void main(String[] args) {
        TwoSum problem = new TwoSum();
        int[] nums = {2,7,11,15};
        int[] result = problem.twoSum(nums, 9);
        System.out.println(result[0]+", "+result[1]);

        int[] nums1 = {3,2,3};
        int[] result1 = problem.twoSum(nums1, 6);
        System.out.println(result1[0]+", "+result1[1]);
    }
}
