public class UserAccount {
    private String username;
    private String password;
    private boolean isActive;

    // Constructor
    public UserAccount(String username, String password) {
        this.username = username;
        this.password = password;
        this.isActive = true; // Secara default, akun dianggap aktif saat dibuat.
    }

    // Metode untuk mengaktifkan akun
    public void activateAccount() {
        isActive = true;
        System.out.println("Akun " + username + " telah diaktifkan.");
    }

    // Metode untuk menonaktifkan akun
    public void deactivateAccount() {
        isActive = false;
        System.out.println("Akun " + username + " telah dinonaktifkan.");
    }

    // Metode untuk mengembalikan status aktif/nonaktif akun
    public boolean isActive() {
        return isActive;
    }

    // Metode untuk mengembalikan username akun
    public String getUsername() {
        return username;
    }

    // Metode untuk mengubah password akun
    public void setPassword(String newPassword) {
        password = newPassword;
        System.out.println("Password untuk akun " + username + " telah diubah.");
    }

    public static void main(String[] args) {
        // Contoh penggunaan kelas UserAccount
        UserAccount user1 = new UserAccount("john_doe", "password123");

        System.out.println("Username: " + user1.getUsername());
        System.out.println("Status Aktif: " + user1.isActive());

        // Menonaktifkan akun
        user1.deactivateAccount();
        System.out.println("Status Aktif setelah dinonaktifkan: " + user1.isActive());

        // Mengaktifkan kembali akun
        user1.activateAccount();
        System.out.println("Status Aktif setelah diaktifkan kembali: " + user1.isActive());

        // Mengubah password
        user1.setPassword("newPassword456");
    }
}
