package TugasPertemuan12;

import java.util.Scanner;

public class LayananMahasiswaMain04 {
    public static void main(String[] args) {
        LayananMahasiswa04 antrian = new LayananMahasiswa04();
        Scanner sc = new Scanner(System.in);
        int menu;

        do {
            System.out.println("\n==== LAYANAN UNIT KEMAHASISWAAN ====");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Cek Antrian Terdepan & Terakhir");
            System.out.println("4. Cek Jumlah Antrian");
            System.out.println("5. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("NIM : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Program Studi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    antrian.enqueue(new Mahasiswa04(nim, nama, prodi, kelas));
                    break;

                case 2:
                    antrian.dequeue();
                    break;

                case 3:
                    antrian.peek();
                    break;

                case 4:
                    antrian.print();
                    break;

                case 5:
                    antrian.clear();
                    break;
                default:
                    System.out.println("Pilihan Tidak Valid.");
                    
            }
        } while (menu != 0);
    }
}
