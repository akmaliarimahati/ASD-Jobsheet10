package P2Jobsheet10;

import java.util.Scanner;

public class LayananAkademikSIAKAD04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianLayanan04 antrian = new AntrianLayanan04(5);
        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian Layanan Akademik ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Lihat Mahasiswa Terdepan");
            System.out.println("4. Lihat Semua Mahasiswa Antrian");
            System.out.println("5. Jumlah Mahasiswa Dalam Antrian");
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
                    antrian.tambahAntrian(mhs);
                    break;

                case 2:
                    Mahasiswa04 dilayani = antrian.layaniMahasiswa04();
                    if (dilayani != null) {
                        System.out.print("Melayani Mahasiswa: ");
                        dilayani.tampilkanData();
                    }
                    break;

                case 3:
                    antrian.lihatTerdepan();
                    break;

                case 4:
                    antrian.tampilkanSemua();
                    break;

                case 5:
                    System.out.println("Jumlah Dalam Antrian: " + antrian.getJumlahAntrian());
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
