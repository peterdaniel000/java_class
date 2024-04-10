
public class method {
    public static void newGreeting(String name) {
        System.out.println("GOOD MORNING " + name);
    }
    public static void addition(int a, int b) {
        System.out.println(a + b);
        System.out.println(a - b);
    }
    static int multiply(int x, int y) {
        return x * y;
    }





    public static void main(String[] args) {
        newGreeting("daniel");
        newGreeting("isaiah");
        newGreeting("gift");

        addition(6,7);
        int result = multiply(5, 6);
        System.out.println(result);
    }
}
