import java.util.HashMap;
import java.util.Map;

public class ArrayDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,2,1,4,5,4,6,7,8,9,9};
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            if (countMap.containsKey(num)) {
                countMap.put(num,countMap.get(num) + 1);
            }
            else{
                countMap.put(num, 1);
            }
        }
        for (Map.Entry<Integer, Integer> e : countMap.entrySet()) {
            if (e.getValue() > 1) {
                System.out.println(e.getKey() + " --> " + e.getValue());
            }
        }
    }
}
