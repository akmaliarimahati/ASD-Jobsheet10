package Tugas04Jobsheet10;

import java.util.Scanner;

public class AntrianKRSKRSMain04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS04 antrian = new AntrianKRS04(10);
        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian Kartu Rencana Studi (KRS) ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Panggil 2 Antrian Untuk Memproses");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Lihat 2 Antrian Terdepan");
            System.out.println("5. Lihat Antrian Paling Akhir");
            System.out.println("6. Cetak Status Mahasiswa & Sisa Kuota DPA");
            System.out.println("7. Kosongkan Semua Antrian");
            System.out.println("0. Keluar");

            System.out.print("Pilih Menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();

                    Mahasiswa04 mhs = new Mahasiswa04(nim, nama, prodi, kelas);
                    antrian.TambahAntrian(mhs);
                    break;

                case 2:
                    antrian.PanggilAntrian();
                    break;

                case 3:
                    antrian.tampilkanSemua();
                    break;

                case 4:
                    antrian.Lihat2Terdepan();
                    break;

                case 5:
                    antrian.lihatAkhir();
                    break;

                case 6:
                    antrian.cetakStatus();
                    break;

                case 7:
                    antrian.clear();
                    break;

                case 0:
                    System.out.println("Terima Kasih.");
                    break;

                default:
                    System.out.println("Pilihan Tidak Valid.");
            }
        } while (pilihan != 0);
        sc.close();
    }
}