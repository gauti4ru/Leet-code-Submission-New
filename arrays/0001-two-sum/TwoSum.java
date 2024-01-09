class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int i = 0, j = 0;
        for(i = 0; i < nums.length - 1; i++) {
            for(j = i + 1; j < nums.length - 1; j++) {
                if(nums[i] + nums[j] == target)
                    break;
            }
            if(nums[i] + nums[j] == target)
                break;
        }
        return new int[]{i, j};
    }
}