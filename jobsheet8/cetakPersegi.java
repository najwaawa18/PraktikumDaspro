package jobsheet8;

public class cetakPersegi {
    public static void main(String[] args) {
        
       int[] nilai = {3, 5}; 

        for (int n : nilai) {
            System.out.println("Persegi angka dengan n = " + n);
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (i == 1 || i == n || j == 1 || j == n) {
                        System.out.print(n + " ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
            System.out.println(); 
        }
    }
}

