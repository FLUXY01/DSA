package Collections.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashMap {

    public static void main(String[] args) {
        HashMap<Integer,String> students = new HashMap<>();
        students.put(1,"Monica");
        students.put(2,"Rachel");
        students.put(3,"Ross");
        students.put(4,"Chandler");
        students.put(5,"Joey");
        students.put(6,"Phoebe");
//        System.out.println(students);
//        System.out.println(students.get(4));
//        System.out.println(students.containsKey(2));
//        System.out.println(students.containsValue("Joey"));

        Set<Integer> key = students.keySet();
        for(int i : key){
            System.out.println(students.get(i));
        }
        Set<Map.Entry<Integer, String>> entries = students.entrySet();
        for(Map.Entry<Integer, String> i: entries){
            System.out.println(i.getKey() +":"+ i.getValue());
        }
        for (Map.Entry<Integer, String> entry : entries){
            entry.setValue(entry.getValue().toLowerCase());
        }
        System.out.println(students);
    }
}
