public class Main {
    public static void main(String[] args) {
        MyStringBuilder sb = new MyStringBuilder();

        sb.append("Hello ");
        System.out.println(sb);
        sb.append("World");
        System.out.println(sb);
        sb.undo();
        System.out.println(sb);
    }
}