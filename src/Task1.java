public class Task1 {
    // Переписать задачу на квадратное уравнение выделив отдельные статические методы
    // для вычисления дискриминанта и расчета корней.
    public static double a = 2;
    public static double b = 8;
    public static double c = 4;
    public static double discriminant;

    public static void main(String[] args) {
        discriminant = D();
        if(discriminant == 0) {
            double X = x();
            System.out.println("Дискриминант равен нулю! Корень один. " + X);
        }
        else if(discriminant > 0) {
            double X1 = x1();
            double X2 = x2();
            System.out.println("Дискриминант больше нуля! ");
            System.out.println("Корень 1 = " + " " + X1);
            System.out.println("Корень 2 = " + " " + X2);
        }
        else {
            System.out.println("Дискриминант меньше нуля! Корней нет. ");
        }
    }
    public static double D() {
        return b * b - 4 * a * c;
    }
    public static double x() {
        return -b / 2 * a;
    }
    public static double x1() {
        return (-b + Math.sqrt(discriminant)) / (2 * a);
    }
    public static double x2() {
        return (-b - Math.sqrt(discriminant)) / (2 * a);
    }
}

