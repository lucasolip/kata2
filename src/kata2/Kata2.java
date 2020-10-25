package kata2;
import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        int[] data = new int[] {52,-12,1,0,-6,7,33,657,-2,2,1,1,0,33,53};
        Map<Integer,Integer> histogram = new HashMap<>();
        for (int i = 0; i < data.length; i++) {
            if (histogram.containsKey(data[i])) {
                histogram.put(data[i], histogram.get(data[i]) + 1);
            } else {
                histogram.put(data[i], 1);
            }
        }
        
        for (Integer key : histogram.keySet()) {
            System.out.println(key + " ==> " + histogram.get(key));   
        }
    }
}