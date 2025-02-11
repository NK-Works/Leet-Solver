class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = firstMost(nums, target, 0, nums.length - 1);
        int last = lastMost(nums, target, 0, nums.length - 1);
        return new int[]{first, last};
    }

    public int firstMost(int[] nums, int target, int left, int right) {
        if (left > right) return -1;
        int mid = left + (right - left) / 2;

        if (nums[mid] == target) {
            int first = firstMost(nums, target, left, mid - 1);
            if (first == -1) {
                return mid;
            }
            return first;
        } else if (nums[mid] < target) {
            return firstMost(nums, target, mid + 1, right);
        } else {
            return firstMost(nums, target, left, mid - 1);
        }
    }
    
    public int lastMost(int[] nums, int target, int left, int right) {
        if (left > right) return -1;

        int mid = left + (right - left) / 2;

        if (nums[mid] == target) {
            int last = lastMost(nums, target, mid + 1, right);
            if (last == -1) {
                return mid;
            }
            return last;
        } else if (nums[mid] < target) {
            return lastMost(nums, target, mid + 1, right);
        } else {
            return lastMost(nums, target, left, mid - 1);
        }
    }
}