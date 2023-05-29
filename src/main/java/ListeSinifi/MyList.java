package org.example;

public class MyList<T> {
    private T[] array;     // Elemanları tutmak için kullanılan dizi
    private int size;      // Dizideki eleman sayısı
    private int capacity;  // Dizinin kapasitesi

    // Boş bir MyList nesnesi oluşturulduğunda varsayılan kapasiteyle bir dizi oluşturulur
    // MyList() : Boş contructor kullanılırsa dizinin başlangıç boyutu 10 olmalıdır.
    public MyList() {
        this(10);
    }

    // Belirtilen kapasiteyle bir MyList nesnesi oluşturulur
    // MyList(int capacity) : Dizinin başlangıç değeri capacity parametresinden alınmalıdır.
    @SuppressWarnings("unchecked")
    public MyList(int capacity) {
        this.array = (T[]) new Object[capacity];
        this.size = 0;
        this.capacity = capacity;
    }

    // size() : dizideki eleman sayısını verir.
    public int size() {
        return size;
    }

    // getCapacity() : dizinin kapasite değerini verir.
    public int getCapacity() {
        return capacity;
    }

    // add(T data) : sınıfa ait diziye eleman eklemek için kullanılmalıdır. Eğer dizide yeteri kadar yer yok ise, dizi boyutu 2 katına çıkartılmalıdır.
    public void add(T data) {
        if (size == capacity) {
            resizeArray();
        }
        array[size] = data;
        size++;
    }

    // Belirtilen indexteki elemanı döndürür, geçersiz bir index verildiğinde null döndürür
    public T get(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        }
        return null;
    }

    // Belirtilen indexteki elemanı siler, silinen elemandan sonraki elemanları sola kaydırır
    public void remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            size--;
        }
    }

    // Belirtilen indexteki elemanı verilen elemanla değiştirir, geçersiz bir index verildiğinde değişiklik yapmaz
    public void set(int index, T data) {
        if (index >= 0 && index < size) {
            array[index] = data;
        }
    }

    // Dizinin elemanlarını "[eleman1, eleman2, ...]" formatında bir string olarak döndürür
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i < size - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    // Dizi kapasitesini iki katına genişletir ve mevcut elemanları yeni diziye kopyalar
    private void resizeArray() {
        capacity *= 2;
        T[] newArray = (T[]) new Object[capacity];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }
}
