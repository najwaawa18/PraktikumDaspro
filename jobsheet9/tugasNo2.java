package jobsheet9;
import java.util.Scanner;
public class tugasNo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah pesanan : ");
        int jumlah = sc.nextInt();
        sc.nextLine();
        String[] namaPesanan = new String[jumlah];
        double[] hargaPesanan = new double[jumlah];
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nPesanan ke-" + (i + 1));
            System.out.print("Masukkan nama makanan/minuman: ");
            namaPesanan[i] = sc.nextLine();
            System.out.print("Masukkan harga " + namaPesanan[i] + ": Rp ");
            hargaPesanan[i] = sc.nextDouble();
            sc.nextLine(); 
        }
        System.out.println("\n=== DAFTAR PESANAN KAFE ===");
        double total = 0;
        for (int i = 0; i < jumlah; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + " - Rp " + hargaPesanan[i]);
            total += hargaPesanan[i];
        }
        System.out.println("----------------------------");
       System.out.println("Total Biaya Pesanan : Rp " + total);
    }
}
