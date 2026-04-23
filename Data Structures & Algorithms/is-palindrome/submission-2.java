class Solution {
    public boolean isPalindrome(String s) 
    {
        s=s.toLowerCase();
        s=s.replace(" ","");
        int r=0;
        int l=s.length()-1;
        while(r<l)
        {
            if(r<l && !Character.isLetterOrDigit(s.charAt(r)))
            {
                r++;
            }
            if(r<l && !Character.isLetterOrDigit(s.charAt(l)))
            {
                l--;
            }
            if (s.charAt(r) != s.charAt(l)) {
                return false;
        }


        r++;
        l--;
        
    }
    return true;
}

}
