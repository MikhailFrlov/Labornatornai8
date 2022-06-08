package com.company;

public class Main {

    public static void main(String[] args) {
        Veterinary vet = new Veterinary();
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Булл:", " Ест мясо,", "Дома");
        animals[1] = new Cat("Том:", "Ест корм,", "На улице ");
        animals[2] = new Horse("Мустанг:", "Ест сено,", "В конюшне");

        for (Animal animal : animals) {
            vet.treatAnimal(animal);
        }
    }
}
class Animal {

    String food;
    String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void makeNoise() {
        System.out.println("Шумит");
    }

    public void eat() {
        System.out.println("Ест");
    }

    public void sleep() {
        System.out.println("Спит");
    }
}
class Cat extends Animal {
    String name;
    public Cat(String name, String food, String location) {
        super(food, location);
        this.name = name;
    }

    public void makeNoise() {
        System.out.println("Мяу");
    }

    public void eat() {
        System.out.println("Ест корм");
    }
}
class Dog extends Animal {
    String name;
    public Dog(String name, String food, String location) {
        super(food, location);
        this.name = name;
    }
    public void makeNoise() {
        System.out.println("Гав");
    }
    public void eat() {
        System.out.println("Ест мясо");
    }
}
class Horse extends Animal {
    String name;
    public Horse(String name, String food, String location) {
        super(food, location);
        this.name = name;
    }
    public void makeNoise() {
        System.out.println("Иго-го");
    }
    public void eat() {
        System.out.println("Ест сено");
    }
}
class Veterinary {
    void treatAnimal(Animal animal) {
        System.out.print(animal.food + " ");
        System.out.println(animal.location);

    }
}