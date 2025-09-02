public class DataTypeOperations {
    public static void main(String[] args) {
        int a = 10;
        double b = 5.5;
        char c = 'A';
        String s = "Hello";

        System.out.println("int + double = " + (a + b));
        System.out.println("char + int = " + (c + a)); // ASCII value addition
        System.out.println("String + int = " + (s + a));
        System.out.println("double * int = " + (b * a));
    }
}
