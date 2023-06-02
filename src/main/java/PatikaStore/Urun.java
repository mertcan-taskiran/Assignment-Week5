package PatikaStore;

public abstract class Urun {
    private int id;
    private String urunAdi;
    private double birimFiyat;
    private String marka;
    private int stokMiktari;
    private double indirimOrani;

    public Urun(int id, String urunAdi, double birimFiyat, String marka, int stokMiktari, double indirimOrani) {
        this.id = id;
        this.urunAdi = urunAdi;
        this.birimFiyat = birimFiyat;
        this.marka = marka;
        this.stokMiktari = stokMiktari;
        this.indirimOrani = indirimOrani;
    }

    public int getId() {
        return id;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public double getBirimFiyat() {
        return birimFiyat;
    }

    public String getMarka() {
        return marka;
    }

    public int getStokMiktari() {
        return stokMiktari;
    }

    public double getIndirimOrani() {
        return indirimOrani;
    }

    public abstract void urunBilgileriGoster();

    public abstract String getUrunGrubu();
}
