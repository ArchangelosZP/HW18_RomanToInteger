import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RomanToInteger rtl = new RomanToInteger();
        System.out.print("Enter Roman numeral text >");
        Scanner scanner = new Scanner(System.in);
        String roman = scanner.nextLine();
        rtl.convertRomanToInt(roman);
    }
}