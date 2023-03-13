package HomeWork13March;

public class ObjectsAndClasses {
    public static void main(String[] args) {
        Author dostoevsky = new Author("Fyodor", "Dostoevsky");
        Author lovecraft = new Author("Howard", "Lovecraft");
        Book demons = new Book("Demons", 1872, dostoevsky);
        Book theNamelessCity = new Book("The Nameless City", 1922, lovecraft);
        theNamelessCity.setYear(1921);
    }
}
