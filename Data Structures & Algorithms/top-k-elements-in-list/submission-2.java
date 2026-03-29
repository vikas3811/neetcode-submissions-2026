class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int ele:nums){
            hm.put(ele,hm.getOrDefault(ele,0)+1);
        }

        List<Integer> list=new ArrayList<>(hm.keySet());

        list.sort((a,b)->hm.get(b)-hm.get(a));

        int[] ans=new int[k];

        for(int i=0;i<k;i++){
            ans[i]=list.get(i);
        }

        return ans;
    }
}
