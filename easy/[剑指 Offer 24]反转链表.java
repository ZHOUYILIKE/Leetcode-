//定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。 
//
// 
//
// 示例: 
//
// 输入: 1->2->3->4->5->NULL
//输出: 5->4->3->2->1->NULL 
//
// 
//
// 限制： 
//
// 0 <= 节点个数 <= 5000 
//
// 
//
// 注意：本题与主站 206 题相同：https://leetcode-cn.com/problems/reverse-linked-list/ 
// Related Topics 链表 
// 👍 148 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
// 输入: 1->2->3->4->5->NULL
//输出: 5->4->3->2->1->NULL

        if(head==null){
            return head;
        }
        int k = 1,j = 0;
        ListNode fast ,low ,left;
        fast = low = left = head;
        while (fast.next != null){
            k++;
            fast = fast.next;
        }
        int[] nums = new int[k];
        for (j=k-1;j>=0;j--){
            nums[j] = low.val;
            low = low.next;
        }
        for (int i = 0;i<k;i++){
            left.val = nums[i];
            left = left.next;
        }
        return head;


    }
}
//leetcode submit region end(Prohibit modification and deletion)
