package jobsheet5;

public class test {
    public static void main(String[] args) {
        int n = 10; // jumlah baris
        
        for (int i = n; i >= 1; i--) { // mulai dari n turun ke 1
            for (int j = 1; j <= i; j++) { // cetak bintang sebanyak nilai i
                System.out.print("*");
            }
            System.out.println(); // pindah baris
        }
    }
    
}
