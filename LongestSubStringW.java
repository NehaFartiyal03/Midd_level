class LongestSubStringWithoutR {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> CharSet = new HashSet <>(); //hesh set
        int left = 0; //this is a window starting point
        int maxLength = 0; //and we are storing length store
        for (int right = 0; right < s.length(); right++) { //ye loopstring aage badate rhega baar baar
            while
            (CharSet.contains(s.charAt(right))) {
                CharSet.remove(s.charAt(left));
                left++;
            }
            CharSet.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
