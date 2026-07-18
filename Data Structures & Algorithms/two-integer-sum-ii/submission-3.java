class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // same approach that i use in two sum
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = numbers.length;
        for(int i=0;i<n;i++)
        {
          map.put(numbers[i],i);
        }
        int ans [] = new int[2];
        for(int i=0;i<n;i++)
        {
          int key = target-numbers[i];
          if(map.containsKey(key))
          {
            ans[0]= i+1;
            ans[1] = map.get(key)+1;
          }
        }
        Arrays.sort(ans);
        return ans;
    }
}
