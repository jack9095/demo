package Java.exercises;

import java.util.ArrayList;
import java.util.List;

public class One {

    public static void main(String[] args){
        List<String> lists = new ArrayList<>();
        String removeName = "邓磊";
        lists.add("孟磊");
        lists.add("李磊");
        lists.add("汪磊");
        lists.add("邓磊");
        for (int i = 0; i < lists.size(); i++) {
            if (removeName.equals(lists.get(i))) {
                lists.remove(lists.get(i));
            }
            System.out.println(lists.get(i));
        }

//        for (String name : lists) {
//            if (removeName.equals(name)) {
//                lists.remove(name);
//            }
//        }
    }

}
