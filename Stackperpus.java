import java.util.Scanner;
import java.util.Stack;

class Book {
    String judul;
    String author;
    String penerbit;
    int kategori;
    int tahun;

    public Book(String judul, String author, String penerbit, int kategori, int tahun) {
        this.judul = judul;
        this.author = author;
        this.penerbit = penerbit;
        this.kategori = kategori;
        this.tahun = tahun;
    }
}

public class Stackperpus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Book> buku = new Stack<>();
        buku.push(new Book("Ketenangan", "Cahyono", "Erlangga", 1, 1999));
        buku.push(new Book("Petualangan kancil", "Rumi", "Erlangga", 2, 2005));
        buku.push(new Book("Belajar coding", "Alvin", "Balai pustaka", 3, 2019));

        String kategoribuku[] = {"Romance", "Fiksi", "Pembelajaran"};

        int[] countKategori = new int[kategoribuku.length];
        int bukuLawas = 0;
        int bukuBaru = 0;

        System.out.println("===========================================================");
        System.out.println("Daftar buku yang tersedia");
        System.out.println("===========================================================");

        for (int i = 0; i < buku.size(); i++) {
            Book currentBook = buku.get(i);
            System.out.print(i + 1 + "\t");
            System.out.print(currentBook.judul + "\t");
            System.out.print(currentBook.author + "\t");
            System.out.print(currentBook.penerbit + "\t");
            System.out.print(currentBook.tahun + "\t");
            System.out.println(kategoribuku[currentBook.kategori - 1]);

            countKategori[currentBook.kategori - 1]++;

            if (currentBook.tahun <= 2000) {
                bukuLawas++;
            } else {
                bukuBaru++;
            }
        }

        System.out.println("\nJumlah buku yang tersedia : " + buku.size());
        for (int j = 0; j < kategoribuku.length; j++) {
            System.out.println("Buku " + kategoribuku[j] + " : " + countKategori[j]);
        }
        System.out.println("Buku Lawas : " + bukuLawas);
        System.out.println("Buku Baru : " + bukuBaru);

        scanner.close();
    }
}
