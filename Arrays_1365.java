class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        // 1 . using sorting Onlogn 
        // 2 . using nested for loop O(n^2)
        // 3. using priorityqueue space: O(n) time : O(n) 
        
        
        
        // time : O(n^2) space : O(n) 
        int[] ans = new int[nums.length];
        int n = nums.length;
        
        /*for(int i=0;i<nums.length;i++){
            
            int count= 0 ;
            for(int j=0;j<nums.length;j++){
                
                if(nums[i]>nums[j]){
                    count++;
                }
            }
            
            ans[i] = count;
        }*/
        
        // time : O(n) space : O(n)
        
        int arr[] = new int[101];
        
        for(int i=0;i<n;i++){
            arr[nums[i]]++;
        }
        
        for(int i=1;i<101;i++){
            arr[i] += arr[i-1];
        }
        
        int res[] = new int[n];
        for(int i=0;i<n;i++){
            if(nums[i] == 0) res[i] = 0;
            else res[i] = arr[nums[i]-1];
        }
        
        return res;
        
        //  time : O(n) space : O(n)
        
        /*
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0;i<n;i++){
            pq.add(nums[i]);
        }
        
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(pq.peek(),pq.size()-1);
            pq.remove();
        }
        
        for(int i=0;i<n;i++){
            ans[i] = map.get(nums[i]);
        }
        
        
        return ans;
        */
    }
}