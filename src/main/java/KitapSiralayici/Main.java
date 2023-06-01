package KitapSiralayici;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // Kitapların isme göre sıralanması için TreeSet kullanılır
        Set<Book> bookSetByName = new TreeSet<>();

        // Kitap nesneleri oluşturulur ve set'e eklenir
        bookSetByName.add(new Book("Harry Potter ve Felsefe Taşı", 223, "J.K. Rowling", "1997"));
        bookSetByName.add(new Book("Harry Potter ve Sırlar Odası", 251, "J.K. Rowling", "1998"));
        bookSetByName.add(new Book("Harry Potter ve Azkaban Tutsağı", 317, "J.K. Rowling", "1999"));
        bookSetByName.add(new Book("Harry Potter ve Ateş Kadehi", 636, "J.K. Rowling", "2000"));
        bookSetByName.add(new Book("Harry Potter ve Zümrüdüanka Yoldaşlığı", 766, "J.K. Rowling", "2003"));

        System.out.println("Kitaplar isme göre sıralandı");
        System.out.println("============================");

        for (Book book : bookSetByName){
            System.out.println(book);
        }

        // Kitapların sayfa sayısına göre sıralanması için TreeSet ve Comparator kullanılır
        Set<Book> bookSetByPageCount = new TreeSet<>(Comparator.comparingInt(Book::getPageCount));
        bookSetByPageCount.addAll(bookSetByName);

        System.out.println("\nKitaplar sayfa sayısına göre sıralandı");
        System.out.println("============================");

        for (Book book : bookSetByPageCount){
            System.out.println(book);
        }
    }
}
