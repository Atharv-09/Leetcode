class Solution {
    public int mostWordsFound(String[] sentences) {
        
        
        //time : O(n*m) space:O(1) 
        int max = Integer.MIN_VALUE;
        for(int i=0; i<sentences.length; i++)
        {
            int count = 1;
            for(int j=0; j<sentences[i].length(); j++)
            {
                if(sentences[i].charAt(j) == ' ')
                {
                    count++;
                }
            }
            max = Math.max(max,count);
        }
        return max;
        
        // time: O(n) space : O(1)
        int maxWords= 0;
        for(int i=0;i<sentences.length;i++){
            
            String[] str = sentences[i].split(" ");
            
            maxWords = Math.max(maxWords,str.length);
        }
        
        return maxWords;
    }
}