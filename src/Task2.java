public class Task2 {
    // Написать статические методы:
    //- взятия факториала некоторого числа.
    public static int a = 1;
    public static int b = 6;

    public static void main(String[] args) {
        if(b >= 0) {
            int f = factorial();
            System.out.println("Факториал числа " + " " + b + " равен " + " " + f);
        }
        else {
            System.out.println("Введите неотрицательное число");
        }
    }

    public static int factorial() {
        for (int i = 1; i <= b ; i++) {
            a *= i;
        }
        return a;
    }
}
