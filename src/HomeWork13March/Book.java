package HomeWork13March;

public class Book {
    private String title;
    private int year;
    private Author authorData;

    public Book(String title, int year, Author authorData) {
        this.title = title;
        this.year = year;
        this.authorData = authorData;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public Author getAuthorData() {
        return authorData;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
