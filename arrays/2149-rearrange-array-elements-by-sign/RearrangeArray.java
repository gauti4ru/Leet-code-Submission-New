class RearrangeArray {
    public int[] rearrangeArray(int[] nums) {
        int[] rearrange = new int[nums.length];
        int j=0,k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                rearrange[2*j]=nums[i];
                j++;
            }
            else{
                rearrange[2*k+1]=nums[i];
                k++;
            }
        }
        return rearrange;
        
    }
}