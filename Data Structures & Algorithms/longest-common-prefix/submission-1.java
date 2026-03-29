class Solution {
    public String longestCommonPrefix(String[] strs) {
         StringBuilder sb=new StringBuilder();

        String w1=strs[0];

        for(int i=0;i<w1.length();i++){
            char c=w1.charAt(i);
            int count=0;
            for(int j=1;j<strs.length;j++){
                String w=strs[j];
                if(w.length()-1 < i){break;}
                else{
                    char c1=w.charAt(i);
                    if(c1==c){ count++;}
                }

            }

            if(count==strs.length-1){
                sb.append(c);

            }else{
                break;
            }
        }

        return sb.toString();
    }
}