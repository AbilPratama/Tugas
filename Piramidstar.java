import java.util.Scanner;

public class Piramidstar {
    public static void cetakPiramida(int tinggi, int baris, int bintang) {
        if (baris == tinggi) {
            return;
        }
        for (int j = 0; j < tinggi - baris - 1; j++) {
            System.out.print(" ");
        }
        for (int j = 0; j < bintang; j++) {
            System.out.print("* ");
        }
        System.out.println(); 

        cetakPiramida(tinggi, baris + 1, bintang + 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan tinggi piramida: ");
        int tinggiPiramida = scanner.nextInt();

        if (tinggiPiramida > 0) {
            cetakPiramida(tinggiPiramida, 0, 1);
        } else {
            System.out.println("Tinggi piramida harus lebih besar dari 0.");
        }

        scanner.close();
    }
}
