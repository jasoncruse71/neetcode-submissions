class Solution {
    //does the same letter appear the same number of times in both strings 
    public boolean isAnagram(String s, String t) {
        //if the lengths are diff then they arent anagrams 
        if (s.length() != t.length()) {
            return false;
        }

        //26 characters in the alphabet so 26 spaces, with 0 being A and 25 being Z 
        int[] sCounts = new int[26];
        int[] tCounts = new int[26];

        for (int i = 0; i < s.length(); i++) {
            sCounts[s.charAt(i) - 'a']++;
            tCounts[t.charAt(i) - 'a']++;
        }
        // lengths could be equal but letters do not appear the same number of times 
        for (int i = 0; i < 26; i++) {
            if (sCounts[i] != tCounts[i]) {
                return false;
            }
        }

        return true;
    }
}
