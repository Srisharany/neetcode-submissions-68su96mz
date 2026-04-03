class Solution {
    public boolean isPalindrome(String s) 
    {
        s=s.toLowerCase();
        s=s.replace(" ","");
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
            if(i<j && !Character.isLetterOrDigit(s.charAt(i)))
            {
                i++;
            }
            else if(i<j && !Character.isLetterOrDigit(s.charAt(j)))
            {
                j--;
            }
            else
            {
                if(s.charAt(i)!=s.charAt(j))
                {
                    
                    return false;

                }
                i++;
                j--;
            }
        }
        return true;
        
        
    }
}
