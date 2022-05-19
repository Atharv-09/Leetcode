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
        
        /*//time :O(n) space : O(1) 
        int len = nums.length;
        for(int i=0;i<len;i++){
            nums[i] = len*(nums[nums[i]]%len)+nums[i];
        }
        
        for(int i=0;i<len;i++){
            nums[i] = nums[i]/len;
        }
        
        return nums;
    	*/

	//time : O(n) space : O(1) 
	  //nums = {0,2,1,5,3,4}
        //Multiply each ele of array with array len
        //nums = {0,12,6,30,18,24}
        for(int i = 0; i < nums.length; i++){
            nums[i] = nums[i]*nums.length;
        }
        
        //Now add Target number to the product
        //nums = {0,13,8,34,23,27}
        for(int i = 0; i < nums.length; i++){
            nums[i] += nums[nums[i]/nums.length]/nums.length;
        }
        
        //Take mod by array length for eact alement
        //nums = {0,1,2,4,5,3}
        for(int i = 0; i < nums.length; i++){
            nums[i] = nums[i]%nums.length;
        }
        
        return nums;
    }
}
