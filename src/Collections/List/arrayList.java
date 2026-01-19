package Collections.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayList {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(4);
//        list.add(100);
//        list.add(10);
//        list.add(0);
//        list.add(500);
//        System.out.println(list.get(0));
//        System.out.println(list.size());
//        System.out.println(list.contains(10)); //returns true(checks number exists in the arrayList or not)
//        System.out.println(list.contains(200));// returns false check
//        list.remove(2);
//        list.add(3,90);
//        list.set(4,5); // removes the 4th index and update with 5
//        for(int x: list){
//            System.out.println(x);
//        }

        String[] array = {"Monday","Tuesday","Wednesday"};
        List<String> list2 = Arrays.asList(array);
//        list2.add("qew"); // we cannot add anything
        list2.set(0, "Everyday");
        System.out.println(list2);
        ArrayList<String> list = new ArrayList<>(list2); // using this we can add in list2
        list.add(0, "Sunday");
        System.out.println(list);

        List<Integer> numberList = List.of(3, 4, 5);
        ArrayList<Integer> numberList2 = new ArrayList<>();
        numberList2.add(0);
        numberList2.add(1);
        numberList2.add(2);
        numberList2.addAll(numberList);
        System.out.println(numberList2);
    }
}
