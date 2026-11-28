class Solution {
    public int characterReplacement(String s, int k) {
        int i = 0;
        int j = 0;
        int max = 0;
        int maxChar = 0;
        int [] count = new int [26];
        
        while(j < s.length()){
            int c = s.charAt(j);

            count[c - 'A'] = count[c - 'A'] + 1; // add char to count array
            maxChar = Math.max(maxChar, count[c - 'A']);

            int operation = (j - i + 1) - maxChar;

            if(operation > k){
                char d = s.charAt(i);
                count[d - 'A'] = count[d - 'A'] - 1;  // remove the char from left 
                i++;
            }
            
            max = Math.max(max, j - i + 1);
            j++;
        }
        return max;
    }
}
