class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int element = nums[i];
            int lengthOfNum = 0;
            while (element > 0){
                lengthOfNum++;
                element /= 10;
            }
            if(lengthOfNum % 2 == 0){
                count++;
            }
        }
        return count;
    }
}