package PublicClass.DemoConstrutor;

/**
 * @Auther: CEMER
 * @Date: 2022/1/19 20:28
 * @Description:
 */
public class Student {
    int age;
    String name;

    //无参构造方法
    public Student() {
    }
    //只有一个参数的构造方法
    public Student(String name) {
        this.name = name;
    }
    public Student(int age) {
        this.age = age;
    }
    //满参构造方法
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
