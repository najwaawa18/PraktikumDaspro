package jobsheet5;
import java.util.Scanner;
public class aksesWifi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pengguna;
       

        System.out.print("Masukkan pengguna : ");
        pengguna = sc.nextLine();

        if (pengguna.equalsIgnoreCase("dosen")) {
            System.out.println("Akses wifi diberikan");   
        } else if (pengguna.equalsIgnoreCase("mahasiswa")) {
            int sks = sc.nextInt();
            if (sks >= 12) {
                System.out.println("Akses wifi diberikan");    
            } else {
                System.out.println("Akses ditolak");
            }
        
            } 
            
        }
    }
