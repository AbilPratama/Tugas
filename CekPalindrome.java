import java.util.Scanner;

public class CekPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan kata: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println(input + " adalah palindrome.");
        } else {
            System.out.println(input + " bukan palindrome.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String kata) {
        kata = kata.replaceAll("\\s","").toLowerCase();
        return kata.equals(new StringBuilder(kata).reverse().toString());
    }
}
