package PublicClass.DemoAray;

/**
 * @Auther: CEMER
 * @Date: 2022/1/13 17:55
 * @Description:
 */
public class DemoArrary {
    public static void main(String[] args) {

        /**
         * 什么是数组？
         * -数组就是存储数据长度固定的容器，要求保证多个数据的数据类型要一致
         *
         * 什么是容器？
         * -容器是将多个数据存储到一起，每个数据称为该容器的元素
         * 可以类比生活中的容器，比如水杯、教室
         *
         * 数组可以存储的数据类型？
         * -基本数据类型（byte,char,int,short,long,float,double,boolean）
         * -引用数据类型(String)
         * -自定义的各种类
         * 换句话说，数组可以存储所有数据类型
        * */

        /**
         * Java数组分为定义和初始化两部分
         *
         * -区别于C语言的定义
         *  C语言可以直接定义，包含数组长度
         *   int arr[3];
         *
         * -Java的数组定义有两种定义方式
         * --数据类型[] 数组名字;
         * --数据类型 数组名字[];
        * */
        int[] arr;
        int arr0[];

        /**
         * 数组的定义和初始化是可以分开的
         *
         * 数组的三种初始化
         * 一种动态初始化
         * 两种静态初始化
        * */

        arr = new int[3];//动态初始化
        arr = new int[]{1, 2, 3};//静态初始化标准格式
        int[] arr1 = {1, 2, 3, 4};//静态初始化简化格式

//        int arr2[] = new int[3];//数组的动态初始化
//        arr2[0] = 1;
//        arr2[1] = 2;
//        arr2[2] = 3;
//        arr2[3] = 4;
//        arr2[4] = 5;
//        for (int i = 0; i < arr2.length; i++) {
//            System.out.println(arr2[i]);
//        }



        int arr3[] = new int[]{1, 2, 3, 4};
        int arr4[] = {1, 2, 3, 4};

        /**
         * 数组的访问--分为"存储"和"读取"两部分
         *
         * 引入概念：数组下标（索引）
         *         每一个存储到数组的元素，都会自动的拥有一个编号，从0开始，这个自动编号称为数组索引
         *         数组下标就是 计算机读取数据元素 顺序 的 可视化表现
         *         我们可以通过数组的索引访问到数组中的元素
         * 访问格式：数组名字[数组下标]
         *
         * 数组的长度属性：
         *              每个数组都具有长度，而且是固定的
         *              Java中赋予数组一个属性，可以获取到数组的长度，语句为：数组名字.length
         *              结合数组下标从0开始，可以推断出，数组的最大索引值为：数组名字.length-1
         *              自然数计数方式：从1开始
         *              计算机计数方式：从0开始
         *
         * */
//        System.out.println("arr4的长度：" + arr4.length);

        /**
         * 通过索引值来访问数组中的元素
         *
         * 为数组中的元素赋值：
         *                 数组名字[索引值] = 数值；
         *
         * 获取出数组中的元素：
         *                 变量 = 数组名字[索引值]；
         *                 我们需要  先声明一个变量  来接收  数组对应索引值的数值
         *
         * 数组的遍历：
         *          数组遍历就是将数组中的每个元素分别获取出来，遍历也是数组操作中的基石
         *          可以用循环来实现数组的遍历
         *          最常见的最快捷的方式，推荐为使用for循环遍历数组
         *          数组的索引是 0到length-1 ，这是可以作为循环条件出现的
         *
         *          针对for循环的数组遍历拥有快捷键：
         *                                     数组名字.fori
         * */

//        int arr3[] = new int[]{1, 2, 3, 4};

//        System.out.println("小于长度");
//        for (int i = 0; i < arr3.length; i++) {
//            System.out.println(arr3[i]);
//        }
//        System.out.println("小于长度-1");
//        for (int i = 0; i < arr3.length-1; i++) {
//            System.out.println(arr3[i]);
//        }
//        System.out.println("小于等于长度-1");
//        for (int i = 0; i <= arr3.length-1; i++) {
//            System.out.println(arr3[i]);
//        }

        //int[] arr1 = {1, 2, 3, 4};
//        System.out.println("未修改的arr1[0]值为：" + arr1[0]);
//        arr1[0] = 6;
//        int i = arr1[0];
//        System.out.println("修改后的arr1[0]值为：" + arr1[0]);
//        System.out.println("变量i获取到的值为：" + i);

//        数组的遍历
        //int[] arr1 = {6, 2, 3, 4};
//        System.out.println("arr1数组遍历的结果：");
//        for (int j = 0; j < arr1.length; j++) {
//            System.out.println(arr1[j]);
//        }

//        System.out.println("------------------------------------------");

        /**
         * 二维数组：
         *         分有行列下标
         * 格式：
         *     数组元素类型 数组名字[行下标][列下标]
         *
         * 定义与初始化同一维数组相似：
         *                       同样是可以定义与初始化分离的
         *                       在赋值时需要指定下标进行赋值
         * */
        int[][] darr =new int[2][2];
        darr[0][0] = 1;
        darr[0][1] = 2;
        darr[1][0] = 3;
        darr[1][1] = 4;

        //二维数组的遍历
//        for (int k = 0; k < darr.length; k++) {
//            for (int l = 0; l < darr[k].length; l++) {
//                System.out.print(darr[k][l] + ",");
//            }
//        }

    }
}
