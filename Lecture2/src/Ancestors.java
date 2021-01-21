import tester.*;

interface IAT {}

class Unknown implements IAT {
  Unknown() {}
}

class Person implements IAT {
  String name;
  IAT mom;
  IAT dad;
  
  Person(String name, IAT mom, IAT dad) {
    this.name = name;
    this.mom = mom;
    this.dad = dad;
  }
}

class ExamplesPerson {
  ExamplesPerson() {}
  
  IAT unknown = new Unknown();
  IAT mary = new Person("Mary", this.unknown, this.unknown);
  IAT robert = new Person("Robert", this.unknown, this.unknown);
  IAT john = new Person("John", this.unknown, this.unknown);
  IAT jane = new Person("Jane", this.mary, this.robert);
  IAT dan = new Person("Dan", this.jane, this.john);
}