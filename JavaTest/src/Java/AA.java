package Java;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class AA {
//    private static TreeSet<Integer> lists = new TreeSet<>();  // 元素唯一,都是整数升序排列
    private static TreeSet<Person> lists = new TreeSet<>();  // 元素唯一,都是整数升序排列
    private static Person person;
    public static void main(String[] args){

//        lists.add("4");
//        lists.add("10");
//        lists.add("1");
//        lists.add("40");
//        lists.add("4");
//        lists.add(4);
//        lists.add(10);
//        lists.add(1);
//        lists.add(40);
//        lists.add(4);
        treeSet();
        System.out.println(lists.toString());
    }

    private static void treeSet(){
        person = new Person();
        person.setAge(1);
        person.setName("bb");
        lists.add(person);

        person = new Person();
        person.setAge(1);
        person.setName("aa");
        lists.add(person);

        person = new Person();
        person.setAge(111);
        person.setName("aa");
        lists.add(person);

        person = new Person();
        person.setAge(10);
        person.setName("aa");
        lists.add(person);
    }
}
