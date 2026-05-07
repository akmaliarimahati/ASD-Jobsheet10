package Tugas04Jobsheet10;

public class AntrianKRS04 {
    Mahasiswa04[] data;
    int front;
    int rear;
    int size;
    int max;
    int sudahKRS;
    int targetDPA;

    public AntrianKRS04(int n) {
        this.max = n;
        this.data = new Mahasiswa04[max];
        this.front = 0;
        this.size = 0;
        this.rear = -1;
        this.sudahKRS = 0;
        this.targetDPA = 30;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void TambahAntrian(Mahasiswa04 mhs) {
        if (IsFull()) {
            System.out.println("Antrian Sudah Penuh, Tidak Dapat Menambah Mahasiswa.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " Berhasil Masuk ke Antrian.");
    }

    public void PanggilAntrian() {
        if (size < 2) {
            System.out.println("Harus Ada 2 Antrian Mahasiswa.");
        } else {
            System.out.println("=== Memproses KRS Untuk ===");
            for (int i = 0; i < 2; i++) {
                System.out.print("Panggilan Antrian ke-" + (i + 1) + ": ");
                data[front].tampilkanData();
                front = (front + 1) % max;
                size--;
                sudahKRS++;
            }
        }
    }

    public void tampilkanSemua() {
        if (IsEmpty()) {
            System.out.println("Antrian Kosong.");
            return;
        }
        System.out.println("=== Daftar Mahasiswa Dalam Antrian ===");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        System.out.println("------------------------------");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            data[index].tampilkanData();
        }
    }

    public void Lihat2Terdepan() {
        if (size >= 2) {
            System.out.println("=== 2 Mahasiswa Terdepan ===");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            System.out.println("------------------------------");

            data[front].tampilkanData();
            data[(front + 1) % max].tampilkanData();
        } else {
            System.out.println("Mahasiswa Kurang Dari 2 Orang.");
        }
    }

    public void lihatAkhir() {
        if (!IsEmpty()) {
            System.out.print("=== Mahasiswa Urutan Terakhir ===\n");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            System.out.println("------------------------------");
            data[rear].tampilkanData();
        } else {
            System.out.println("Antrian Kosong.");
        }
    }

    public void cetakStatus() {
        int belumKRS = targetDPA - sudahKRS;
        System.out.println("=== Status Mahasiswa ===");
        System.out.println("Jumlah Dalam Antrian: " + size);
        System.out.println("Sudah Proses KRS    : " + sudahKRS);
        System.out.println("Belum Proses KRS    : " + belumKRS);
    }

    public void clear() {
        size = 0;
        front = 0;
        rear = -1;
        System.out.println("Antrian Berhasil Dikosongkan.");
    }

}
