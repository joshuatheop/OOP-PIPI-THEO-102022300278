class KomputerPremium extends Komputer {
    // To do: Buatlah 1 variable sesuai ketentuan
    protected boolean ruangPrivat;
    // To do: Buatlah constructor pada class KomputerPremium
    public KomputerPremium(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean ruangPrivat ) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.ruangPrivat = ruangPrivat;
    }
    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
    @Override
    public void informasi() {
        super.informasi();
        if (ruangPrivat == true) {
            System.out.println("Status                  : Ruang Premium");
            System.out.println("\nFasilitas Ruang Premium:");
            System.out.println("- AC bang");
            System.out.println("- Tempat duduk gaming");
            System.out.println("- Komputer gacor");
            System.out.println("- Internet pake 100mbps");
        }
        else {
            System.out.println("Status                 : Ruang Standar");
            System.out.println("\nFasilitas Ruang Standar:");
            System.out.println("- Kureng dah");
            System.out.println("- Kursi kayu");
            System.out.println("- Komputer tidak gacor");
            System.out.println("- Internet pake 1mbps");
        }

    }
    // To do: Buatlah method Pesan sesuai dengan ketentuan
    public void Pesan(int nomorKomputer) {
        System.out.println("\nMemesan komputer nomor      : " + nomorKomputer);
    }
    // To do: Buatlah method TambahLayanan sesuai dengan ketentuan
    public void TambahLayanan(String makanan) {
        System.out.println("Menambah layanan makanan    : " + makanan);
    }
    // To do: Buatlah method TambahLayanan memakai Polymorphism Overloading sesuai dengan ketentuan
    public void TambahLayanan(String makanan, String minuman) {
        System.out.println("Menambah layanan makanan    : " + makanan + " dan minuman: " + minuman);
}
}
