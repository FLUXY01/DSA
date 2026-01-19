package Collections.List;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;


// We use CopyWriteOnArrayList to read and modify the list in the same time
public class copyWriteOnArrayList {
    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("Egg");
        list.add("Butter");
        list.add("Milk");
        list.add("Rice");
        list.add("Meat");

        for(String item : list){
            System.out.println(item);
            if(item.equals("egg")){
                list.add("Flour");
            }
        }
        System.out.println("New list items" + list);
    }


}
