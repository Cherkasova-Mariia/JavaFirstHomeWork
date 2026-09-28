package guru.qa;

public class JavaFirstHomeWork {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int d = 2;
        double c = 2.5;

        //применить несколько арифметических операций ( + , -, * , /) над двумя примитивами типа int
        System.out.println("Add: " + (a + b));
        System.out.println("Subtract: " + (a - b));
        System.out.println("Multiply: " + (a * b));
        System.out.println("Divide: " + (a / b));

        //применить несколько арифметических операций над int и double в одном выражении
        System.out.println("int and duble: " + ((a + b))/c);

        //применить несколько логических операций ( < , >, >=, <= )

        if (a % d == 0) {
            System.out.println("Число " + a + " четное");
        }
        else
        {
            System.out.println("Число " + a + " нечетное");
        }
    }
}
