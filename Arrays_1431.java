class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        
        int greatedNoOfCandies = Integer.MIN_VALUE;
        
        for(int i=0;i<candies.length;i++){
            greatedNoOfCandies = Math.max(greatedNoOfCandies,candies[i]);
        }
        
        List<Boolean> res = new ArrayList<>();
        
        for(int i=0;i<candies.length;i++){
            
            if((candies[i]+extraCandies) >= greatedNoOfCandies){
                res.add(true);
            }else{
                res.add(false);
            }
        }
        return res;
    }
}