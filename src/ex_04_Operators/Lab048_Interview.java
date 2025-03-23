package ex_04_Operators;

public class Lab048_Interview {
    public static void main(String[] args) {
        int balaji_salary = 12;
        boolean b = !(balaji_salary > 10 || balaji_salary < 5 );
        System.out.println(b);

        // A --> balaji_Salary > 10 --> 12 > 10 -> True
        // B --> balaji_Salary < 5  --> 12 < 5  -> False
        // !(A||B) -> !(true || false) -> !true - false

    }
}
