class Solution {
    public int[] runningSum(int[] nums) {
        
        
        // time : O(n) space : O(1) 
        int len = nums.length;
        int currSum=0;
        for(int i=0;i<len;i++){
            currSum += nums[i];
            nums[i] = currSum;
        }
        
        return nums;
        
        //time : O(n) space : O(n) 
        // using another array store the ansinto that array
    }
}
