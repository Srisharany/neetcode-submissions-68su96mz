class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> ans = new ArrayList<>();
        boolean[] res = new boolean[strs.length];

        for (int i = 0; i < strs.length; i++) {

            if (res[i])
                continue;

            List<String> list = new ArrayList<>();

            char[] a = strs[i].toCharArray();
            Arrays.sort(a);

            list.add(strs[i]);
            res[i] = true;

            for (int j = i + 1; j < strs.length; j++) {

                char[] b = strs[j].toCharArray();
                Arrays.sort(b);

                if (!res[j] && Arrays.equals(a, b)) {
                    list.add(strs[j]);
                    res[j] = true;
                }
            }

            ans.add(list);
        }

        return ans;
    }
}