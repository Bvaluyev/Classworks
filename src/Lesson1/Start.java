package Lesson1;


public class Start {

    public static void main(String[] args) { // Область видимости класса //Класс - контэйнер для методов
        print("Hello all");
        print("Hello all");

        int r = pow(20); //В переменную Р мы поместили резултат  выполнения метода ПОВ.
        System.out.println(r); //Вывели результат на экран.

//        int another = pow (r); //Еще раз вызывает метод пов передавая туда значение  100 r = pow(r);
//        System.out.println(another); //Выводит результат на экран   /То же самое     System.out.println(r);

        r = pow(r);
        System.out.println(r);
    } // Обоасть видимости класса

    public static void print(String text) {//Method вывода текста
        System.out.println(text);
    }

    public static int pow(int x) { //Метод возведения в квадрат, возвращает данные в метод МЭЙН
        return x * x;

    }
}

