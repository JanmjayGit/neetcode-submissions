class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = firstPosition(nums, target);
        int last = lastPosition(nums, target);

        if(first == -1){
            return new int []{-1, -1};
        }
        if(last == -1){
            return new int []{-1, -1};
        }
        return new int []{first, last};
    }

    public int firstPosition(int [] nums, int target){
        // if target found search left array
        int left = 0;
        int right = nums.length - 1;
        int firstIdx = -1;

        while(left <= right){
            int mid = left + (right - left)/2;

            if(nums[mid] == target){
                firstIdx = mid;
                right = mid - 1;
            }else if(target > nums[mid]){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return firstIdx;
    }

    public int lastPosition(int [] nums, int target){
        // if traget found search on the right array
        int left = 0;
        int right = nums.length - 1;
        int lastIdx = -1;

        while(left <= right){
            int mid = left + (right - left)/2;

            if(nums[mid] == target){
                lastIdx = mid;
                left = mid + 1;
            }else if(target < nums[mid]){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return lastIdx;
    }
}