import java.util.Scanner;

public class HitungTotalHarga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah barang yang dibeli: ");
        int jumlahBarang = input.nextInt();

        System.out.print("Masukkan harga per barang: ");
        double hargaPerBarang = input.nextDouble();

        double totalHarga = 0;

        if (jumlahBarang < 5) {
            totalHarga = jumlahBarang * hargaPerBarang;
        } else if (jumlahBarang >= 5 && jumlahBarang <= 10) {
            totalHarga = jumlahBarang * hargaPerBarang * 0.95; // Diskon 5%
        } else if (jumlahBarang >= 11 && jumlahBarang <= 20) {
            totalHarga = jumlahBarang * hargaPerBarang * 0.9; // Diskon 10%
        } else {
            totalHarga = jumlahBarang * hargaPerBarang * 0.8; // Diskon 20%
        }

        System.out.println("Total harga setelah diskon: " + totalHarga);

        input.close();
    }
}
