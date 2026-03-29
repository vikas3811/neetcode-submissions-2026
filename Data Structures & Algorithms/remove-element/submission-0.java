class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int i=0,j=0;
        int count=0;
        while(j<n){

            if(nums[j]!=val){
                int x=nums[i];
                nums[i]=nums[j];
                nums[j]=x;
                i++;
                j++;
            }else{
                j++;
            }
        }
        for(int y=0;y<n;y++){
            if(nums[y]==val){
                count++;
            }
        }
        return n-count;    
    }
}