class Solution {
    int count=0;
    public int removeDuplicates(int[] nums) {

        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==Integer.MAX_VALUE) break;

            if(nums[i]==nums[i+1]){
                nums[i+1]=Integer.MAX_VALUE;
                shiftArray(nums,i+1);
                i--;
            }
        }
        System.out.println(Arrays.toString(nums));
        return nums.length-count;

    }


    public void shiftArray(int[] nums,int j)
    {
        count++;
        for(int i=j;i<nums.length-1;i++){
            int temp= nums[i];
            nums[i]=nums[i+1];
            nums[i+1]=temp;

        }
    }

    //More Optimised solution using pointer
    /*

  public int removeDuplicates(int[] nums) {
        int len = nums.length;

        int left = 0;
        int right = 1;

        while (right < len) {
            if (nums[right] > nums[left]) {
                left++;
                nums[left] = nums[right];
            }

            right++;
        }

        return left + 1;
    }
    */
}
