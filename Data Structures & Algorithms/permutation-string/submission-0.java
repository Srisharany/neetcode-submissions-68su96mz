class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] arr=s1.toCharArray();
        Arrays.sort(arr);
        boolean res=false;

        for(int i=0;i<=s2.length()-s1.length();i++)
        {
            String str=s2.substring(i,i+s1.length());
            char arr1[]=str.toCharArray();
            Arrays.sort(arr1);

            if(Arrays.equals(arr,arr1))
            {
                res=true;
                break;
            }
        }
        return res;
    }
}
