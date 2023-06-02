package PatikaStore;

public class CepTelefonu extends Urun {

    private int depolama;
    private double ekranBoyutu;
    private int kamera;
    private double pilGucu;
    private int ram;
    private String renk;

    public CepTelefonu(int id, String urunAdi, double birimFiyat, String marka, int stokMiktari, double indirimOrani, int depolama, double ekranBoyutu, int kamera, double pilGucu, int ram, String renk) {
        super(id, urunAdi, birimFiyat, marka, stokMiktari, indirimOrani);
        this.depolama = depolama;
        this.ekranBoyutu = ekranBoyutu;
        this.kamera = kamera;
        this.pilGucu = pilGucu;
        this.ram = ram;
        this.renk = renk;
    }

    public int getDepolama() {
        return depolama;
    }

    public double getEkranBoyutu() {
        return ekranBoyutu;
    }

    public int getKamera() {
        return kamera;
    }

    public double getPilGucu() {
        return pilGucu;
    }

    public int getRam() {
        return ram;
    }

    public String getRenk() {
        return renk;
    }

    @Override
    public void urunBilgileriGoster() {
        System.out.printf("| %-2d | %-28s | %-9.2f TL | %-9s | %-10d | %-9.1f | %-9d | %-9.1f | %-9d | %-9s |\n",
                getId(), getUrunAdi(), getBirimFiyat(), getMarka(), getDepolama(), getEkranBoyutu(), getKamera(), getPilGucu(), getRam(), getRenk());
    }

    @Override
    public String getUrunGrubu() {
        return "Cep Telefonu";
    }
}
