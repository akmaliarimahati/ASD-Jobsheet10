package TugasPertemuan12;

public class LayananMahasiswa04 {
    Node04 front, rear;
    int size;

    public LayananMahasiswa04() {
        this.front = this.rear = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(Mahasiswa04 mhs) {
        Node04 temp = new Node04(mhs);
        if (this.rear == null) {
            this.front = this.rear = temp;
        } else {
            this.rear.next = temp;
            this.rear = temp;
        }
        size++;
        System.out.println(mhs.nama + " Berhasil Masuk Ke Antrian.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian Kosong!");
            return;
        }
        System.out.println("Memanggil Antrian: " + this.front.data.nama);
        this.front = this.front.next;
        if (this.front == null) {
            this.rear = null;
        }
        size--;
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Antrian Terdepan: " + front.data.nama);
            System.out.println("Antrian Terakhir: " + rear.data.nama);
        } else {
            System.out.println("Antrian Kosong.");
        }
    }

    public void print() {
        System.out.println("Jumlah Mahasiswa Dalam Antrian: " + size);
    }
    
    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian telah dikosongkan.");
    }
}
