class Animal {
    String name = "Generic Animal";

    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks: Woof! Woof!");
    }
}

abstract class PaymentProcessor {
    public abstract void processPayment(double amount);

    public void transactionReceipt(double amount) {
        System.out.println("Receipt generated for total amount: $" + amount);
    }
}

class CreditCardProcessor extends PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }

    public void processPayment(double amount, String cardType) {
        System.out.println("Processing " + cardType + " card payment of $" + amount);
    }
}

class PayPalProcessor extends PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}

public class Main {
    public static void main(String[] args) {
        // a) Inheritance and Method Overriding Demonstration
        Animal myAnimal = new Animal();
        myAnimal.makeSound();

        Dog myDog = new Dog();
        myDog.makeSound();

        Animal polymorphicDog = new Dog();
        polymorphicDog.makeSound();

        System.out.println("------------------------------------------------");

        // b) Polymorphism and Abstraction Demonstration
        CreditCardProcessor cc = new CreditCardProcessor();
        cc.processPayment(150.00);
        cc.processPayment(250.00, "Visa");

        System.out.println("------------------------------------------------");

        PaymentProcessor payment1 = new CreditCardProcessor();
        PaymentProcessor payment2 = new PayPalProcessor();

        payment1.processPayment(45.00);
        payment1.transactionReceipt(45.0);
        
        System.out.println("------------------------------------------------");

        payment2.processPayment(89.99);
        payment2.transactionReceipt(89.99);
    }
}
