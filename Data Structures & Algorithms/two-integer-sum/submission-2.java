class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0,j=1;

        while(i<nums.length-2){
            int sum=target-nums[i];

            if(nums[j]==sum){
                break;
            }
            else if(nums[j]!=sum && j<nums.length-1){
                j++;
            }
            else if(j==nums.length-1 && i<nums.length-2){
                i++;
                j=i+1;
                sum=0;
            }
        }

        
      if(i>j){ return new int[]{j,i};}

      return new int[]{i,j};
    }
}
