import java.util.Scanner;
public class latihanukl_soal1{


    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);

        // Input data
        System.out.print("Masukkan berat paket (KG): ");
        double berat = input.nextDouble();

        System.out.print("Masukkan jarak tempuh (KM): ");
        double jarak = input.nextDouble();

        System.out.print("Masukkan panjang paket (CM): ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar paket (CM): ");
        double lebar = input.nextDouble();

        System.out.print("Masukkan tinggi paket (CM): ");
        double tinggi = input.nextDouble();

        // Hitung volume
        double volume = panjang * lebar * tinggi;

        // Tentukan biaya per kg berdasarkan jarak
        double biayaPerKg;
        if (jarak <= 10) {
            biayaPerKg = 4250;
        } else {
            biayaPerKg = 6000;
        }

        // Hitung biaya berdasarkan berat dan jarak
        double biayaPengiriman = berat * biayaPerKg;

        // Tambahan biaya volume (kalau lebih dari 100 cm3)
        double biayaVolume = 0;
        if (volume > 100) {
            biayaVolume = 50000;
        }

        // Total biaya
        double totalBiaya = biayaPengiriman + biayaVolume;

        // Output hasil
        System.out.println("RINCIAN BIAYA PENGIRIMAN");
        System.out.println("Volume paket: " + volume + " cm3");
        System.out.println("Biaya berdasarkan berat: Rp " + biayaPengiriman);
        System.out.println("Biaya volume: Rp " + biayaVolume); 
        System.out.println("Total biaya pengiriman: Rp " + totalBiaya);


        //SOAL 2 DI SOAL MUDAH
        System.out.print("masukan bilangan : ");
        int bilangan = input.nextInt();

        if (bilangan % 2 == 0) {
            System.out.println(bilangan + " adalah bilangan genap");
        } else {
            System.out.println(bilangan + " adalah bilangan ganjil");
        }
    }
}