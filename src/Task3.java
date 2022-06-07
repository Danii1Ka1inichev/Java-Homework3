public class Task3 {
    // Написать статические методы:
    //- возведения числа x в степень y
    public static double a = 1;

    public static void main(String[] args) {
        double X = square(2, 3);
        System.out.println(X);
    }
    public static double square(double x, double y) {
        for (int i = 0; i < y; i++) {
            a *= x;
        }
        return a;
    }
}
