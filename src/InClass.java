// Data Types in Java

// Boolean
//boolean isItDay;

// Number Types
//int numberOfCoins;
//double gpa;

// String
//String name;

// Class Construction
class Book {
  String title;
  Author author;
  int price;
  
  Book(String title,Author author,int price) {
    this.title = title;
    this.author = author;
    this.price = price;
  }
}

class Author {
  String name;
  int yob;
  
  Author(String name, int yob) {
    this.name = name;
    this.yob = yob;
  }
}

// Implementing/Using Classes
class ExampleBooks {
  ExampleBooks() {}
  
  Author jkr = new Author("JK Rowling", 2002);
  Book stone = new Book("Sorcer's Stone", this.jkr, 21);
}