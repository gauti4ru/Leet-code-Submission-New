class Solution {
    public void rotate(int[] nums, int k) {
        //we are finding remainder here becasue if k(number of rotation) is greater than the length of array then we need to find out its remainder because rotation=number of length will again become the same array
        k=k%nums.length;
        reverse(nums,0,nums.length);
        reverse(nums,0,k);
        reverse(nums,k,nums.length);
        
        
    }
    public void reverse(int[] nums,int left,int right)
    {
        for(int i=left;i<(right+left)/2;i++){
            int temp=nums[i];
            nums[i]=nums[right-1-(i-left)];
            nums[right-1-(i-left)]=temp;
            
        }
    }
}

// copy[n]
// index = (i+k)%n;
// copy[index]=arr[i];
// arr[i]=copy[i];



// 1,2,3,4,5,6,7
// 7 6 5 || 4 3 2 1
// 5 6 7 1 2 3 4 
