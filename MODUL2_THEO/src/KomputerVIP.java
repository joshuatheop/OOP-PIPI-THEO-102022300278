class KomputerVIP extends Komputer {
    // To do: Buatlah 1 variable sesuai ketentuan
    protected boolean vipCard;
    // To do: Buatlah constructor pada class KomputerPremium
    public KomputerVIP(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean vipCard ) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.vipCard = vipCard;
    }
    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
    @Override
    public void informasi() {
        super.informasi();
        if (vipCard == true) {
            System.out.println("Status                  : Member VIP");
            System.out.println("\nBenefit Member VIP:");
            System.out.println("- Diskon 100% kalo lu main 24 jam");
            System.out.println("- Gratis Es Teh free refill sampe lu radang");
        }
        else {
            System.out.println("Status                  : Non VIP");
            System.out.println("\nFasilitas Non VIP:");
            System.out.println("- Kureng dah");
        }

    }
    // To do: Buatlah method Pesan sesuai dengan ketentuan
    public void Login(String username) {
        System.out.println("\nLogin dengan username: " + username);
    }
    // To do: Buatlah method TambahLayanan sesuai dengan ketentuan
    public void Bermain(int jam) {
        System.out.println("Bermain selama " + jam);
    }
    // To do: Buatlah method TambahLayanan memakai Polymorphism Overloading sesuai dengan ketentuan
    public void Bermain(int jam, int menit) {
        System.out.println("Nambah billing selama " + jam + " jam " + menit + " menit" );
}
}
    // To do: Buatlah constructor pada class KomputerVIP
    
    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
    
    // To do: Buatlah method Login sesuai dengan ketentuan
    
    // To do: Buatlah method Bermain sesuai dengan ketentuan
    
    // To do: Buatlah method Bermain memakai Polymorphism Overloading sesuai dengan ketentuan
