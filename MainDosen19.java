import java.util.Scanner;
public class MainDosen19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen19 data = new DataDosen19();
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampilkan Data Dosen");
            System.out.println("3. Sorting Usia (ASC) - Bubble Sort");
            System.out.println("4. Sorting Usia (DSC) - Selection Sort");
            System.out.println("5. Sorting Usia (ASC) - Insertion Sort");
            System.out.println("6. Cari Dosen berdasarkan Nama (Sequential Search)");
            System.out.println("7. Cari Dosen berdasarkan Usia (Binary Search)");
            System.out.println("8. Keluar");
            System.out.println("\n-------------------------------------------------\n");
            System.out.print("Pilihan: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode: ");
                    String kode = sc.nextLine();
                    System.out.print("Masukkan nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan jenis kelamin (true=Laki-laki, false=Perempuan): ");
                    boolean jk = sc.nextBoolean();
                    System.out.print("Masukkan usia: ");
                    int usia = sc.nextInt();
                    data.tambah(new Dosen19(kode, nama, jk, usia));
                    break;
                case 2:
                    data.tampil();
                    break;
                case 3:
                    System.out.println();
                    data.sortingASC(); 
                    data.tampil();  
                    break;
                case 4:
                    System.out.println("Data telah diurutkan (DSC) menggunakan Selection Sort.");
                    data.sortingDSC(); 
                    data.tampil();  
                    break;
                case 5:
                    System.out.println("Data telah diurutkan (ASC) menggunakan Insertion Sort.");
                    data.insertionSort();  
                    data.tampil();  
                    break;
                case 6:
                    System.out.print("Masukkan nama dosen yang dicari: ");
                    String cariNama = sc.nextLine();
                    data.pencarianDataSequential19(cariNama);
                    break;
                case 7:
                    System.out.print("Masukkan usia dosen yang dicari: ");
                    int cariUsia = sc.nextInt();
                    data.pencarianDataBinary19(cariUsia);
                    break;
                case 8:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 8);
    }
}
