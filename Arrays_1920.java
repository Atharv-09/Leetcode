class Solution {
    public int[] buildArray(int[] nums) {
        
        //O(n) time and space 
        /*int len = nums.length;
        int[] ans = new int[len];
        
        for(int i=0;i<len;i++){
            ans[i] = nums[nums[i]];
        }
        
        return ans;
        */
        
        
        //time : O(logn) space : O(n) 
        /*int lef = 0;
        int rig = nums.length-1;
        int ans[] = new int[rig+1];
        
        while(lef<=rig){
            ans[lef] = nums[nums[lef++]];
            ans[rig] = nums[nums[rig--]];
        }
        
        return ans;*/
        
        //time :O(n) space : O(1) 
        int len = nums.length;
        for(int i=0;i<len;i++){
            nums[i] = len*(nums[nums[i]]%len)+nums[i];
        }
        
        for(int i=0;i<len;i++){
            nums[i] = nums[i]/len;
        }
        
        return nums;
    }
}
