class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int len = accounts.length;
        
        int richPersonWealth = 0;
        for(int i=0;i<len;i++){
            
            int totalMoney = 0;
            for(int j=0;j<accounts[i].length;j++){
                totalMoney += accounts[i][j];
            }
            
            richPersonWealth = Math.max(totalMoney,richPersonWealth);
        }
        
        return richPersonWealth;
        
    }
}
