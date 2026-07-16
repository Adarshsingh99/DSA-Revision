class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x : nums)
        {
            map.put(x,map.getOrDefault(x,0)+1);
        }

       ArrayList<int[]>arr = new ArrayList<>();  // {[],[],[]} like this
       for(Map.Entry<Integer, Integer> entry : map.entrySet())
       {
            arr.add(new int[]{entry.getKey(),entry.getValue()});
       }
       
       Collections.sort(arr,(a,b)->Integer.compare(b[1],a[1]));  // sort in desc


       int [] res = new int[k];
       for(int i=0;i<k;i++)
       {
         res[i] = arr.get(i)[0];
       }

    return res;

    }
}
