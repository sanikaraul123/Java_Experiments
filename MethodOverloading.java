public class MethodOverloading {
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public double add(double a, double b) {
        return a + b;
    }
    public String add(String str, int num) {
        return str + num;
    }
    public String add(int num, String str) {
        return num + str;
    }

    public static void main(String[] args) {
        MethodOverloadingDemo demo = new MethodOverloadingDemo();

        System.out.println("Method 1 (int + int): " + demo.add(5, 3));
        System.out.println("Method 2 (int + int + int): " + demo.add(5, 3, 2));
        System.out.println("Method 3 (double + double): " + demo.add(2.5, 3.7));
        System.out.println("Method 4 (String + int): " + demo.add("Number: ", 42));
        System.out.println("Method 5 (int + String): " + demo.add(7, " is a lucky number"));
    }
}
