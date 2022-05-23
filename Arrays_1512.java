class Solution {
    public int find(int currCount){
            int oddCount = (currCount/2)*currCount;
                if(currCount%2==0){
                    int currCount1 =currCount-1;
                    int oddCountPrev = (currCount1/2)*currCount1;
                    int evenCount = oddCountPrev+currCount-1;
                    // System.out.println(evenCount);
                    return evenCount;
                }else{
                    // System.out.println(oddCount);
                    return oddCount;
                }
    }
    
    public int numIdenticalPairs(int[] nums) {
        
        // 1. time : O(n^2) space : O(1) 
        
        
        
        int goodPairCount=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
              
                if(nums[i]==nums[j]){
                    goodPairCount++;
                }
            }
        }
        
        return goodPairCount;
        
        
        
        
        // 2. time :O(nlogn) space : O(1)
        
        
        
        // if the count of the number is odd then simply 
        // oddCount = (countOfNumber/2)*countOfNumber;
        //if count of anynumber is odd i.e if there are 7 times 1 so we can make their pair
        //  = (7/2)*7 = 21 pairs we can make 
        
        // if count of anynumber is even i.e if there are 6 times 1 so we can make their pair 
        // count of prevNumber i.e 5 which can be find by above method((5/2)*5 = 10)
        // adding = 10 + countOfNumber-1 = 15 
        
        
        
        Arrays.sort(nums);
                
        int prev=nums[0];
        int currCount =1;
        int totalCount = 0;
        
        for(int i=1;i<nums.length;i++){
            
            if(prev==nums[i]){
                currCount++;
            }else{
                
                totalCount += find(currCount);                
                currCount=1;
                prev=nums[i];
            }
        }
        // thi below was for the array last elements if they are repeating then we make their count and find by our logic 
        totalCount += find(currCount);
        
        
        return totalCount;


        // 3. time : O(n) space : O(n) 


        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        
        int totalPairs = 0;
        for(Integer key:map.keySet()){
            
            int val = map.get(key);
            int count = val*(val-1)/2;
            
            totalPairs += count;
        }
        
        return totalPairs;
    }
    
}