class Author {
    String authorName;
    int age;
    String place;
    public Author(String name, int age, String place) {
        this.authorName = name;
        this.age = age;
        this.place = place;
    }
}
class  Book {
    String name;
    int price;
    // author details
    Author author;

    Book(String n, int p, Author author) {
        this.name = n;
        this.price = p;
        this.author = author;
    }
}

public class Aggregation {

    public static void main(String[] args) {
        Author author = new Author("John", 42, "USA");
        Book b = new Book("Java for Beginner", 800, author);
        System.out.println("Book Name: "+b.name);
        System.out.println("Book Price: "+b.price);
        System.out.println("------------Author Details----------");
        System.out.println("Author Name: "+b.author.authorName);
        System.out.println("Author Age: "+b.author.age);
        System.out.println("Author place: "+b.author.place);
    }
}
