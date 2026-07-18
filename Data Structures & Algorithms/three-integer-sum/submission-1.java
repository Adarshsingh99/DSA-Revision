class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> ans = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            HashMap<Integer, Integer> map = new HashMap<>();

            for (int j = i + 1; j < nums.length; j++) {

                int third = -(nums[i] + nums[j]);

                if (map.containsKey(third)) {

                    List<Integer> temp = Arrays.asList(nums[i], nums[j], third);
                    Collections.sort(temp); 
                    ans.add(temp);
                }

                map.put(nums[j], j);
            }
        }

        return new ArrayList<>(ans);
    }
}