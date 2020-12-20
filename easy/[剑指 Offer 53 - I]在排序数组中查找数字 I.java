//统计一个数字在排序数组中出现的次数。 
//
// 
//
// 示例 1: 
//
// 输入: nums = [5,7,7,8,8,10], target = 8
//输出: 2 
//
// 示例 2: 
//
// 输入: nums = [5,7,7,8,8,10], target = 6
//输出: 0 
//
// 
//
// 限制： 
//
// 0 <= 数组长度 <= 50000 
//
// 
//
// 注意：本题与主站 34 题相同（仅返回值不同）：https://leetcode-cn.com/problems/find-first-and-last-
//position-of-element-in-sorted-array/ 
// Related Topics 数组 二分查找 
// 👍 83 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    int count = 0;
    public int search(int[] nums, int target) {

    int left = 0;
    int right = nums.length - 1;
    function(nums,target,left,right);
    return count;
    }

    public void function(int[] nums, int target, int left, int right){
        int mid = (left + right) / 2;

        if (left <= right){
            if (nums[mid] == target){
                count++;
                function(nums,target,left,mid-1);
                function(nums,target,mid+1,right);
            }else if(nums[mid] > target){
                function(nums,target,left,mid-1);
            }else {
                function(nums,target,mid+1,right);
            }
        }


    }

}
//leetcode submit region end(Prohibit modification and deletion)
