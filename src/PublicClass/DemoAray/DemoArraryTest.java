package PublicClass.DemoAray;

/**
 * @Auther: CEMER
 * @Date: 2022/1/19 16:34
 * @Description:
 */
public class DemoArraryTest {
    public static void main(String[] args) {
        /**
         * ����һ���������а���������֡����Լ��ķ�ʽ����ʵ�֣����������������ߣ�ż������������ұ�
         *
         * ��Ա����е����ݸ������⣬�����ֽ��˼·��
         *                                  1.����Ŀ��ֵ�����ǻ����ӹ����������ܳ��ֶ�α��������
         *                                  2.�����µ������������ձ仯��
         */
        int[] abc = {1,2,3,4,5,6};
        int[] ji = new int[3];
        int[] ou = new int[3];
        int x = 0;
        int y = 0;
        //��Ҫ��������
        for (int i = 0; i < abc.length; i++) {
            //�ѷ������������ŵ���Ӧ������
            if (abc[i] % 2 == 0) {
                //ż�����ֵ = Դ�����ֵ
                ou[x] = abc[i];
                x++;
            } else {
                //�������ֵ = Դ�����ֵ
                ji[y] = abc[i];
                y++;
            }
        }

        //�ϲ�����
        for (int l = 0; l < abc.length; l++) {
            //�ֱ��ȡ��ż���飬Ȼ��ŵ�Դ������
            for (int i = 0; i < ji.length; i++) {
                abc[l] = ji[i];
                l++;
            }
            for (int i = 0; i < ou.length; i++) {
                abc[l] = ou[i];
                l++;
            }
        }

        //����չʾ
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
