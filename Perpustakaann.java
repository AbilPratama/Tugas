import java.util.ArrayList;
import java.util.Scanner;

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

public class Perpustakaann {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> buku = new ArrayList<Book>();
        buku.add(new Book("Ketenangan", "Cahyono", "Erlangga", 1, 1999));
        buku.add(new Book("Petualangan kancil", "Rumi", "Erlangga", 2, 2005));
        buku.add(new Book("Belajar coding", "Alvin", "Balai pustaka", 3, 2019));

        String kategoribuku[] = {"Romance", "Fiksi", "Pembelajaran"};

        int[] countKategori = new int[kategoribuku.length];
        int bukuLawas = 0;
        int bukuBaru = 0;

        System.out.println("===========================================================");
        System.out.println("Daftar buku yang tersedia");
        System.out.println("===========================================================");

        for (int i = 0; i < buku.size(); i++) {
            System.out.print(i + 1 + "\t");
            System.out.print(buku.get(i).judul + "\t");
            System.out.print(buku.get(i).author + "\t");
            System.out.print(buku.get(i).penerbit + "\t");
            System.out.print(buku.get(i).tahun + "\t");
            System.out.println(kategoribuku[buku.get(i).kategori - 1]);

            countKategori[buku.get(i).kategori - 1]++;

            if (buku.get(i).tahun <= 2000) {
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
