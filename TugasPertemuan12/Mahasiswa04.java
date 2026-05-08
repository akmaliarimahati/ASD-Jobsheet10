package TugasPertemuan12;

public class Mahasiswa04 {
    String nim;
    String nama;
    String prodi;
    String kelas;

    public Mahasiswa04(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    public void tampilInformasi() {
        System.out.printf("%-15s %-18s %-8s %-8s\n", nama, nim, prodi, kelas);
    }
}
