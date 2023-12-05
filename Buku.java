public class Buku {
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private boolean dipinjam;

    // Constructor untuk inisialisasi atribut
    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.dipinjam = false; // Set awal buku tidak dipinjam
    }

    // Metode untuk menampilkan informasi buku
    public void tampilkanInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        if (dipinjam) {
            System.out.println("Status: Sedang Dipinjam");
        } else {
            System.out.println("Status: Tersedia");
        }
    }

    // Metode untuk meminjam buku
    public void pinjamBuku() {
        if (!dipinjam) {
            dipinjam = true;
            System.out.println("Buku dengan judul '" + judul + "' berhasil dipinjam.");
        } else {
            System.out.println("Maaf, buku dengan judul '" + judul + "' sedang tidak tersedia.");
        }
    }

    // Metode untuk mengembalikan buku
    public void kembalikanBuku() {
        if (dipinjam) {
            dipinjam = false;
            System.out.println("Buku dengan judul '" + judul + "' berhasil dikembalikan.");
        } else {
            System.out.println("Buku dengan judul '" + judul + "' sudah tersedia.");
        }
    }

    public static void main(String[] args) {
        // Contoh penggunaan kelas Buku
        Buku buku1 = new Buku("Harry Potter", "J.K. Rowling", 1997);
        buku1.tampilkanInformasi();

        System.out.println("\nMeminjam buku...");
        buku1.pinjamBuku();
        buku1.tampilkanInformasi();

        System.out.println("\nMengembalikan buku...");
        buku1.kembalikanBuku();
        buku1.tampilkanInformasi();
    }
}
