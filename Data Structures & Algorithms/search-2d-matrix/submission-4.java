class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int r = matrix.length;
        int c = matrix[0].length;

        int left = 0;
        int right = r * c - 1;

        while(left <= right){
            int mid = left + (right - left)/2;

            int position = matrix[mid/c][mid % c];

            if(position == target){
                return true;
            }else if(position <= target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return false;
    }
}
