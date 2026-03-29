class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int i=0,j=n-1;

        while(i<n-1){

            if(nums[i] > nums[j]){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
            else if(i < n-1 && j==i){
                i++;
                j=n;
            }
            j--;
        }
       
        
    }
}