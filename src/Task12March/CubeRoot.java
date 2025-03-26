package Task12March;

import java.util.Scanner;

public class CubeRoot {
    public static void main(String[] args) {
        // Expression Calculate cube root of (x^2+y^2-|z|)
        {
            int x = 1;
            int y = 8;
            int z= -8;

            int square_of_x = (int) Math.pow(x,2);
            int square_of_y = (int) Math.pow(y,2);
            int absolute_value_of_z = Math.abs(z);

            int calculated_expression= (square_of_x + square_of_y - absolute_value_of_z);
            int result = (int) Math.cbrt(calculated_expression);

            System.out.println(result);
        }
    }
}
