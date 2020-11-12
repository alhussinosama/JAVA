package com.company;

public class Main {

    public static void main(String[] args) {
	Animal animal = new Animal( " Animal",1,1,5,5);

	Dog dog = new Dog("Yorkir",8,20,2,4,1,20,"long silky");

	dog.eat(); // this is the inheriting from the animal class the method eat
		dog.walk();
		dog.run();
    }
}
