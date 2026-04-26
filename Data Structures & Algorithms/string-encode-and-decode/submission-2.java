
class Solution{

    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < strs.size(); i++) {
            String s = strs.get(i);
            res.append(s.length()).append('#').append(s);
        }

        return res.toString();
    }

    public List<String> decode(String s) {
        List<String> res = new ArrayList<>();

        int i = 0;

        while (i < s.length()) {
            int j = i;

            while (s.charAt(j) != '#') {
                j++;
            }

            int len = Integer.parseInt(s.substring(i, j));
            j++;

            res.add(s.substring(j, j + len));

            i = j + len;
        }

        return res;
    }
}