class Solution {
    public int searchInsert(int[] nums, int target) {
        int left=0;
        int right=nums.length;
        while (left<right){
            int mid=(left+right)/2;
            if(target==nums[mid]){
                return mid;
            }else if(target<nums[mid]){
                right=mid;
            }else if(target>=nums[mid]){
                left=mid;
            }
            if(right-left==1){
                return right;
            }
        }
        return 0;
    }
}