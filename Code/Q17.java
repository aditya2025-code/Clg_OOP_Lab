package Code;
// Q17. Runtime Polymorphism (Method Overriding)

class Animal {
    void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("The dog barks: Woof!");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("The cat meows: Meow!");
    }
}

public class Q17 {
    public static void main(String[] args) {
        // Parent references pointing to Child objects (Upcasting)
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        // The JVM decides at runtime which overridden method to execute
        myDog.makeSound(); // Prints: The dog barks: Woof!
        myCat.makeSound(); // Prints: The cat meows: Meow!
    }
}

//OUTPUT:
/*
The dog barks: Woof!
The cat meows: Meow!
*/