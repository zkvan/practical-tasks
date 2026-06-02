import java.lang.reflect.Array;

public class ArrayMapper {
    public static <T> T[] arrayMapping(T[] array, Function<T> function) {
        if (array == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        if (function == null) {
            throw new IllegalArgumentException("Function cannot be null");
        }

        T[] result = (T[]) Array.newInstance(array.getClass().getComponentType(), array.length);

        for (int i = 0; i < array.length; i++) {
            result[i] = function.apply(array[i]);
        }

        return result;
    }
}