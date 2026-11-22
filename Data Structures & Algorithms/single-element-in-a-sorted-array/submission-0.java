class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;

        int left = 0;
        int right = n - 1;

        while(left < right){
            int mid = left + (right - left)/2;
            int countLeft = mid - left + 1;
            int countRight = right - mid + 1;

            if(nums[mid] == nums[mid - 1]){
                if(countLeft % 2 == 1){
                    right = mid - 2;
                }else{
                    left = mid + 1;
                }
            }
            else if(nums[mid] == nums[mid + 1]){
                if(countRight % 2 == 1){
                    left = mid + 2;
                }else{
                    right = mid - 1;
                }
            }else{
                return nums[mid];
            }
        }
        return nums[left];
    }
}