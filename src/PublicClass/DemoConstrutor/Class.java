package PublicClass.DemoConstrutor;

/**
 * @Auther: CEMER
 * @Date: 2022/1/19 20:42
 * @Description:
 */
public class Class {
    //老师，叫，学生，回答问题

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.age = 26;

        Student student = new Student();
        student.age = 20;
        Student student1 = new Student("张三");
        Student student2 = new Student(21, "李四");

        System.out.println(teacher.age+"岁的老师叫"+student2.age+"岁的"+student2.name+"回答了问题");

    }

}
