class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        int i=0;
        int j=0;
        int k =0;
        int prev =0;
        int curr = 0;
        while(i<nums1.length || j < nums2.length)
        {
            prev = curr;
            if(j==nums2.length || i < nums1.length && nums1[i]<=nums2[j])
            {
                curr = nums1[i++];
                
            }
            else
            {
                curr = nums2[j++];
                
            }

            if(k == n/2)
            {
                if(n%2==1)
                return curr;
                else
                {
                  return (prev+curr)/2.0;
                }
            }
            k++;

        }
        return -1;
    }
}
