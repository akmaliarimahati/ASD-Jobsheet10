package Pertemuan12;

import java.util.Scanner;

public class SLLMain04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList04 sll = new SingleLinkedList04();
        System.out.print("Masukkan Jumlah Mahasiswa: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= jumlah; i++) {
            System.out.println("--- Input Data Mahasiswa Ke-" + i + " ---");
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa04 mhs = new Mahasiswa04(nim, nama, kelas, ipk);

            sll.addLast(mhs);
            System.out.println();
        }

        sll.print();
        
        // Mahasiswa04 mhs1 = new Mahasiswa04("24212200", "Alvaro", "1A", 4.0);
        // Mahasiswa04 mhs2 = new Mahasiswa04("23212201", "Bimon", "2B", 3.8);
        // Mahasiswa04 mhs3 = new Mahasiswa04("22212202", "Cintia", "3C", 3.5);
        // Mahasiswa04 mhs4 = new Mahasiswa04("21212203", "Dirga", "4D", 3.6);

        // sll.print();
        // sll.addFirst(mhs4);
        // sll.print();
        // sll.addLast(mhs1);
        // sll.print();
        // sll.insertAfter("Dirga", mhs3);
        // sll.insertAt(2, mhs2);
        // sll.print();
    }
}
