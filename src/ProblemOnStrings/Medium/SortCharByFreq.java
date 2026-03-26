package ProblemOnStrings.Medium;
import java.util.*;
import java.util.HashMap;

public class SortCharByFreq {
    public static void main(String[] args) {
        String s = "tree";
        System.out.println(sortCharByFreq(s));
    }
    public static List<Character> sortCharByFreq(String s){
        HashMap<Character, Integer> map = new HashMap<>();

        // count frequency
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // unique characters
        List<Character> list = new ArrayList<>(map.keySet());

        // sort
        list.sort((a, b) -> {
            if(!map.get(a).equals(map.get(b))){
                return map.get(b) - map.get(a);
            }
            return a - b;
        });

        return list;
    }
}
