package Collections.List;

import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(12);
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(1,34);
        System.out.println(linkedList);
    }
}
