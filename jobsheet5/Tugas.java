package jobsheet5;
import java.util.Scanner;
public class Tugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n=== INPUT DATA MAHASISWA ===");
        System.out.print("Nama : ");
        String nama = sc.nextLine();
        System.out.print("NIM  : ");
        String nim = sc.nextLine();
        System.out.println("--- Mata Kuliah 1 : Algoritma dan Pemrograman ---");
        System.out.print("Nilai UTS\t\t\t\t : ");
        double uts = sc.nextDouble();
        System.out.print("Nilai UAS\t\t\t\t : ");
        double uas = sc.nextDouble();
        System.out.print("Nilai Tugas\t\t\t\t : ");
        double tugas = sc.nextDouble();
        // Hitung nilai akhir berdasarkan bobot 
        double nilaiakhir = (uts * 0.3) + (uas * 0.4) + (tugas * 0.3);
        // Tentukan grade 
        String grade;
        if (nilaiakhir >= 85 && nilaiakhir <= 100) {
           grade = "A";
        } else if (nilaiakhir >= 75) {
            grade = "B";
        } else if (nilaiakhir >= 65) {
            grade = "C";
        } else if (nilaiakhir >= 55) {
            grade = "D";
        } else if (nilaiakhir >= 0) {
            grade = "E";
        } else {
            grade = "Nilai Tidak Valid ";
        }
        
        // --- Menentukan status kelulusan ---
        String status1String;
        if (nilaiakhir >= 60) {
            status1String = "LULUS";
        } else { 
            status1String = "TIDAK LULUS";
        }
        System.out.println("\n--- Mata Kuliah 2: Struktur Data ---");
        System.out.print("Nilai UTS\t\t\t\t : ");
        double uts2 = sc.nextDouble();
        System.out.print("Nilai UAS\t\t\t\t : ");
        double uas2 = sc.nextDouble();
        System.out.print("Nilai Tugas\t\t\t\t: ");
        double tugas2 = sc.nextDouble();
        double nilaiAkhir2 = (uts2 * 0.3) + (uas2 * 0.4) + (tugas2 * 0.3);
        String grade2;
        if (nilaiAkhir2 >= 85 && nilaiAkhir2 <= 100) {
            grade2 = "A";
        } else if (nilaiAkhir2 >= 75) {
            grade2 = "B";
        } else if (nilaiAkhir2 >= 65) {
            grade2 = "C";
        } else if (nilaiAkhir2 >= 55) {
            grade2 = "D";
        } else if (nilaiAkhir2 >= 0) {
            grade2 = "E";
        } else {
            grade2 = "Nilai Tidak Valid";
        }
        String statusKe2String;
        if (nilaiakhir >= 60) {
            statusKe2String = "LULUS";
        } else { 
            statusKe2String = "TIDAK LULUS";
        }
        double rataRata = (nilaiakhir + nilaiAkhir2) / 2;
        String statusSemester;
        if (status1String.equals("LULUS") && statusKe2String.equals("LULUS")) {
            // nested if di dalam kondisi keduanya lulus
            if (rataRata >= 70) {
                statusSemester = "LULUS SEMESTER";
            } else {
                statusSemester = "TIDAK LULUS SEMESTER (Rata-rata < 70)";
            }
        } else {
            statusSemester = "TIDAK LULUS SEMESTER (Ada MK tidak lulus)";
        }
        System.out.println("\n=== HASIL PENILAIAN AKADEMIK ===");
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("NIM            : " + nim);
        System.out.println("\nMata Kuliah 1: Algoritma dan Pemrograman");
        System.out.println("Nilai Akhir   : " + nilaiakhir);
        System.out.println("Grade         : " + grade);
        System.out.println("Status        : " + status1String);
        System.out.println("\nMata Kuliah 2: Struktur Data");
        System.out.println("Nilai Akhir   : " + nilaiAkhir2);
        System.out.println("Grade         : " + grade2);
        System.out.println("Status        : " + statusKe2String);
        System.out.println("\nRata-rata Nilai Akhir : " + (int) rataRata);
        System.out.println("Status Semester         : " + statusSemester);

        }
    }
 

