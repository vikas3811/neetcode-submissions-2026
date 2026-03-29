class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int i=0,j=0;

        for(int x=0;x<n;x++){
            if(nums[x]==0){
                i++;
            }
             if(nums[x]==1){
                j++;
            }
        }
        int y=0;
        for(int x=0;x<i;x++){
            nums[y++]=0;
        }
        for(int x=0;x<j;x++){
            nums[y++]=1;
        }
        for(int x=0;x<n-(i+j);x++){
            nums[y++]=2;
        }
        
    }
}