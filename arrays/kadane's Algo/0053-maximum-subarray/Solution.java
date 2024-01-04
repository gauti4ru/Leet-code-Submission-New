//Using Kadane's Algo
class Solution {
    public int maxSubArray(int[] nums) {
    int maxCurrent=nums[0],maxGlobal=nums[0];
        for(int i=1;i<nums.length;i++){
           if(maxCurrent>0){
               maxCurrent=maxCurrent+nums[i];
               }
            else{
                maxCurrent=nums[i];
            }
            maxGlobal=maxCurrent>maxGlobal?maxCurrent:maxGlobal;
        }
        return maxGlobal;
        
    }
}