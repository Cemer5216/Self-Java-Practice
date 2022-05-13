package PublicClass.DemoAray;

/**
 * @Auther: CEMER
 * @Date: 2022/1/19 16:34
 * @Description:
 */
public class DemoArraryTest {
    public static void main(String[] args) {
        /**
         * 定义一个数组其中包含多个数字。用自己的方式最终实现，奇数放在数组的左边，偶数放在数组的右边
         *
         * 针对本题中的数据覆盖问题，有两种解决思路：
         *                                  1.交换目标值，但是会增加工作量，可能出现多次遍历的情况
         *                                  2.创建新的数组用来接收变化量
         */
        int[] abc = {1,2,3,4,5,6};
        int[] ji = new int[3];
        int[] ou = new int[3];
        int x = 0;
        int y = 0;
        //需要遍历数组
        for (int i = 0; i < abc.length; i++) {
            //把符合条件的数放到对应数组中
            if (abc[i] % 2 == 0) {
                //偶数组的值 = 源数组的值
                ou[x] = abc[i];
                x++;
            } else {
                //奇数组的值 = 源数组的值
                ji[y] = abc[i];
                y++;
            }
        }

        //合并数组
        for (int l = 0; l < abc.length; l++) {
            //分别读取奇偶数组，然后放到源数组中
            for (int i = 0; i < ji.length; i++) {
                abc[l] = ji[i];
                l++;
            }
            for (int i = 0; i < ou.length; i++) {
                abc[l] = ou[i];
                l++;
            }
        }

        //遍历展示
//        for (int j = 0; j < ji.length; j++) {
//            System.out.println(ji[j]);
//        }
//        System.out.println("------------------");
//        for (int k = 0; k < ou.length; k++) {
//            System.out.println(ou[k]);
//        }
        for (int i = 0; i < abc.length; i++) {
            System.out.println(abc[i]);
        }
    }
}
