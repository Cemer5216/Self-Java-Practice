package PublicClass.DemoPop;

public class Pop {
    /**
     * ð������
     *        ����һ�����飬Ȼ�����������ڵ�Ԫ�أ�ʹ������Ԫ�ذ����ض�˳�򣨴Ӵ�С���ߴ�С����ȥ����
     *
     *        �����Եı�־�ǣ��ײ㣩��˫��forѭ��
     * */
    public static void main(String[] args) {
        int[] pop = {5, 12, 37, 9, 17, 6};
        int temp = 0;
        //��С����
        for (int i = 0; i < pop.length-1; i++) {
            for (int j = 0; j < pop.length - 1 - i; j++) {
                if (pop[j] < pop[j + 1]) {
                    //��Ҫ�м�ֵtemp
                    temp = pop[j];
                    pop[j] = pop[j + 1];
                    pop[j + 1] = temp;
                }
            }
        }

        //����չʾ
        for (int i = 0; i < pop.length; i++) {
            System.out.println(pop[i]);
        }
    }
}
