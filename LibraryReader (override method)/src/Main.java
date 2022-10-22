//import java.awt.print.Book;

public class Main {
    public static void main(String[] args) {
        Reader Man1 = new Reader("Петров И.И.", 1231, "Medecine", "22.11.2003", "+7999333999");
        Reader Man2 = new Reader("Иванов И.И.", 234, "Medecine", "12.01.2004", "+7999333933");
        Reader Man3 = new Reader("Горлув И.И.", 126, "Medecine", "28.06.2002", "+7999333966");
        Reader [] students = {Man1, Man2, Man3};
        String [] randomBooks = {"Энциклопедия", "Роман", "Детектив", "Сказка", "Учебник", "Справочник","Фантастика","Ужасы","Стихи","История"};
        Book book1 = new Book("Три товарища", "Ремарк");
        Book book2 = new Book("Властелин колец", "Толкин");
        Book book3 = new Book("Вар крафт", "без автора");
        Book[] books = {book1, book2, book3};
        for (Reader count : students)
        {
            count.returnBook();
            count.returnBook((int)(Math.random()*10));
            System.out.println(" ");
            count.returnBook(randomBooks[(int)(Math.random()*10)], randomBooks[(int)(Math.random()*10)], randomBooks[(int)(Math.random()*10)],randomBooks[(int)(Math.random()*10)]);
            System.out.println(" ");
            count.returnBook(books);
        };
    }
}


class Reader {
    String fullName = "";
    int libraryCardNumber = 0;
    String faculty = "";
    String dateOfVBirth = "";
    String phoneNumber = "";

    // конструктор Reader
    public Reader(String fullName, int libraryCardNumber, String faculty, String dateOfVBirth, String phoneNumber) {
        this.fullName = fullName;
        this.libraryCardNumber = libraryCardNumber;
        this.faculty = faculty;
        this.dateOfVBirth = dateOfVBirth;
        this.phoneNumber = phoneNumber;
    }

    // добавить и вернуть ФИО
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return this.fullName;
    }

    // добавить и вернуть № билета
    public void setLibraryCardNumber(int libraryCardNumber) {
        this.libraryCardNumber = libraryCardNumber;
    }

    public int getLibraryCardNumber() {
        return this.libraryCardNumber;
    }

    // добавить и вернуть факультет
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getFaculty() {
        return this.faculty;
    }

    // добавить и вернуть дату рождения
    public void setDateOfVBirth(String dateOfVBirth) {
        this.dateOfVBirth = dateOfVBirth;
    }

    public String getDateOfVBirth() {
        return this.dateOfVBirth;
    }

    // добавить и вернуть номер телефона
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }


    // Перегруженные методы takeBook
    void takeBook() {
        System.out.println("Человек взял книги");
    }

    void takeBook(int countBooks) {
        System.out.print(this.fullName + " взял " + countBooks + " книги.");
    }

    void takeBook(String... books) {
        System.out.print(this.fullName + " взял книги: ");
        for (String book : books)
            System.out.print(book + ",");
    }

    void takeBook(Book... books) {
        System.out.println(this.fullName + " взял следующие книги:");
        for (Book count : books) {
            System.out.println(count.name + ", автор - " + count.author);
        }
    }


    // Перегруженные методы returnBook
    void returnBook() {
        System.out.println("Человек отдал книги");
    }

    void returnBook(int countBooks) {
        System.out.print(this.fullName + " отдал " + countBooks + " книги.");
    }

    void returnBook(String... books) {
        System.out.print(this.fullName + " отдал книги: ");
        for (String book : books)
            System.out.print(book + ",");
    }

    void returnBook(Book... books) {
        System.out.println(this.fullName + " вернул следующие книги:");
        for (Book book : books) {
            System.out.println(book.name + ", автор - " + book.author);
        }

    }
}
    class Book {
        String name = "";
        String author = "";

        public Book(String name, String author) {
            this.name = name;
            this.author = author;
        }
    }
