package Lesson3;

public class BitWise {
    public static void main(String[] args) {
        castData();
        int x = 333;
        int r = x & 1;
        System.out.println(x);

        int y = 8;
        int r1 = y | 0;
        System.out.println(y);


        int r2 = y | 1;
        System.out.println(y);

        int r3 = -1;
        System.out.println(r3);

        int z = 2;//0010
        int v = 0;//0000
        System.out.println(z ^ v);

        int c =10;
        System.out.println(c >> 1); //div by 2

        int g =10;
        System.out.println(g << 1); //mul by 2

        int h =10;
        System.out.println(h << 2); //mul by 4

        byte n1 = 0b00000001;
        byte n2 = 0b00000010;
        byte n3 = 0b00000100;
        System.out.println(n1 + ";" + n2 +";"+ n3);

        byte h12 = 125;
        System.out.println(Integer.toBinaryString(h12));
    }
    public static void castData() {
        byte b =123;
        int x =b;
        System.out.println(x);
    }
//    if(isnumberEven(10))
//    {
//        System.out.println("Число является четным");
//    }else{
//
//        System.out.println("Число является нечетным");
//    }
//    public static void castData () {
}