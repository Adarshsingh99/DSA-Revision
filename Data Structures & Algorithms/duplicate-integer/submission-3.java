class Solution {
    public boolean hasDuplicate(int[] nums) {
     HashMap<Integer,Integer>map = new HashMap<>();
     for(int x : nums)
     {
        map.put(x,map.getOrDefault(x,0)+1);
     }
     // access all key
     for(int key : map.keySet())
     {
        if(map.get(key)>1) return true;
     }
     return false;
    }

}