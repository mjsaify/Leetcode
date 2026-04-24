class Solution {
    public int subtractProductAndSum(int n) {
        int pod = 1;
        int sod = 0;

        while(n != 0){
            int d = n % 10;
            pod *= d;
            sod += d;
            n /= 10;
        }
        return pod - sod;
    }
}