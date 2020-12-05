package OOO.abstraction;

/**
 * @author summersweat
 */
public class Dog extends animals {

    @Override
    public void run() {
        System.out.println("quickly");
    }

    @Override
    public void eat() {
        System.out.println("bone");
    }

    @Override
    public void cry() {
        System.out.println("汪汪汪");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.cry();
        dog.eat();
        dog.run();

    }
}
