//First Solution is based on sorting the array and then. finding the consecutive numbers.
import java.util.Arrays;
class Solution {
    public int longestConsecutive(int[] nums) {
         Arrays.sort(nums);
        int count=0;
        int temp=nums.length==0?0:1;
        for(int i=1;i<nums.length;i++){

            if(nums[i]-nums[i-1]==1){
                temp++;
            }
            else if(nums[i]-nums[i-1]==0) { continue;}
            else {
                count = temp > count ? temp : count;
                temp=1;
            }
        }
        return temp>count?temp:count;
    }
    
    public void insertionSort(int[] nums){
        for(int i=1;i<nums.length;i++){
            int j=i-1;
            while(j>=0){
                if(nums[j]>nums[i]){
                    int temp=nums[j];
                    nums[j]=nums[i];
                    nums[i]=temp;
                    i=j;
                    }
                else break;
                j--;
            }
        }
    }
}