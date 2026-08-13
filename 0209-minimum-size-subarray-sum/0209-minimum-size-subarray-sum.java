class Solution {
    public int minSubArrayLen(int target, int[] nums) {
     /*   Arrays.sort(nums);
        int min=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                   if(nums[i]+nums[j]==target){
                    nums[i]=0;
                    nums[j]=1;
                   }
                  // int min=Integer.MAX_VALUE();
                   min+=nums[i+j];
                   return min;
            }
        }
        return 0;
        */
       int left=0;
       int sum=0;
       int min=Integer.MAX_VALUE;
       for(int right=0;right<nums.length;right++){
        sum+=nums[right];
       while(sum>=target){
        min=Math.min(min,right-left+1);
        sum-=nums[left];
        left++;
       }
       }
      if(min == Integer.MAX_VALUE) return 0;
       return min;
    }
}