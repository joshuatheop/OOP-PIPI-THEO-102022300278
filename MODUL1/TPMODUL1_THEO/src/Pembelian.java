import java.util.ArrayList;
import java.util.Scanner;

public class Pembelian {
    public static void main(String[] args) {
        ArrayList<Penerbangan> daftarPenerbangan = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Penumpang penumpang = null;
        Penerbangan penerbanganDipilih = null;

        daftarPenerbangan.add(new Penerbangan("GA101", "CGK, Jakarta", "DPS, Bali", 
                                              "06:30", "08:15", 1200000));
        daftarPenerbangan.add(new Penerbangan("QZ202", "SUB, Surabaya", "KNO, Medan", 
                                              "09:00", "11:45", 1350000));

        int pilihan;
        do {
            System.out.println("======= EAD Ticket Booking System =======");
            System.out.println("1. Tampilkan Daftar Penerbangan");
            System.out.println("2. Beli Tiket");
            System.out.println("3. Tampilkan Pesanan Tiket");
            System.out.println("4. Exit");
            System.out.print("Silahkan pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 
            switch (pilihan) {
                case 1:
                    System.out.println("== Daftar Penerbangan ==");
                    for (int i = 0; i < daftarPenerbangan.size(); i++) {
                        daftarPenerbangan.get(i).tampilDaftarPenerbangan(i);
                    }
                    break;

                case 2:
                    if (penumpang == null) {
                        System.out.println("\nSilakan isi data diri anda terlebih dahulu!\n");
                        System.out.print("Masukkan NIK: ");
                        String NIK = scanner.nextLine();
                        System.out.print("Masukkan Nama Depan: ");
                        String namaDepan = scanner.nextLine();
                        System.out.print("Masukkan Nama Belakang: ");
                        String namaBelakang = scanner.nextLine();
                        penumpang = new Penumpang(NIK, namaDepan, namaBelakang);
                        System.out.println("\nTerima Kasih telah Mengisi Data Pelanggan. Silakan Pilih Tiket Penerbangan Yang Tersedia");
                    }

                    System.out.println("\n== Daftar Penerbangan ==");
                    for (int i = 0; i < daftarPenerbangan.size(); i++) {
                        daftarPenerbangan.get(i).tampilDaftarPenerbangan(i);
                    }

                    System.out.print("Pilih nomor penerbangan (ex: 1): ");
                    int nomor = scanner.nextInt() - 1;

                    if (nomor >= 0 && nomor < daftarPenerbangan.size()) {
                        penerbanganDipilih = daftarPenerbangan.get(nomor);
                        System.out.println("\nPemesanan Tiket Berhasil Dilakukan, Cek Pesanan Tiket pada Menu (3)");
                    } else {
                        System.out.println("Nomor penerbangan tidak valid!");
                    }
                    break;

                case 3:
                    if (penerbanganDipilih != null && penumpang != null) {
                        System.out.println("======= Detail Tiket Penerbangan =======");
                        penumpang.tampilDetailPenumpang();
                        System.out.println("Nomor Penerbangan: " + penerbanganDipilih.getNomorPenerbangan());
                        System.out.println("Harga Tiket: Rp." + penerbanganDipilih.getHargaTiket());
                    } else {
                        System.out.println("Pembelian Tiket Tidak Ada");
                    }
                    break;

                case 4:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
                    break;
            }
        } while (pilihan != 4);

        scanner.close();
    }
}
