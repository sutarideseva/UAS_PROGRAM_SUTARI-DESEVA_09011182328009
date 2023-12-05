import java.util.Scanner;

public class Autentikasi {

    public static void main(String[] args) {
        // Menentukan username dan password yang valid
        String username = "userfasilkom23";
        String password = "pass011205";

        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan username
        System.out.print("Masukkan username: ");
        String inputUsername = scanner.nextLine();

        // Meminta pengguna untuk memasukkan password
        System.out.print("Masukkan password: ");
        String inputPassword = scanner.nextLine();

        // Memeriksa apakah username dan password yang dimasukkan sesuai atau tidak
        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("Autentikasi Berhasil");
        } else {
            System.out.println("Autentikasi Gagal");
        }

        // Menutup objek Scanner
        scanner.close();
    }
}
