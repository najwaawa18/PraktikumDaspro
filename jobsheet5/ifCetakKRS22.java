package jobsheet5;

import java.util.Scanner; 
public class ifCetakKRS22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah kunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();
        
         String x = (uktLunas) ? "Pembayaran UKT terverivikasi" : "Registrasi ditolak. Silahkan lunasi UKT terlebih dahulu.";
        System.out.println(x);
       
    }
}
    
