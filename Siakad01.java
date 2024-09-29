import java.util.Scanner;
public class Siakad01 {
    public static void main(String[] args) {

    Scanner sc = new Scanner (System.in);

    String nama, nim, prodi;
    char kelas;
    byte absen;
    double nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;
    
    System.out.println("Masukkan nama: ");
    nama = sc.nextLine();
    System.out.println("Masukkan nim: ");
    nim = sc.nextLine();
    System.out.println("Masukkan prodi: ");
    prodi = sc.nextLine();
    System.out.println("Masukkan kelas: ");
    kelas = sc.nextLine(). charAt(0);
    System.out.println("Masukkan nomor absen: ");
    absen = sc.nextByte();
    System.out.println("Masukkan nilai kuis: ");
    nilaiKuis = sc.nextDouble();
    System.out.println("Masukkan nilai tugas: ");
    nilaiTugas = sc.nextDouble();
    System.out.println("Masukkan nilai UTS: ");
    nilaiUTS = sc.nextDouble();
    System.out.println("Masukkan nilai UAS: ");
    nilaiUAS = sc.nextDouble();

    nilaiAkhir = (nilaiKuis*0.20 + nilaiTugas*0.30 + nilaiUAS*0.35) / 3;

   System.out.println("Mahasiswa dengan nama: " + nama + " (NIM: " + nim + ")");
   System.out.println("Kelas: " + kelas + "Absen: " + absen);
   System.out.println("Nilai Akhir: " + nilaiAkhir);

    }
}