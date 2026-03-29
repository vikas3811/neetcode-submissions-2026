class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        boolean[] check=new boolean[strs.length];

        for(int i=0;i<strs.length;i++){
            if(check[i]) continue;   // IMPORTANT

            List<String> l=new ArrayList<>();
            l.add(strs[i]);
            check[i]=true;

            char[] ch_1=strs[i].toCharArray();

            Arrays.sort(ch_1);

            for(int j=i+1;j<strs.length;j++){
                 if(check[j]) continue;   // IMPORTANT

                char[] ch_2=strs[j].toCharArray();

                Arrays.sort(ch_2);

                  if(Arrays.equals(ch_1,ch_2)){
                    l.add(strs[j]);
                    check[j]=true;
                  }
            }
            
            ans.add(l);
        }

        return ans;
        
        
    }
}
