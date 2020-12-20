//一个长度为n-1的递增排序数组中的所有数字都是唯一的，并且每个数字都在范围0～n-1之内。在范围0～n-1内的n个数字中有且只有一个数字不在该数组中，请找出
//这个数字。 
//
// 
//
// 示例 1: 
//
// 输入: [0,1,3]
//输出: 2
// 
//
// 示例 2: 
//       [0,1,2,3,4,5,6,7,8]
// 输入: [0,1,2,3,4,6,7,8,9]
//输出: 8 
//
// 限制： 
//
// 1 <= 数组长度 <= 10000 
// Related Topics 数组 二分查找 
// 👍 88 👎 0

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    static int flag = 0;
    public int missingNumber(int[] nums) {

        //读懂题目和例子还有限制非常的重要，题干中提到有序的数组，必然想到二分法求解，
        // 再细读题目和例子，发现数组内的元素和其对应值的规律
        //本题中二分划分的依据是：nums[x]=x,和nums[x]!=x,并且最终的结果是在left上
        //要确定最终的中止条件和返回的而结果，最好就是把例子带进去，一步步清晰算一遍，就知道返回的结果变量是什么样的了
        int left = 0;
        int right = nums.length - 1;
        return function(nums,left,right);
    }
    //       [0,1,2,3,4,5,6,7,8]      9
    // 输入: [0,1,2,3,    [4,6,7,8,9]
    public int function(int[] nums,int left, int right){

        while (left<=right){
            int mid = (right + left)/2;
            if (nums[mid] == mid){
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return left;
    }

}
//leetcode submit region end(Prohibit modification and deletion)
