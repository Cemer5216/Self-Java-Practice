package Algorithm;
/**
* 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
*
* @author HH
* @date 2022/4/23
*/
public class longestCommonPrefix_14 {
    public static void main(String[] args) {
        String[] strs = {"abc", "abls", "abkd"};
        System.out.println(solution(strs));
    }

    public static String solution(String[] strs) {
        if(strs.length==0)return "";
        //公共前缀比所有字符串都短，随便选一个先
        String s=strs[0];
        for (String string : strs) {
            while(!string.startsWith(s)){
                if(s.length()==0)return "";
                //公共前缀不匹配就让它变短！
                s=s.substring(0,s.length()-1);
            }
        }
        return s;
    }
}
