package Algorithm;

import java.util.ArrayList;

/**
* 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那两个整数，并返回它们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
*
* @author HH
* @date 2022/4/20
*/
public class twoSum_1 {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
//        int[] result = solution1(nums, target);
        int[] result = solution2(nums, target);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    //暴力解法
    public static int[] solution1(int[] nums, int target) {
        int[] res = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    res[0]=i;
                    res[1]=j;
                    break;
                }
            }
        }
        return res;
    }

    //ArrayList解法
    public static int[] solution2(int[] nums, int target) {
        int[] res = new int[2];
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            if(list.contains(nums[i])){
                res[0]=list.indexOf(nums[i]);
                res[1]=i;
            }
            list.add(target-nums[i]);
        }
        return res;
    }
}
