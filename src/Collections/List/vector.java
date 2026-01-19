package Collections.List;

import java.util.Vector;

public class vector {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(5,2);
        vector.add(12);
        vector.add(12);
        vector.add(12);
        vector.add(12);
        vector.add(12);
        System.out.println(vector.capacity());
        vector.add(4);
        System.out.println(vector.capacity());

    }
}
