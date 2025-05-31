class FindFirstLastP {
    public int[] searchRange(int[] nums, int target) {
        int first = findIndex(nums , target, true);
        int last = findIndex(nums , target, false);
        return new int[]{first , last};
    }
    public int findIndex(int[]nums , int target, boolean isFirst){
        int left = 0 , right = nums.length - 1;
        int index = -1;

        while(left <= right) {
            int mid = left + (right - left)/2;
            if(nums[mid] == target) {
                index = mid;
                if(isFirst){
                    right = mid - 1;
                }else {
                    left = mid + 1;
                }
            }else if (nums[mid] < target){
                left = mid + 1;
            } else {
                right = mid -1;
            }
        }
            return index;
        
    }
}
