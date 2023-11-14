package lab1;

class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println("Calling makeSound() on Animal object:");
        animal.makeSound();

        System.out.println("Calling makeSound() on Dog object:");
        dog.makeSound();

        System.out.println("Calling makeSound() on Cat object:");
        cat.makeSound();
    }
}

