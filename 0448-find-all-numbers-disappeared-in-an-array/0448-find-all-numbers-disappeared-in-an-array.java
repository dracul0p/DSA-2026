class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int freq[] = new int[nums.length+1];
        List<Integer> l = new ArrayList<>();

        for(int x : nums){
           freq[x]++;
        }
        for(int i = 1; i < freq.length ; i++){
            if(freq[i] == 0){
               l.add(i);
            }
        }

        System.out.println(Arrays.toString(freq));

        return l;
    }
}