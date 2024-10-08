package pbo.uts_pbo;

public class Barang extends Produk {

    boolean isFragile;

    public Barang(String id, String nama, long harga, int stock, boolean isFragile) {
        super(id, nama, harga, stock);
        this.isFragile = isFragile;
    }

    public Barang() {
        super();
    }

    public boolean getFragile() {
        return this.isFragile;
    }

    public void setFragile(boolean isFragile) {
        this.isFragile = isFragile;
    }

    @Override
    public void view() {
        System.out.println("ID Produk    : " + this.id);
        System.out.println("Nama Produk  : " + this.nama);
        System.out.println("Harga Produk : " + this.harga);
        System.out.println("Stock Produk : " + this.stock);
        System.out.println("Fragile      : " + this.isFragile);
    }

}
