class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        // merge .
        // sort 
        // find midian
      int size = nums1.length + nums2.length;
      int arr[] = new int[size];
      int i=0;
      int j=0;
      int k=0;
      while(i<nums1.length && j < nums2.length)
      {
       
       if(nums1[i]<=nums2[j])
       {
         arr[k]= nums1[i];
         i++;
       }
       else
       {
          arr[k] = nums2[j];
          j++;
       }
       k++;

      } 

     while(i<nums1.length)
     {
        arr[k] = nums1[i];
        k++;
        i++;
     }
     while(j<nums2.length)
     {
         arr[k] = nums2[j];
         j++;
         k++;
     }

     for(int x : arr)
     {
        System.out.println(x+" ");
     }
     
     double ans =0;
     if ((arr.length)%2==1)
     {
       int mid = arr.length/2;
       ans = arr[mid];
     }
     else
     {
       int a = arr.length/2;
       int b = (arr.length-1)/2;
       double mid = (double)(arr[a]+arr[b])/2;
       ans = mid;
       
     }
    return ans;
    }
}
