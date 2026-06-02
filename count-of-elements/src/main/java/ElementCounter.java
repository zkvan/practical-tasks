import java.util.HashMap;
import java.util.Map;

public class ElementCounter {
    public static <T> Map<T, Integer> countElements(T[] array) {
        if (array == null) {
            return new HashMap<>();
        }

        Map<T, Integer> map = new HashMap<>();

        for (T element : array) {
            if (map.containsKey(element)) {
                map.put(element, map.get(element) + 1);
            } else {
                map.put(element, 1);
            }
        }

        return map;
    }
}