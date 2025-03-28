import java.util.Scanner;

public class MahasiswaDemo19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int jumMhs = 5; 
        
        MahasiswaBerprestasi19 list = new MahasiswaBerprestasi19(jumMhs);

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            String ip = sc.nextLine();
            Double ipk = Double.parseDouble(ip);
            System.out.println("---------------------------------");

            list.tambah(new Mahasiswa19(nim, nama, kelas, ipk));
        }
        list.tampil();
        // melakukan pencarian data Binary
        System.out.println("----------------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("----------------------------------------------------");
        System.out.println("Masukkan IPK mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();
        System.out.println("--------------------------------------");
        System.out.println("Menggunakan binary search");
        System.out.println("--------------------------------------");
        double posisi2 = list.findBinarySearch(cari,0,jumMhs-1);
        int pss2 = (int) posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
        
    }
}