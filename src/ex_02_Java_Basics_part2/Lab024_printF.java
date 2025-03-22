package ex_02_Java_Basics_part2;

public class Lab024_printF {
    public static void main(String[] args) {
        int a = 10;

        System.out.printf("Your variable is %d", a);

        // %d -> int, byte, long, short, - data type

        // %s - > string

        // %f -> float, double

        // %b -> boolean
        int b = 20;
        System.out.println("---");
        System.out.printf("%d + %d", a,b);

    }
}
