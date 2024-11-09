public class Main {
    public static void main(String[] args) {

        Kucing kucing = new Kucing("Momo", 2, "Persia");
        Burung burung = new Burung("Rio", 1, "Hijau");

        System.out.println("Detail Hewan\n");
        kucing.suara();
        kucing.makan();
        kucing.makan("ikan\n");

        burung.suara();
        burung.makan();
        burung.makan("biji-bijian\n");

        kucing.infoHewan();
        burung.infoHewan();
    }
}
