package kata2;
import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        int[] data = new int[] {52,-12,1,0,-6,7,33,657,-2,2,1,1,0,33,53};
        Map<Integer,Integer> histogram = new HashMap<>();
        for (int key : data) {
            histogram.put(key, (histogram.containsKey(key)? histogram.get(key) + 1 : 1));
        }
        
        for (Integer key : histogram.keySet()) {
            System.out.println(key + " ==> " + histogram.get(key));   
        }
    }
}