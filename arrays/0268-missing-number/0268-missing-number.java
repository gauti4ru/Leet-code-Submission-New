class Solution {
    public int missingNumber(int[] nums) {
        int sum1=0;
        for(int num : nums) sum1=num+sum1;
        return (nums.length*(nums.length+1)/2)-sum1;
        
    }
}