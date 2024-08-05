import java.util.Map;
public class HashMap {
    public static void main(String[] args) {
        Map<Integer,String> map=new java.util.HashMap<>();
        map.put(1,"har");
        map.put(2,"car");
        map.put(3,"char");
        System.out.println(map.getOrDefault(4,"Not found"));
        for(Map.Entry<Integer,String> e: map.entrySet()){
            System.out.println(e.getValue());
            System.out.println(e.getKey());
        }
    }
}