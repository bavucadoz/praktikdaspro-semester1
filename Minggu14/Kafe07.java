package Minggu14;

public class Kafe07 {
    public static void main (String[]args) {
        Menu("Andi", true, "DISKON50");
    }
    
public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {

    if (isMember) {
        System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
    }

    if (kodePromo.equals("DISKON50")) {
        System.out.println("Selamat! "+namaPelanggan+ " mendapatkan diskon 50% dengan kode promo " + kodePromo);
    } else if (kodePromo.equals("DISKON30")) {
        System.out.println("Selamat! " +namaPelanggan+ " mendapatkan diskon 30% dengan kode promo " + kodePromo);
    } else {
        System.out.println("Kode promo tidak valid: " + kodePromo);
    }
    
    System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam  - Rp. 15,000");
        System.out.println("2. Cappuccino  - Rp. 20,000");
        System.out.println("3. Latte       - Rp. 22,000");
        System.out.println("4. Teh Tarik   - Rp. 12,000");
        System.out.println("5. Roti Bakar  - Rp. 10,000");
        System.out.println("6. Mie Goreng  - Rp. 18,000");
        System.out.println("===========================");
        System.out.println("Silahkan pilih menu yang anda inginkan.");
    }   
}
