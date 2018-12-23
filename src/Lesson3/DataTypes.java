package Lesson3;

public class DataTypes {
    public static void main(String[] args) {
        char c1 = 'A';
        char c2 = 65;
        char c3 = 135;
        int x = 7 % 2;
        System.out.println(x);
        boolean b = false;
        boolean b2 = true;
        //System.out.println(b);
    }

    public static void showAllDataTypes() {
        byte b1 = 67; // - 128 +127
        short s1 = -32768; //-32768...-32768;
        int i1 = 2147483647;
        long l1 = 4555555555555L;
        float f = 234.54F;
        double d = 236.7;
        char c1 = 'F';
        char c2 = 71; //F
        boolean bool1 = true;
        boolean bool2 = bool1;
        boolean bool3 = false;
    }

}
