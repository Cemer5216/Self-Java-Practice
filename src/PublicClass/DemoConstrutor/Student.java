package PublicClass.DemoConstrutor;

/**
 * @Auther: CEMER
 * @Date: 2022/1/19 20:28
 * @Description:
 */
public class Student {
    int age;
    String name;

    //�޲ι��췽��
    public Student() {
    }
    //ֻ��һ�������Ĺ��췽��
    public Student(String name) {
        this.name = name;
    }
    public Student(int age) {
        this.age = age;
    }
    //���ι��췽��
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }



//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

}
