class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int sum=0, temp=0; int i=0;
        for(int num : nums){
            i++;
            
            if(num==0 ){
            sum= temp>sum ? temp:sum;
                temp=0; 
                continue; 
            }
            temp++;
        }
        return sum>temp?sum:temp;
        
    }
}