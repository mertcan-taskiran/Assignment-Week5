package KitapSiralayici;

public class Book implements Comparable<Book>{
    private String bookName; // kitap adı
    private int pageCount; // sayfa sayısı
    private String authorName; // yazar
    private String publicationDate; // yayın tarihi

    public Book(String bookName, int pageCount, String authorName, String publicationDate) {
        this.bookName = bookName;
        this.pageCount = pageCount;
        this.authorName = authorName;
        this.publicationDate = publicationDate;
    }

    public String getBookName() {
        return bookName;
    }

    public int getPageCount() {
        return pageCount;
    }

    @Override
    public int compareTo(Book o) {
        // Kitapları isimlerine göre sıralamak için compareTo metodu kullanılır
        return this.bookName.compareTo(o.getBookName());
    }

    @Override
    public String toString() {
        return "Kitap Adı : " + bookName +
                "\t\tSayfa Sayısı : " + pageCount +
                "\t\tYazar : " + authorName +
                "\t\tYayın Tarihi : " + publicationDate;
    }

}
