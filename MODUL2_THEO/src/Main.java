public class Main {
    public static void main(String[] args) {

        // To do: Buatlah sebuah Objek baru dari class Komputer
        Komputer komputer = new Komputer(20, "Jaya Abadi", 5000);
        // To do: Panggillah Method Informasi dari class Komputer
        komputer.informasi();

        System.out.println("\n=======================================\n");


        // To do: Buatlah sebuah Objek baru dari class KomputerVIP 
        KomputerVIP komputervip = new KomputerVIP(10, "Jaya Abadi", 7000, false );
        // To do: Panggillah Method Informasi dari class KomputerVIP
        komputervip.informasi();
        // To do: Panggillah Method Login
        komputervip.Login("Theo");
        // To do: Panggillah Method Bermain 2x agar dapat melakukan polymorphism overloading
        komputervip.Bermain(3);
        komputervip.Bermain(3, 50);
        System.out.println("\n=======================================\n");


        // To do: Buatlah sebuah Objek baru dari class KomputerPremium
        KomputerPremium komputerpremium = new KomputerPremium(11, "Jaya Abadi", 10000, false);
        // To do: Panggillah Method Informasi dari class KomputerPremium
        komputerpremium.informasi();
        // To do: Panggillah Method Pesan
        komputerpremium.Pesan(5);
        // To do: Panggillah Method TambahLayanan 2x agar dapat melakukan polymorphism overloading
       komputerpremium.TambahLayanan("Mie Goreng");
       komputerpremium.TambahLayanan("Mie Goreng", "Es Teh");
    }
}