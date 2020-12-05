package OOO.interfacese;

/**
 * @author summersweat
 */
public class Sparrow implements birds {

    @Override
    public void fly() {
        System.out.println("fly fly");
    }

    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        sparrow.fly();
    }
}
