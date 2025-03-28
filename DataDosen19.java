public class DataDosen19 {
    Dosen19[] dataDosen19 = new Dosen19[10];
    int idx = 0;

    public void tambah(Dosen19 dsn) {
        if (idx < dataDosen19.length) {
            dataDosen19[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    public void tampil() {
        for (int i = 0; i < idx; i++) {
            dataDosen19[i].tampil();
        }
    }
    public void pencarianDataSequential19(String namaCari) {
        boolean ditemukan = false;
        int jumlahDitemukan = 0;
    
        System.out.println("\nHasil Pencarian Nama: " + namaCari);
        for (int i = 0; i < idx; i++) {
            if (dataDosen19[i].nama.equalsIgnoreCase(namaCari)) {
                dataDosen19[i].tampil();
                ditemukan = true;
                jumlahDitemukan++;
            }
        }
        if (!ditemukan) {
            System.out.println("Dosen dengan nama \"" + namaCari + "\" tidak ditemukan.");
        } else if (jumlahDitemukan > 1) {
            System.out.println("Peringatan: Ditemukan lebih dari satu dosen dengan nama \"" + namaCari + "\".");
        }
    }    
    
    // Binary Search berdasarkan usia
    public void pencarianDataBinary19(int usia) {
        sortingASC(); 
        int left = 0, right = idx - 1;
        boolean ditemukan = false;
        int jumlahDitemukan = 0;
    
        System.out.println("\nHasil Pencarian Usia: " + usia);
    
        while (left <= right) {
            int mid = left + (right - left) / 2;
    
            if (dataDosen19[mid].usia == usia) {
                // cari ke kiri dan kanan untuk memastikan semua hasil ditemukan
                int i = mid;
                while (i >= 0 && dataDosen19[i].usia == usia) {
                    System.out.println("Kode: " + dataDosen19[i].kode + ", Nama: " + dataDosen19[i].nama + 
                        ", Jenis Kelamin: " + (dataDosen19[i].jenisKelamin ? "Laki-laki" : "Perempuan") + 
                        ", Usia: " + dataDosen19[i].usia);
                    ditemukan = true;
                    jumlahDitemukan++;
                    i--;
                }
    
                i = mid + 1;
                while (i < idx && dataDosen19[i].usia == usia) {
                    System.out.println("Kode: " + dataDosen19[i].kode + ", Nama: " + dataDosen19[i].nama + 
                        ", Jenis Kelamin: " + (dataDosen19[i].jenisKelamin ? "Laki-laki" : "Perempuan") + 
                        ", Usia: " + dataDosen19[i].usia);
                    jumlahDitemukan++;
                    i++;
                }
                break;
            }
    
            if (dataDosen19[mid].usia < usia) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    
        if (!ditemukan) {
            System.out.println("Dosen dengan usia " + usia + " tidak ditemukan.");
        } else if (jumlahDitemukan > 1) {
            System.out.println("⚠ Peringatan: Ada lebih dari satu dosen dengan usia \"" + usia + "\".");
        }
    }
    
        public void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen19[j].usia > dataDosen19[j + 1].usia) {
                    // Swap
                    Dosen19 temp = dataDosen19[j];
                    dataDosen19[j] = dataDosen19[j + 1];
                    dataDosen19[j + 1] = temp;
                }
            }
        }
        System.out.println("Data telah diurutkan (ASC) menggunakan Bubble Sort.");
    }
    
    // Sorting Usia DSC (Selection Sort)
    public void sortingDSC() {
    for (int i = 0; i < idx - 1; i++) {
        for (int j = 0; j < idx - 1 - i; j++) {
            if (dataDosen19[j].usia < dataDosen19[j + 1].usia) {
                Dosen19 temp = dataDosen19[j];
                dataDosen19[j] = dataDosen19[j + 1];
                dataDosen19[j + 1] = temp;
            }
        }
    }
}

    // Sorting Usia ASC (Insertion Sort)
    public void insertionSort() {
    for (int i = 1; i < idx; i++) {
        Dosen19 key = dataDosen19[i];
        int j = i - 1;
        while (j >= 0 && dataDosen19[j].usia > key.usia) {
            dataDosen19[j + 1] = dataDosen19[j];
            j = j - 1;
        }
        dataDosen19[j + 1] = key;
    }
}
}
