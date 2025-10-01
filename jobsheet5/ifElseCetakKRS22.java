package jobsheet5;
import java.util.Scanner;
public class ifElseCetakKRS22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Masukkan seemester saat ini : ");
        int semester = sc.nextInt();

        if (semester == 1) {
            System.out.println("KRS Semester 1 ditampuilkan");    
        } else if (semester == 2) {
            System.out.println("KRS Semester 2 ditampuilkan");
        } else if (semester == 3) {
            System.out.println("KRS Semester 3 ditampuilkan");   
        } else if (semester == 4) {
            System.out.println("KRS Semester 4 ditampuilkan");
        } else if (semester == 5) {
            System.out.println("KRS Semester 5 ditampuilkan");
        } else if (semester == 6) {
            System.out.println("KRS Semester 6 ditampuilkan");
        } else if (semester == 7) {
            System.out.println("KRS Semester 7 ditampuilkan");
        } else if (semester == 8) {
            System.out.println("KRS Semester 8 ditampuilkan");
        } else {
            System.out.println("Semester tidak valid");
        }            
        }
    }

