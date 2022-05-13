package PublicClass.DemoPop;

public class Pop {
    /**
     * 冒泡排序：
     *        给定一个数组，然后整理数组内的元素，使得数组元素按照特定顺序（从大到小或者从小到大）去排序
     *
     *        很明显的标志是（底层）：双层for循环
     * */
    public static void main(String[] args) {
        int[] pop = {5, 12, 37, 9, 17, 6};
        int temp = 0;
        //从小到大
        for (int i = 0; i < pop.length-1; i++) {
            for (int j = 0; j < pop.length - 1 - i; j++) {
                if (pop[j] < pop[j + 1]) {
                    //需要中间值temp
                    temp = pop[j];
                    pop[j] = pop[j + 1];
                    pop[j + 1] = temp;
                }
            }
        }

        //遍历展示
        for (int i = 0; i < pop.length; i++) {
            System.out.println(pop[i]);
        }
    }
}
