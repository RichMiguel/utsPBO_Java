
package pbo.uts_pbo;

public class Makanan extends Produk{
    String exp;
    
    public Makanan(String id, String nama, long harga, int stock, String exp){
        super(id, nama, harga, stock);
        this.exp = exp;
    }
    
    public Makanan(){
        super();
    }
    
    public String getExp(){
        return this.exp;
    }
    
    public void setExp(String exp){
        this.exp = exp;
    }
    
    @Override
    public void view(){
        System.out.println("ID Produk    : " + this.id);
        System.out.println("Nama Produk  : " + this.nama);
        System.out.println("Harga Produk : " + this.harga);
        System.out.println("Stock Produk : " + this.stock);
        System.out.println("Exp Produk   : " + this.exp);
    }
}
