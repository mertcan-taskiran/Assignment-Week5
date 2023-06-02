package PatikaStore;

public class Notebook extends Urun{
    private int ram;
    private int depolama;
    private double ekranBoyutu;

    public Notebook(int id, String urunAdi, double birimFiyat, String marka, int stokMiktari, double indirimOrani, int ram, int depolama, double ekranBoyutu) {
        super(id, urunAdi, birimFiyat, marka, stokMiktari, indirimOrani);
        this.ram = ram;
        this.depolama = depolama;
        this.ekranBoyutu = ekranBoyutu;
    }

    public int getRam() {
        return ram;
    }

    public int getDepolama() {
        return depolama;
    }

    public double getEkranBoyutu() {
        return ekranBoyutu;
    }

    @Override
    public void urunBilgileriGoster() {
        System.out.printf("| %-2d | %-28s | %-11.2f TL | %-10s | %-10d | %-9.1f | %-9s | %-9s | %-9d |\n",
                getId(), getUrunAdi(), getBirimFiyat(), getMarka(), getDepolama(), getEkranBoyutu(), "-", "-", getRam());
    }

    @Override
    public String getUrunGrubu() {
        return "Notebook";
    }
}
