package kata2;
import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        Integer[] data = new Integer[] {52,-12,1,0,-6,7,33,657,-2,2,1,1,0,33,53};
        Histogram<Integer> histo = new Histogram<>(data);
        Map<Integer,Integer> histogr = histo.getHistogram();
        
        for (Integer key : histogr.keySet()) {
            System.out.println(key + " ==> " + histogr.get(key));   
        }
    }
}