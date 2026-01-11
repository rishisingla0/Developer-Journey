class Stud {    
    String name;
    int age;
    Stud(String a, int b) {
        name = a;
        age = b;
    }
}

class Book {
    String title;
    String Author;
    double price;
    Book(String t, String a, double p) {
        title = t;
        Author = a;
        price = p;
    }
}
public class constructorDemo {
    public static void main(String[] args) {
        Stud s1 = new Stud("Rishi", 20);
        System.out.println(s1.name + " " + s1.age);
        Book b1 = new Book("JAVA PROGRAMMING", "Rishi", 500);
        System.out.println(b1.title + " by "+b1.Author+" is of price "+b1.price);
    }
}