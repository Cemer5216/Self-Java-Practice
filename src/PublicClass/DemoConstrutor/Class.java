package PublicClass.DemoConstrutor;

/**
 * @Auther: CEMER
 * @Date: 2022/1/19 20:42
 * @Description:
 */
public class Class {
    //��ʦ���У�ѧ�����ش�����

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.age = 26;

        Student student = new Student();
        student.age = 20;
        Student student1 = new Student("����");
        Student student2 = new Student(21, "����");

        System.out.println(teacher.age+"�����ʦ��"+student2.age+"���"+student2.name+"�ش�������");

    }

}
