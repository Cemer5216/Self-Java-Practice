package Algorithm;
/**
* 实现strStr()函数。
 *
 * 给你两个字符串haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串出现的第一个位置（下标从 0 开始）。如果不存在，则返回 -1 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/implement-strstr
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
*
* @author HH
* @date 2022/4/25
*/
public class strStr_28 {
    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        System.out.println(solution(haystack, needle));
    }

    public static int solution(String haystack, String needle) {
        if (needle == "")   return 0;
        int i = 0, j = 0;
        while (i < needle.length() && j < haystack.length()){
            char c = needle.charAt(i);
            char ch = haystack.charAt(j);
            if (c == ch){
                i++;
                j++;
            }else {
                j = j - i + 1;
                i = 0;
            }
            if (i == needle.length()){
                return j - i;
            }
        }
        return -1;
    }
}
