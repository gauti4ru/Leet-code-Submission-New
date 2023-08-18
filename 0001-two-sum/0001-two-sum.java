class Solution {
    public int[] twoSum(int[] nums, int target) {
        int obj[] = new int[2];
        for(int i=0;i<nums.length;i++)
        {
             
            if(i==nums.length)
            {
                break;
            }
     else 
        {
            for(int j=i+1; j<nums.length;j++)
            {
               if(nums[i]+nums[j]==target)
               {
                   obj[0]=i;
                   obj[1]=j;
                   break;
               }
            }
        }
        } 
        return obj;
    }
}