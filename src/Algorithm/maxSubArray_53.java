package Algorithm;
/**
* 给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 * 子数组 是数组中的一个连续部分。
*
* @author HH
* @date 2022/4/27
*/
public class maxSubArray_53 {
    public static void main(String[] args) {
        int[] nums = new int[]{-2, 1, -3, -2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(solution(nums));
    }

    public static int solution(int[] nums) {
        int res = nums[0];
        int sum = 0;
        for (int num : nums) {
            if (sum > 0)
                sum += num;
            else
                sum = num;
            res = Math.max(res, sum);
        }
        return res;
    }
}
