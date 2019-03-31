package offer;

public class Q11 {
    public int minNumberInRotateArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int l = 0, h =nums.length - 1;
        while (l < h) {
            int m = l + (h - l) / 2;
            if (nums[m] <= nums[h]) {
                h = m;
            } else {
                l = m + 1;
            }
        }
        return nums[l];
    }
}