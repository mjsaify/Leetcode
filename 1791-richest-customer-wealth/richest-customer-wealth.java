class Solution {
    public int maximumWealth(int[][] accounts) {
        int richest = 0;

        for(int i = 0; i < accounts.length; i++){
            int tempWealth = 0;
            for(int j = 0; j < accounts[i].length; j++){
                tempWealth += accounts[i][j];
            }
            if(tempWealth > richest){
                richest = tempWealth;
            }
        }
        return richest;
    }
}