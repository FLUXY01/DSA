package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class findTheHighestLowestFrequency {
    public static void main(String[] args) {
        FrequencyCounter frequencyCounter = new FrequencyCounter();
        frequencyCounter.frequencyCounter(new int[]{1, 2, 1, 3, 3}, 5);
    }
}
class FrequencyCounter{
    public void frequencyCounter(int [] arr, int n){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i],0)+ 1);
        }
        int maxFrequency = 0;
        int minFrequency = n;
        int maxElement = 0;
        int minElement = 0;
        for (Map.Entry<Integer, Integer> entry: map.entrySet()){
            int element = entry.getKey();
            int count = entry.getValue();
            if (count > maxFrequency){
                maxFrequency = count;
                maxElement = element;
            }
            if(count < minFrequency){
                minFrequency = count;
                minElement = element;
            }
        }
        System.out.println("The highest frequency element is: " + maxElement);
        System.out.println("The lowest frequency element is: " + minElement);
    }
}
