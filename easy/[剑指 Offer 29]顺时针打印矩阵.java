//输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。 
//
// 
//
// 示例 1： 
//
// 输入：matrix = [[1,2,3],
//                 [4,5,6],
//                 [7,8,9]]
//输出：[1,2,3,6,9,8,7,4,5]
// 
//
// 示例 2： 
//
// 输入：matrix = [[1,2,3,4],
//                 [5,6,7,8],
//                 [9,10,11,12]]
//输出：[1,2,3,4,8,12,11,10,9,5,6,7]
//
// 限制：
// 0 <= matrix.length <= 100 
// 0 <= matrix[i].length <= 100 
// 
//
// 注意：本题与主站 54 题相同：https://leetcode-cn.com/problems/spiral-matrix/ 
// Related Topics 数组 
// 👍 163 👎 0


import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] spiralOrder(int[][] matrix) {
        //判断数组不为空，防止报错
        if (matrix == null || matrix.length == 0) {
            return new int[0];
        }

        int top = 0, right = matrix[0].length - 1;
        int left = 0, bottom = matrix.length - 1;

        int flag = 0;
        int total = matrix[0].length * matrix.length;
        int[] nums = new int[matrix[0].length * matrix.length];
        int index = 0;
        ok:
        while (left <= right && top <= bottom) {
            //向右移动
            for (int i = left; i <= right; i++) {
                nums[index++] = matrix[top][i];
                flag = flag + 1;
                if (flag == total) {
                    break ok;
                }
            }
            top = top + 1;
            //向下移动
            for (int i = top; i <= bottom; i++) {
                nums[index++] = matrix[i][right];
                flag = flag + 1;
                if (flag == total) {
                    break ok;
                }

            }
            right = right - 1;
            //向左移动
            for (int i = right; i >= left; i--) {
                nums[index++] = matrix[bottom][i];
                flag = flag + 1;
                if (flag == total) {
                    break ok;
                }
            }
            bottom = bottom - 1;
            //向上移动
            for (int i = bottom; i >= top; i--) {
                nums[index++] = matrix[i][left];
                flag = flag + 1;
                if (flag == total) {
                    break ok;
                }
            }
            left = left + 1;
        }

        return nums;

    }
}
//leetcode submit region end(Prohibit modification and deletion)
