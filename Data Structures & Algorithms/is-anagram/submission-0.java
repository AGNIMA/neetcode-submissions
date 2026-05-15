class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        HashMap<Character,Integer> sValueMap = new HashMap<>();
        HashMap<Character,Integer> tValueMap = new HashMap<>();
        for(char val:s.toCharArray()){
            sValueMap.put(val,sValueMap.getOrDefault(val,0)+1);
        }
        for(char val:t.toCharArray()){
            tValueMap.put(val,tValueMap.getOrDefault(val,0)+1);
        }
        boolean identical = sValueMap.equals(tValueMap);
        return identical;
        }
    }
