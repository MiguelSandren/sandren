import java.util.Scanner;

public class Enter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER ANY: ");
        char input = sc.next().charAt(0); // read a single character from the input

        if ((input >= 'A' && input <= 'Z') || (input >= 'a' && input <= 'z')) {
            System.out.println(input + "  : IS A LETTER");
        } else if (input >= '0' && input <= '9') {
            System.out.println(input + "  : IS A DIGIT");
        } else {
            System.out.println(input + " : IS NOT A LETTER OR DIGIT");
        }

        sc.close();
    }
}