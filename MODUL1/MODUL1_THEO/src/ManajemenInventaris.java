// Don't delete any comments below!!!
// Todo : Import Arraylist and Scanner
import java.util.ArrayList;
import java.util.Scanner;


public class ManajemenInventaris {
    // Todo : Create ArrayList of MakananKering (daftarMakananKering) and MakananBasah (daftarMakananBasah) to store items
    ArrayList<String> daftarMakananKering = new ArrayList<>();
    ArrayList<String> daftarMakananBasah = new ArrayList<>();
    public class MakananKering {
        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Brand Makanan
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Masukkan Nama Makanan: ")
            String name = scanner.nextLine();
            
            System.out.println("Masukkan Jumlah Makanan: ")
            int jumlah = scanner.nextInt();

            System.out.println("Masukkan Harga Makanan: ")
            int harga = scanner.nextInt();

            System.out.println("Masukkan Brand Makanan: ")
            int brand = scanner.nextInt();

            scanner.close();
        }

    }
    public class MakananBasah {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.println("Masukkan Nama Makanan: ")
            String name = scanner.nextLine();
            
            System.out.println("Masukkan Jumlah Makanan: ")
            int jumlah = scanner.nextInt();

            System.out.println("Masukkan Harga Makanan: ")
            int harga = scanner.nextInt();

            System.out.println("Masukkan Bahan Makanan: ")
            int bahan = scanner.nextInt();
            
            scanner.close();
        }
    }
    
    public void tambahMakananKering() {
        MakananKering Makanan = new MakananKering(nama, jumlah, harga, brand);
        daftarMakananKering.add(makanan);
        System.out.println("===================================");
        System.out.println("Makanan kering berhasil ditambahkan!");


        // Todo : Create a new object for MakananKering
        
        // Todo : Create Print Notifitaction "Makanan kering berhasil ditambahkan"
        
    }

    public void tambahMakananBasah() {
        MakananBasah Makanan = new MakananBasah(nama, jumlah, harga, behan);
        daftarMakananBasah.add(makanan);
        System.out.println("===================================");
        System.out.println("Makanan basah berhasil ditambahkan!");

        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Bahan Makanan

        // Todo : Create a new object for MakananBasah
        
        // Todo :Create Print Notifitaction "Makanan Basah berhasil ditambahkan"
    }

    public void tampilkanSemuaMakanan() {
        if (daftarMakananKering.isEmpty() && daftarMakananBasah.isEmpty()) {
            System.out.println("==================================");
            System.out.println("Tidak ada Makanan dalam inventaris");
            // Todo : Create Print Notification "Tidak ada makanan disini"
        } else 
            
            // Todo : Create print notification for Makanan Kering 
            for (MakananKering makanan : daftarMakananKering) {
                makanan.tampilkanData();
            }
            
            // Todo : Create print notification for  Makanan Basah
            for (MakananBasah makanan : daftarMakananBasah) {
                makanan.tampilkanData();
            }
            }
        }
    
    }
}
