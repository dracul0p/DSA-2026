class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int arr[] = new int[2*n];
        //    n=3
        for(int i = 0 ; i < n; i++){
            arr[i] = nums[i];
        }
        for(int i = 0; i <  n; i++){
            arr[n + i] = nums[i];
        }
        return arr;

    }
}