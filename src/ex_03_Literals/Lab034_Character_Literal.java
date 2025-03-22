package ex_03_Literals;

public class Lab034_Character_Literal {
    public static void main(String[] args) {

        char c1 ='A'; //A-Z, a-z, ~!@#$%^&*()_+=\][}{*?,.,.
//        char c2 = "A"; // This is not a character this is string
        char c2 = 'B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' ';


        //Escape Character
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        //System.out.println("DineshTiwari");
        System.out.println("Dinesh"+new_line+"Tiwari");
        System.out.println("Dinesh"+tab_line+"Tiwari");
        System.out.println("Dinesh"+back_space+"Tiwari");
        System.out.println("Dinesh Kumar"+carriage_return+"Tiwari");
        System.out.println("This is a First Line\nThis is a Second Line\nThis is a third Line");

        char rupee = '₹';
        System.out.println(rupee);
        char my_laugh_smiley ='\u1f60';
        System.out.println(my_laugh_smiley);



    }
}
