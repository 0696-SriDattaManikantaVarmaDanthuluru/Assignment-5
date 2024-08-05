import java.util.HashMap;
import java.util.Map;
public class WordOccurence {
    public static void main(String[] args) {
        String s="Hello world Hello World hi how are you hi";
         s=s.toLowerCase();
        String[] a=s.split(" ");
        Map<String,Integer> map = new HashMap<>();
        for (String string : a) {
            if (map.containsKey(string)) {
                map.put(string, map.get(string) + 1);
            } else {
                map.put(string, 1);
            }
        }
        System.out.println(map);
        for(Map.Entry<String,Integer> e: map.entrySet()){
            System.out.println(e.getKey()+"-"+e.getValue());
        }
    }
}