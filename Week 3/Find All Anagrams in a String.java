class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int map [] = new int [128];
        int count = p.length(), slow = 0, fast = 0;

        List<Integer> res = new ArrayList<>();

        for (char c : p.toCharArray()) map[c] ++;

        char Chars [] = s.toCharArray();

        while(fast < Chars.length){
            if(map[Chars[fast++]]-- > 0) count--;

            while(count == 0){
                if(fast - slow == p.length()) res.add(slow);

                if(map[Chars[slow++]]++ == 0) count++;
            }
        }

        return res;
    }
}