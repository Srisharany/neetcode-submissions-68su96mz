

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // count frequency
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int[] res = new int[k];

        
        for (int i = 0; i < k; i++) {

            int maxKey = 0;
            int maxFreq = 0;

            ArrayList<Integer> keys = new ArrayList<>(map.keySet());

            
            for (int j = 0; j < keys.size(); j++) {
                int key = keys.get(j);

                if (map.get(key) > maxFreq) {
                    maxFreq = map.get(key);
                    maxKey = key;
                }
            }

            res[i] = maxKey;

            
            map.remove(maxKey);
        }

        return res;
    }
}