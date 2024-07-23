class MajorityElement {
    public int majorityElement(int[] nums) {
        int count = 0, i = 0, maxcount = 0, majorElement = 0;
        while(i <= nums.length / 2) {
            for(int j = i; j < nums.length; j++) {
                if(nums[i] == nums[j])
                    count++;
            }
            majorElement = maxcount < count ? nums[i] : majorElement;
            maxcount = maxcount < count ? count : maxcount;
            i++;
            count = 0;
        }
        return nums.length == 1 ? nums[0] : majorElement;
    }
}





/*
#Boyer-Morre Majority Algorithm
class ReverseLinkedList {
    public int majorityElement(int[] nums) {
        int  vote=0;
        int candidate=0;
        int count=0;
        for(int num : nums){
            if(vote==0) {
            candidate=num;
            vote++;
            }
            else{
                if(num==candidate) vote++;
                else vote--;
            }
        }
        
        for(int num :nums){
            if(num==candidate) count++;
        }
        return count>nums.length/2 ? candidate :-1;
        
}
}

*/

/*
#ReverseLinkedList using Sort method of Arrays class
class ReverseLinkedList {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}

*/