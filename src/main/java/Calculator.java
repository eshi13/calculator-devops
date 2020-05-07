public class Calculator {
    public static void main(String[] args){
        System.out.println("26 + 13 = " + add(26, 13));
        System.out.println("26 - 13 = " + subtract(26,13));
        System.out.println("26 * 13 = " + multiply(26,13));
        System.out.println("26 / 13 = " + divide(26,13));
    }
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static long multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        double result;
        if (b == 0) {
            throw new IllegalArgumentException("Divisor cannot divide by zero");
        } else {
            result = Double.valueOf(a)/Double.valueOf(b);
        }
        return result;
    }
}
