package jobsheet6;
import java.util.Scanner;
public class taruna {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    
        
        System.out.println("--- Hasil Pemelihan Taruna / Taruni ----- ");
        System.out.print("Jenis Kelamin (L/P) : ");
        String jenisKelamin = sc.nextLine();
        System.out.print("Tinggi Badan dalam (cm) : ");
        int tinggiBadan = sc.nextInt();
        
        if (jenisKelamin.equalsIgnoreCase("L")) {
            if (tinggiBadan >= 165) {    
                System.out.print("lulus");
            } else  { 
                System.out.print("Tidak Lulus");
            }
            
        } else if (tinggiBadan) {
            
        }
    }
    
}
