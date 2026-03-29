class Solution {
    public boolean isPalindrome(String s) {
        int n=s.length();
        s=s.toLowerCase();
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<n;i++){
            char c=s.charAt(i);

            if(Character.isLetterOrDigit(c)){
                sb.append(c);
            }
        }

        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)!=sb.charAt(sb.length()-i-1)){
                return false;
            }
        }
        return true;
        
    }
}
