
package pbo.uts_pbo;

public class Produk {
    String id;
    String nama;
    long harga;
    int stock;
    
    public Produk(String id, String nama, long harga, int stock){
        this.id = id;
        this.nama = nama;
        this.harga = harga;
        this.stock = stock;
    }
    
    public Produk(){}
    
    public String getId(){
        return this.id;
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public long getHarga(){
        return this.harga;
    }
    
    public int getStock(){
        return this.stock;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setHarga(long harga){
        this.harga = harga;
    }
    
    public void setStock(int stock){
        this.stock = stock;
    }
    
    public void view(){
        System.out.println("ID Produk    : " + this.id);
        System.out.println("Nama Produk  : " + this.nama);
        System.out.println("Harga Produk : " + this.harga);
        System.out.println("Stock Produk : " + this.stock);
    }
}
