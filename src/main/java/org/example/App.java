package org.example;

public class App {
    public static void main(String[] args){
        Author author1 = new Author("Alexandr", "Pushkin");
        Author author2 = new Author("Lev", "Tolstoy");
        Book book1 = new Book("Первая книга", author1, 1800);
        Book book2 = new Book("Вторая книга", author2, 1999);



        System.out.println("Книга "+ book1.getName() + ", была написана "+ book1.getAuthor().getSurname() + " в " + book1.getYearOfPublication() + " году.");
        System.out.println("Книга "+ book2.getName() + ", была написана "+ book2.getAuthor().getSurname() + " в " + book2.getYearOfPublication() + " году.");


        book2.setYearOfPublication(1234);

        System.out.println("Книга "+ book2.getName() + ", была написана "+ book2.getAuthor().getSurname() + " в " + book2.getYearOfPublication() + " году.");
    }
}
