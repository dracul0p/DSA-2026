class Solution {
    public int[] getConcatenation(int[] nums) {
       int n =  nums.length;
       int x = 2 * n;
        int ans[] = new int[x];
        int i = 0 ;
        for(int j = 0 ; j < x;j++){
            ans[j] = nums[i];
            i++;
            if(i == n){
                i = 0;

            }
            
          
        }
        return ans;
    }

  
}