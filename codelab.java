package modul4.src;

import java.util.HashMap;
import java.util.Scanner;

public class codelab {
    public static void main(String[] args) {
        HashMap<String, Integer> inventori = new HashMap<>();
        inventori.put("Pensil", 50);
        inventori.put("Buku", 35);
        inventori.put("Penghapus", 25);

        System.out.println("Inventori awal: " + inventori);

        // Update jumlah pensil
        inventori.put("Pensil", inventori.get("Pensil") + 20);
        
        // Menghapus penghapus dari inventori
        inventori.remove("Penghapus");

        System.out.println("\nInventori setelah update: " + inventori);

        // Mencari barang dalam inventori
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nMasukkan nama barang yang ingin dicari: ");
        String barang = scanner.nextLine();
        scanner.close();

        cariBarang(inventori, barang);
    }

    public static void cariBarang(HashMap<String, Integer> inventori, String barang) {
        if (inventori.containsKey(barang)) {
            System.out.println("\nStok " + barang + " : " + inventori.get(barang) + " unit.");
        } else {
            System.out.println("\nBarang tidak tersedia dalam inventori.");
        }
    }
}
