//字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，该函数
//将返回左旋转两位得到的结果"cdefgab"。 
//
// 
//
// 示例 1： 
//
// 输入: s = "abcdefg", k = 2
//输出: "cdefgab"
// 
//
// 示例 2： 
//
// 输入: s = "lrloseumgh", k = 6   10
//输出: "umghlrlose"
// 
//
// 
//
// 限制： 
//
// 
// 1 <= k < s.length <= 10000 
// 
// Related Topics 字符串 
// 👍 70 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reverseLeftWords(String s, int n) {
//方法1可以用遍历，方法2public String substring(int beginIndex, int endIndex)
        //方法1
        //String t="";
        //for (int i = n;i<s.length();i++){
        //    t = t + s.charAt(i);
        //}
        //for (int i = 0;i<n;i++){
        //    t = t + s.charAt(i);
        //}
        //
        //    return t;
        //方法2：
        //sbustring() 从beginIndex开始取，到endIndex结束，从0开始数，其中不包括endIndex位置的字符
        return s.substring(n,s.length())+s.substring(0,n);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
