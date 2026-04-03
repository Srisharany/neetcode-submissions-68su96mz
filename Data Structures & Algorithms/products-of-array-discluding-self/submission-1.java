class Solution 
{
    public int[] productExceptSelf(int[] nums) 
    {
        int n=nums.length;
        int pro=1;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            pro=pro*nums[i];
        }
        for(int i=0;i<n;i++)
        {
            int mul=1;
            for(int j=0;j<n;j++)
            {
                if(i!=j)
                {
                    mul=mul*nums[j];
                }
                else
                {
                    continue;
                }
               
            }
            a[i]=mul;
            

        }
        return a;
        
        
        
    }
}  
