import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Hello, my friend!");
        System.out.println("I want to make cookies with you, what's your name?");
        String name = myScanner.next();
        System.out.println("Create your password please!!");
        String passwd = myScanner.next();
        Dog dog = new Dog();
        dog.n = "Dog 1";
        dog.a = 43;
        dog.t = false;
        dog.tame();
        ScoobyDoo scooby = new ScoobyDoo();
        scooby.feed();
        CourageTheDog courage = new CourageTheDog();
        courage.scare();
        Person person = new Person(dog);
    }
}

class Dog {
    String n; //The name of the dog
    int a; //The age of the dog
    boolean t; //If the dog is tamed
    Dog() {
        System.out.println("Hello my name is " + n);
        System.out.println("I have " + a + " years old");
        System.out.println("Am I tamed? " + t);
    }
    void tame() {
        t = true;
    }
}

class ScoobyDoo extends Dog {
    ScoobyDoo() {
        n = "Scooby Doo";
        a = 7;
        t = true;
        System.out.println("Hello my name is " + n);
        System.out.println("I have " + a + " years old");
        System.out.println("Am I tamed? " + t);
        System.out.println("I am very happy with Shaggy");
    }
    void feed() {
        System.out.println("MMMMMMM DELICIOUS!!");
    }
}

class CourageTheDog extends Dog {
    CourageTheDog() {
        n = "Courage";
        a = 13;
        t = true;
        System.out.println("Hello my name is " + n);
        System.out.println("I have " + a + " years old");
        System.out.println("Am I tamed? " + t);
        System.out.println("I am very happy with Muriel");
    }
    void scare() {
        System.out.println("Stupid Eustace, you scared me!");
    }
}

class Person {
    Person(Dog dog) {
        System.out.println("I love my dog " + dog.n);
        System.out.println("My dog is " + dog.a + " years old");
        dog.tame();
        System.out.println("Is my dog tamed? " + dog.t);
    }
}
