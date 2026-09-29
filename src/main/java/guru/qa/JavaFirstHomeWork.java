package guru.qa;

public class JavaFirstHomeWork {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int d = 2;
        int age = 18;
        double c = 2.5;
        double e = Double.MAX_VALUE;

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

        //применить несколько логических операций ( < , >, >=, <= ) второй вариант
        if (age >= 18) {
            System.out.println("Ты уже взрослый!");
        }
        else
        {
            System.out.println("Ты еще малыш");
        }

        //прочитать про диапазоны типов данных для вещественных / чисел с плавающей точкой (какие максимальные и минимальные значения есть, как их получить) и переполнение
        System.out.println("Float Max: " + Float.MAX_VALUE);
        System.out.println("Double Max: " + Double.MAX_VALUE);
        System.out.println("Float Min: " + Float.MIN_VALUE);
        System.out.println("Double Min: " + Double.MIN_VALUE);

        //получить переполнение при арифметической операции
        System.out.println("Overflow: " + (Integer.MAX_VALUE + 1));
    }
}
