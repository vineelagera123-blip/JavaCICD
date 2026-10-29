public class Hello {
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Hello, Jenkins CI/CD!");
        System.out.println("Sum = " + add(10, 20));
    }
}