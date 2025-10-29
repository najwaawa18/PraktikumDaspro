package jobsheet8;
import java.util.Scanner;
public class kopiSenja {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int totalPelangganKeseluruhan = 0;
    int totalItemKeseluruhan = 0;
    System.out.print("Jumlah cabang kafe : ");
    int jumlahCabang = sc.nextInt();
    System.out.println("\n=== Input Penjualan Per Cabang ===");
    for (int i = 1; i <= jumlahCabang; i++) {
        int pelangganCabang = 0;
        int itemCabang = 0;
        System.out.println("\n--- Cabang " + i + " --- ");
        System.out.print("Jumlah Pelanggan : ");
        int jumlahPelangganHariIni = sc.nextInt();
        pelangganCabang += jumlahPelangganHariIni;

        for (int j = 1; j <= jumlahPelangganHariIni; j++) {
            System.out.print("- Pelanggan " + j + " memasan berapa item? ");
            int itemDipesan = sc.nextInt();
            itemCabang += itemDipesan;
        }
        System.out.println("Cabang " + i + " : ");
        System.out.println("- Pelanggan : " + pelangganCabang + " orang ");
        System.out.println("- Item terjual : " + itemCabang);
        totalPelangganKeseluruhan += pelangganCabang;
        totalItemKeseluruhan += itemCabang;  
    }
    System.out.println("\nTotal seluruh Cabang : ");
    System.out.println("Pelanggan : " + totalPelangganKeseluruhan + " orang ");
    System.out.println("Item terjual : " + totalItemKeseluruhan + " item ");
    }
}
