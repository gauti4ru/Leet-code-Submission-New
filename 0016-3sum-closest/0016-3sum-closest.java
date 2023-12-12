class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int first,second,third;
        int sum=0;
        sum=nums[0]+nums[1]+nums[2];
        for(int num=0 ;num<nums.length-2;num++){
            int i=num+1,j=num+2;

            while(i<nums.length-1){
                first=nums[num];
                second=nums[i];
                third=nums[j];
                int diff=(target-(first+second+third))<0 ? -(target-(first+second+third)):(target-(first+second+third));
                int previousdiff=sum-target<0 ? -(sum-target):(sum-target);
                sum=previousdiff > diff || (previousdiff == diff && first+second+third>sum) ? first+second+third : sum;
                i=(j==nums.length-1) ? i+1:i;
                j=(j==nums.length-1) ? i+1:j+1;


            }
        }
        return sum;
    }
}