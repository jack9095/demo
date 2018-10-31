package Java.thinkInJava;

/**
 * 展示无论你创建了某个特定类的多少个对象，这个类中的某个特定的static域只有一个实例
 */
public class StaticTest {

    public static void main(String[] args) {
        TestOne test1 = new TestOne(1,'a');//创建多个实例
        TestOne test2 = new TestOne(2,'b');
        System.out.println("test1-"+test1.i+test1.a+test1.x);
        System.out.println("test2-"+test2.i+test2.a+test2.x);
    }
}
