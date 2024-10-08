package pbo.uts_pbo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Uts_PBO {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
//        NOMOR 1

//        Produk prd1 = new Produk("01", "Kitkat", 4000l, 10);
//        Produk prd2 = new Produk("01", "Kiss", 500l, 10);
//        Produk prd3 = new Produk();
//        
//        prd1.view();
//        System.out.println("------------------------");
//        prd2.view();
//        prd2.setHarga(1000l);
//        prd2.view();
//        System.out.println("------------------------");
//        System.out.print("ID    :");
//        prd3.setId(in.nextLine());
//        System.out.print("Nama  :");
//        prd3.setNama(in.nextLine());
//        System.out.print("Harga :");
//        prd3.setHarga(in.nextLong());
//        System.out.print("Stock :");
//        prd3.setStock(in.nextInt());
//        System.out.println();
//        prd3.view();

//        Makanan mkn = new Makanan("01", "Kitkat", 4000l, 10, "12-10-2024");
//        Barang brg = new Barang();
//        
//        mkn.view();
//        
//        brg.setId("03");
//        brg.setNama("Gelas Kaca");
//        brg.setHarga(15000l);
//        brg.setStock(27);
//        brg.setFragile(true);
//        brg.view();
//        ----------------------------------------------------------------------

//        NOMOR 2 & 3

//        List<Produk> items = new ArrayList<>();
//        items.add(new Makanan("01", "Kitkat", 4000L, 10, "12-10-2024"));
//        items.add(new Makanan("02", "Bonbon", 2000L, 10, "23-08-2024"));
//        items.add(new Barang("03", "Gelas Kaca", 15000, 10, true));
//
//        while (true) {
//            // Tampilkan informasi item dengan for-each
//            for (Produk item : items) {
//                item.view();
//                System.out.println("-----------------------");
//            }
//
//            System.out.println("- Menu -");
//            System.out.println("1. Beli");
//            System.out.println("2. Jual");
//            System.out.println("3. Exit\n");
//            System.out.print("Pilihan: ");
//            int pilihan = in.nextInt();
//
//            if (pilihan == 3) {
//                break; // Keluar dari loop
//            }
//
//            // Tampilkan daftar item
//            System.out.println("Pilih item:");
//            for (int i = 0; i < items.size(); i++) {
//                System.out.println((i + 1) + ". " + items.get(i).getNama());
//            }
//            System.out.print("Pilih nomor item: ");
//            int itemPilihan = in.nextInt() - 1;
//
//            if (itemPilihan < 0 || itemPilihan >= items.size()) {
//                System.out.println("Item tidak valid!");
//                continue;
//            }
//
//            System.out.print("Jumlah: ");
//            int jumlah = in.nextInt();
//
//            Produk selectedItem = items.get(itemPilihan);
//
//            switch (pilihan) {
//                case 1: // Beli
//                    if (selectedItem.getStock() >= jumlah) {
//                        selectedItem.setStock(selectedItem.getStock() - jumlah);
//                    } else {
//                        System.out.println("Stock tidak cukup!");
//                    }
//                    break;
//                case 2: // Jual
//                    selectedItem.setStock(selectedItem.getStock() + jumlah);
//                    break;
//                default:
//                    System.out.println("Pilihan salah!");
//            }
//        }
//        ----------------------------------------------------------------------

        JFrame gui = new JFrame();
        gui.setVisible(true);
    }
            
}

