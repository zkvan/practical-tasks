import java.util.Stack;

public class MyStringBuilder {
    private final StringBuilder storage = new StringBuilder();
    private final Stack<String> stack = new Stack<>();

    public MyStringBuilder append(String s){
        if (s != null && !s.isEmpty()) {
            stack.push(storage.toString());
            storage.append(s);
        }
        return this;
    }

    public MyStringBuilder delete(int start, int end){
        if (start < end && start < storage.length() && start >= 0) {
            stack.push(storage.toString());
            storage.delete(start, end);
        }
        return this;
    }

    public String toString(){
        return storage.toString();
    }

    public MyStringBuilder undo(){
        if (stack.isEmpty()){
            return this;
        }
        storage.setLength(0);
        storage.append(stack.pop());
        return this;
    }
}
