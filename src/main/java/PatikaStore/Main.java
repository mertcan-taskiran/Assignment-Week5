package PatikaStore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Urun> urunler = new ArrayList<>();
    private static List<String> markalar = new ArrayList<>();
    public static void main(String[] args) {

        markalariOlustur();
        Scanner scanner = new Scanner(System.in);
        int secim;

        do {
            menuGoster();
            secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    urunleriListele("Notebook");
                    break;
                case 2:
                    urunleriListele("Cep Telefonu");
                    break;
                case 3:
                    markalariListele();
                    break;
                case 4:
                    urunEkle(scanner);
                    break;
                case 5:
                    urunSil(scanner);
                    break;
                case 0:
                    System.out.println("Çıkış yapılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz seçim! Lütfen tekrar deneyin.");
                    break;
            }
        } while (secim != 0);

        scanner.close();
    }

    public static void markalariOlustur() {
        markalar.add("Samsung");
        markalar.add("Lenovo");
        markalar.add("Apple");
        markalar.add("Huawei");
        markalar.add("Casper");
        markalar.add("Asus");
        markalar.add("HP");
        markalar.add("Xiaomi");
        markalar.add("Monster");
        markalar.sort(String::compareToIgnoreCase);
    }

    // ##### Menulerin Gösterilmesi #####
    public static void menuGoster() {
        System.out.println("===============================");
        System.out.println("PatikaStore Ürün Yönetim Paneli");
        System.out.println("===============================");
        System.out.println("1 - Notebook Listele");
        System.out.println("2 - Cep Telefonu Listele");
        System.out.println("3 - Markaları Listele");
        System.out.println("4 - Ürün Ekle");
        System.out.println("5 - Ürün Sil");
        System.out.println("0 - Çıkış Yap");
        System.out.println("===============================");
        System.out.print("Tercihiniz : ");
    }

    public static void urunleriListele(String urunGrubu) {
        System.out.println(urunGrubu + " Listesi");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | Kamera    | Pil       | RAM       | Renk      |");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");

        boolean urunVarMi = false;
        for (Urun urun : urunler) {
            if (urun.getUrunGrubu().equals(urunGrubu)) {
                urun.urunBilgileriGoster();
                urunVarMi = true;
            }
        }

        if (!urunVarMi) {
            System.out.println("Bu ürün grubunda henüz ürün bulunmamaktadır.");
        }

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("");
    }


    public static void markalariListele() {
        System.out.println("");
        System.out.println("===============================");
        System.out.println("Markalarımız");
        System.out.println("===============================");

        for (String marka : markalar) {
            System.out.println("- " + marka);
        }
    }

    public static void urunEkle(Scanner scanner) {
        System.out.println("Ürün Ekle");
        System.out.println("-----------");
        System.out.println("1 - Notebook");
        System.out.println("2 - Cep Telefonu");
        System.out.print("Seçiminiz: ");
        int secim = scanner.nextInt();

        int id;
        double birimFiyat;
        String marka;
        int stokMiktari;
        double indirimOrani;
        String urunAdi;

        switch (secim){
            case 1:
                System.out.print("ID: ");
                id = scanner.nextInt();
                System.out.print("Ürün Adı: ");
                urunAdi = scanner.next();
                System.out.print("Birim Fiyatı: ");
                birimFiyat = scanner.nextDouble();
                System.out.print("Marka: ");
                marka = scanner.next();
                System.out.print("Stok Miktarı: ");
                stokMiktari = scanner.nextInt();
                System.out.print("İndirim Oranı: ");
                indirimOrani = scanner.nextDouble();
                System.out.print("RAM: ");
                int ram = scanner.nextInt();
                System.out.print("Depolama: ");
                int depolama = scanner.nextInt();
                System.out.print("Ekran Boyutu: ");
                double ekranBoyutu = scanner.nextDouble();

                //add
                urunler.add(new Notebook(id, urunAdi, birimFiyat, marka, stokMiktari, indirimOrani, ram, depolama, ekranBoyutu));
                System.out.println("Notebook başarıyla eklendi.");
                break;

            case 2:
                System.out.print("ID: ");
                id = scanner.nextInt();
                System.out.print("Ürün Adı: ");
                urunAdi = scanner.next();
                System.out.print("Birim Fiyatı: ");
                birimFiyat = scanner.nextDouble();
                System.out.print("Marka: ");
                marka = scanner.next();
                System.out.print("Stok Miktarı: ");
                stokMiktari = scanner.nextInt();
                System.out.print("İndirim Oranı: ");
                indirimOrani = scanner.nextDouble();
                System.out.print("Depolama: ");
                depolama = scanner.nextInt();
                System.out.print("Ekran Boyutu: ");
                ekranBoyutu = scanner.nextDouble();
                System.out.print("Kamera: ");
                int kamera = scanner.nextInt();
                System.out.print("Pil Gücü: ");
                double pilGucu = scanner.nextDouble();
                System.out.print("RAM: ");
                ram = scanner.nextInt();
                System.out.print("Renk: ");
                String renk = scanner.next();

                //add
                urunler.add(new CepTelefonu(id, urunAdi, birimFiyat, marka, stokMiktari, indirimOrani, depolama, ekranBoyutu, kamera, pilGucu, ram, renk));
                System.out.println("Cep Telefonu başarıyla eklendi.");
                break;

            default:
                System.out.println("Geçersiz seçim!");
                break;
        }
    }

    public static void urunSil(Scanner scanner) {
        System.out.print("Silinecek ürünün ID'sini girin: ");
        int id = scanner.nextInt();

        boolean urunSilindi = false;
        for (Urun urun : urunler) {
            if (urun.getId() == id) {
                urunler.remove(urun);
                urunSilindi = true;
                break;
            }
        }

        if (urunSilindi) {
            System.out.println("Ürün başarıyla silindi.");
        } else {
            System.out.println("Belirtilen ID'ye sahip bir ürün bulunamadı.");
        }
    }

}
