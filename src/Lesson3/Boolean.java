package Lesson3;

public class Boolean {
    public static void main(String[] args) {

        if (isNumberEven(11)) {
            System.out.println("Число является четным");
        } else {
            System.out.println("Число является нечетным");
        }
    }

    public static boolean isNumberEven(int num) {
        int result = num & 1;

        if (result == 0) {
            return true;
        } else {
            return false;

        }
    }
}
