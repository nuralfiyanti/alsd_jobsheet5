import java.util.Scanner;

public class MahasiswaDemo19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        sc.nextLine();
        
        MahasiswaBerprestasi19 list = new MahasiswaBerprestasi19(jumlah);

    for(int i =0; i < jumlah; i++) {
        System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
        System.out.print("NIM: ");
        String nim = sc.nextLine();
        System.out.print("Nama: ");
        String nama = sc.nextLine();
        System.out.print("Kelas: ");
        String kelas = sc.nextLine();
        System.out.print("IPK: ");
        double ipk = sc.nextDouble();
        sc.nextLine(); 

        list.tambah(new Mahasiswa19(nim, nama, kelas, ipk));

    }
        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        list.bubbleSort();
        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        list.selectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        list.insertionSort();
        list.tampil();
    }
}