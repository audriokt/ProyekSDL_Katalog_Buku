
package sdlproyek;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        KatalogBuku katalogBuku = new KatalogBuku();

        while (true) {
            System.out.println("Menu Katalog Buku:");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Hapus Buku");
            System.out.println("3. Cari Buku");
            System.out.println("4. Cetak Katalog");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");

            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Consumes newline character

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan judul buku: ");
                    String judul = scanner.nextLine();
                    System.out.print("Masukkan penulis buku: ");
                    String penulis = scanner.nextLine();
                    System.out.print("Masukkan penerbit buku: ");
                    String penerbit = scanner.nextLine();
                    System.out.print("Masukkan tahun terbit buku: ");
                    int tahunTerbit = scanner.nextInt();
                    katalogBuku.tambahBuku(judul, penulis, penerbit, tahunTerbit);
                    System.out.println("Buku berhasil ditambahkan.");
                    break;
                case 2:
                    System.out.print("Masukkan judul buku yang ingin dihapus: ");
                    String judulHapus = scanner.nextLine();
                    katalogBuku.hapusBuku(judulHapus);
                    System.out.println("Buku dengan judul " + judulHapus);
                    break;  
                case 3:
                    System.out.print("Masukkan judul buku yang ingin dicari: ");
                    String judulCari = scanner.nextLine();
                    Buku bukuCari = katalogBuku.cariBuku(judulCari);
                
                    if (bukuCari != null) {
                        System.out.println("Buku ditemukan:");
                        System.out.println(bukuCari);
                    } else {
                        System.out.println("Buku dengan judul " + judulCari + " tidak ditemukan.");
                    }
                    break;
                case 4:
                    System.out.println("Daftar Katalog Buku:");
                    katalogBuku.cetakKatalog();
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    System.exit(0); // Keluar dari program
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu 1-5.");
                }
        }
    }
    
}
