class Solution {
    public int findGCD(int[] nums) {
        int mx = nums[0];
        int mn = nums[0];
        for (int i =0; i<nums.length;i++){
            if(mx < nums[i]){
                mx = nums[i];
            }
            if(mn > nums[i]){
                mn = nums[i];
            }
        }
        int gcd = 1;
        for(int i = mn ; i>=1 ; i--){
            if(mn%i == 0 && mx%i == 0){
                gcd = i;
                break;
            }
        }
        return gcd;
    }
}