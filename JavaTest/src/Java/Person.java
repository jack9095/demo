package Java;

public class Person implements Comparable<Person>{

    private String name; // 名称
    private int age;     // 年龄

    @Override
    public int compareTo(Person o) {
        int num = this.age - o.age;  // 先比较年龄
        return num == 0 ? this.name.compareTo(o.name) : num; // 年龄相等就比较名称
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
