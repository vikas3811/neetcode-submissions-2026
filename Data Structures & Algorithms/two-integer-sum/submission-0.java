class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0,j=0;

        for(int x=0;x<nums.length;x++){
            int sum=target-nums[x];
            for(int y=0;y<nums.length;y++){
                if(sum==nums[y]){
                    i=x;
                    j=y;
                    break;
                }
            }
        }
      if(i>j){ return new int[]{j,i};}

        return new int[]{i,j};
    }
}
