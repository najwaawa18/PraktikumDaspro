package jobsheet9;
import java.util.Scanner;
public class tugasNo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan banyaknya nilai mahasiswa : ");
        int jumlah = sc.nextInt();
        int[] nilai = new int[jumlah];
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilai[i] = sc.nextInt();
        }
        System.out.println("\n=== Daftar Nilai Mahasiswa === ");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + " : " + nilai[i]);
        }
        int total = 0;
        int tertinggi = nilai[0];
        int terendah = nilai[0];
        for (int i = 0; i < jumlah; i++) {
            total += nilai[i];
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
        }
        double rataRata = (double) total / jumlah;
        System.out.println("\n=== Hasil Pengolahan Nilai ===");
        System.out.println("Nilai rata-rata : " + rataRata);
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah  : " + terendah);
    }
}
