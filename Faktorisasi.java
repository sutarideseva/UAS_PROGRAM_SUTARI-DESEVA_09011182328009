import java.util.Scanner;

public class Faktorisasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan bulat positif: ");
        int bilangan = input.nextInt();
        
        System.out.print("Faktorisasi " + bilangan + ": ");
        faktorisasi(bilangan);
        
        input.close();
    }
    
    public static void faktorisasi(int bilangan) {
        for (int faktor = 2; faktor <= bilangan; faktor++) {
            while (bilangan % faktor == 0) {
                System.out.print(faktor);
                bilangan /= faktor;
                
                if (bilangan != 1) {
                    System.out.print(" * ");
                }
            }
        }
    }
}
