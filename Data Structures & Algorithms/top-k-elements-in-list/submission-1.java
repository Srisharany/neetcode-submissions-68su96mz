

class Solution {
    public int[] topKFrequent(int[] nums, int k) 
    {
        int n = nums.length;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            else
            {
                map.put(nums[i], 1);
            }
        }

        ArrayList<Integer> list = new ArrayList<>(map.keySet());

        Collections.sort(list, (a,b) -> map.get(b) - map.get(a));

        int res[] = new int[k];

        for(int i = 0; i < k; i++)
        {
            res[i] = list.get(i);
        }

        return res;
    }
}