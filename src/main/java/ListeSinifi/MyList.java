package ListeSinifi;

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

    public int indexOf(T data) {
        // Veri dizide bulunduğunda, verinin indeksini döndürür.
        // Bulunamazsa -1 döndürür.
        for (int i = 0; i < size; i++) {
            if (array[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data) {
        // Veri dizide bulunduğunda, verinin son indeksini döndürür.
        // Bulunamazsa -1 döndürür.
        for (int i = size - 1; i >= 0; i--) {
            if (array[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        // Liste boş ise true, değilse false döndürür.
        return size == 0;
    }

    public T[] toArray() {
        // Dizideki elemanları aynı sırayla bir dizi haline getirir ve dizi olarak döndürür.
        T[] newArray = (T[]) new Object[size];
        System.arraycopy(array, 0, newArray, 0, size);
        return newArray;
    }

    public void clear() {
        // Listeyi tamamen boşaltır.
        size = 0;
    }

    public MyList<T> subList(int start, int finish) {
        // Belirtilen başlangıç ve bitiş indekslerine ait alt bir liste döndürür.
        // Başlangıç ve bitiş indeksleri geçerli olmalıdır.
        if (start >= 0 && start < size && finish >= 0 && finish < size && start <= finish) {
            MyList<T> sublist = new MyList<>(finish - start + 1);
            for (int i = start; i <= finish; i++) {
                sublist.add(array[i]);
            }
            return sublist;
        }
        return null;
    }

    public boolean contains(T data) {
        // Verinin listede olup olmadığını kontrol eder.
        // Liste içerisinde ise true, değilse false döndürür.
        return indexOf(data) != -1;
    }

}
