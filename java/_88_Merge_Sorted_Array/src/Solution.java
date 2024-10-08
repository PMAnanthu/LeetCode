class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int result[] =new int[m+n];
        int i=0;
        int j=0;
        int k=0;
        while (i<m && j<n){
            if(nums1[i]<nums2[j]){
                result[k]=nums1[i];
                i++;
            }else{
                result[k]=nums2[j];
                j++;
            }
            k++;
        }
        while (i<m){
            result[k]=nums1[i];
            i++;
            k++;
        }
        while (j<n){
            result[k]=nums2[j];
            j++;
            k++;
        }
        for(int z=0;z<m+n;z++){
            nums1[z]=result[z];
        }
    }
}