class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        
        // time : O(2n) space : O(2*n)
        int pointer1 = 0;
        int pointer2 = n;
        int shuffled[] = new int[2*n];
        
        for(int i=0;i<2*n;){
            shuffled[i++] = nums[pointer1++];
            shuffled[i++] = nums[pointer2++];
        }
        
        return shuffled;
        
        // time : O(2*n) space : O(2*n)
        int[] res = new int[2*n];
        int k = 0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                res[i] = nums[k++];
            }else{
                res[i] = nums[k+n-1];
            }
        }
        return res;

        //time : O(n) space : O(2*n)
        int temp[]=new int[nums.length];
        int x=0;
        for(int i=0;i<n;i++) {
            temp[x++]=nums[i];
            temp[x++]=nums[i+n];
        }
        
        return temp;

        // time :O(n) space : O(2n)
        int[] temp = new int[2*n];
        temp[0] = nums[0];
        temp[1] = nums[n];
        for(int i=1;i<n;i++){        
            temp[2*i] = nums[i];
            temp[2*i+1] = nums[n+i]; 
        }
        return temp;
    }
}