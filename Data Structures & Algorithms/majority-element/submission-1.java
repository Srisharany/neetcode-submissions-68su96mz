

class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
        }
        
        int max = 0;
        int result = nums[0];
        
        ArrayList<Integer> keys = new ArrayList<>(map.keySet());
        
        for(int i = 0; i < keys.size(); i++)
        {
            int key = keys.get(i);
            int value = map.get(key);
            
            if(value > max)
            {
                max = value;
                result = key;
            }
        }
        
        return result;
    }
}